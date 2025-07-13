package com.microservices.student.persistence;

import com.microservices.student.entities.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepository extends CrudRepository<Student, Long> {

    //Métodos específicos porque el crudRepository como dice tiene codigo de crud
    @Query("SELECT s FROM Student s WHERE s.courseId = :idCourse")
    List<Student> findAllStudent(Long idCourse);

//    List<Student> findAllByCourseId(Long idCourse);


}
