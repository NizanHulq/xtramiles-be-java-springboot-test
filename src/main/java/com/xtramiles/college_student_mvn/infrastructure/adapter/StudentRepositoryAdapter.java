package com.xtramiles.college_student_mvn.infrastructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.xtramiles.college_student_mvn.domain.model.Student;
import com.xtramiles.college_student_mvn.domain.port.StudentRepositoryPort;
import com.xtramiles.college_student_mvn.infrastructure.entity.StudentEntity;
import com.xtramiles.college_student_mvn.infrastructure.mapper.StudentEntityMapper;
import com.xtramiles.college_student_mvn.infrastructure.repository.StudentJpaRepository;

@Component
public class StudentRepositoryAdapter implements StudentRepositoryPort {
    private final StudentJpaRepository studentJpaRepository;

    public StudentRepositoryAdapter(StudentJpaRepository studentJpaRepository) {
        this.studentJpaRepository = studentJpaRepository;
    }

    @Override
    public Optional<Student> findById(String id) {
        return studentJpaRepository.findById(id)
                .map(StudentEntityMapper::toStudent);
    }

    @Override
    public List<Student> findAll() {
        return studentJpaRepository.findAll()
                .stream()
                .map(StudentEntityMapper::toStudent)
                .toList();
    }

    @Override
    public Student save(Student student) {
        StudentEntity entity = StudentEntityMapper.toStudentEntity(student);
        StudentEntity savedEntity = studentJpaRepository.save(entity);
        return StudentEntityMapper.toStudent(savedEntity);
    }

    @Override
    public void deleteById(String id) {
        studentJpaRepository.deleteById(id);
    }
}
