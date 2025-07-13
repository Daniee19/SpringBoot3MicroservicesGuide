package com.microservice.course.http.response;

import com.microservice.course.dto.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Es la respuesta que se le va a dar al microservicio de Curso cuando se quiera conectar con el microservicio de Estudiante
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentByCourseResponse {
    private String nombreCurso;
    private String profesor;
    private List<StudentDTO> studentDTOList;
}
