package com.microservice.course.service;

import com.microservice.course.client.IStudentClient;
import com.microservice.course.dto.StudentDTO;
import com.microservice.course.entities.Course;
import com.microservice.course.http.response.StudentByCourseResponse;
import com.microservice.course.persistence.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    ICourseRepository courseRepository;

    //Implementas la conexión al microservicio Student
    @Autowired
    private IStudentClient studentClient;

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }
    
    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    //Conexión con el microservicio Course -> Student (Es la respuesta por parte del microservicio receptor)
    @Override
    public StudentByCourseResponse findStudentsByCourse(Long idCourse) {
        // Consultar el curso
        Course course = courseRepository.findById(idCourse).orElse(new Course());

        //Obtener los estudiantes
        List<StudentDTO> listaStudentsDTO =studentClient.findAllStudentByCourse(idCourse);


        return StudentByCourseResponse.builder()
                .nombreCurso(course.getName())
                .profesor(course.getProfesor())
                .studentDTOList(listaStudentsDTO)
                .build();
    }
}
