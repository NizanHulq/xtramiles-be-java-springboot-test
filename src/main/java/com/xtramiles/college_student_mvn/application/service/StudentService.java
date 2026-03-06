package com.xtramiles.college_student_mvn.application.service;

import java.util.List;
import java.util.Optional;

import com.xtramiles.college_student_mvn.application.dto.CreateStudentRequest;
import com.xtramiles.college_student_mvn.application.dto.StudentResponse;
import com.xtramiles.college_student_mvn.application.dto.UpdateStudentRequest;
import com.xtramiles.college_student_mvn.application.mapper.StudentMapper;
import com.xtramiles.college_student_mvn.domain.model.Student;
import com.xtramiles.college_student_mvn.domain.port.StudentRepositoryPort;

public class StudentService {
    private final StudentRepositoryPort studentRepositoryPort;

    public StudentService(StudentRepositoryPort studentRepositoryPort) {
        this.studentRepositoryPort = studentRepositoryPort;
    }

    public StudentResponse createStudent(CreateStudentRequest request) {
        Student student = StudentMapper.toStudent(request);
        Student savedStudent = studentRepositoryPort.save(student);
        return StudentMapper.toStudentResponse(savedStudent);
    }

    public StudentResponse updateStudent(String id, UpdateStudentRequest request) {
        Optional<Student> existingStudent = studentRepositoryPort.findById(id);
        if (existingStudent.isEmpty()) {
            throw new RuntimeException("Student not found");
        }
        Student student = StudentMapper.toStudent(request);
        Student updatedStudent = studentRepositoryPort.save(student);
        return StudentMapper.toStudentResponse(updatedStudent);
    }

    public void deleteStudent(String id) {
        studentRepositoryPort.deleteById(id);
    }

    public StudentResponse getStudentById(String id) {
        Optional<Student> student = studentRepositoryPort.findById(id);
        if (student.isEmpty()) {
            throw new RuntimeException("Student not found");
        }
        return StudentMapper.toStudentResponse(student.get());
    }

    public List<StudentResponse> getAllStudents() {
        List<Student> students = studentRepositoryPort.findAll();
        return StudentMapper.toStudentResponseList(students);
    }
}   
