package com.microservice.course.client;

import com.microservice.course.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//Aquí en el FeignClient tienes que indicar el nombre del microservicio con el que quieras conectar. Recuerda que el nombre está en el application.yml
@FeignClient(name = "msvc-student", url = "localhost:8090/api/student")
public interface IStudentClient {

    @GetMapping("/search-by-course/{idCourse}")
    List<StudentDTO> findAllStudentByCourse(@PathVariable Long idCourse);
}
