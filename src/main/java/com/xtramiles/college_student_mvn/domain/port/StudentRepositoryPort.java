package com.xtramiles.college_student_mvn.domain.port;

import java.util.List;
import java.util.Optional;

import com.xtramiles.college_student_mvn.domain.model.Student;

public interface StudentRepositoryPort {
    Optional<Student> findById(String id);
    List<Student> findAll();
    Student save(Student student);
    void deleteById(String id);
}
