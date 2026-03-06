package com.xtramiles.college_student_mvn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xtramiles.college_student_mvn.application.service.StudentService;
import com.xtramiles.college_student_mvn.domain.port.StudentRepositoryPort;

@Configuration
public class BeanConfiguration {

    @Bean
    public StudentService studentService(StudentRepositoryPort studentRepositoryPort) {
        return new StudentService(studentRepositoryPort);
    }
}
