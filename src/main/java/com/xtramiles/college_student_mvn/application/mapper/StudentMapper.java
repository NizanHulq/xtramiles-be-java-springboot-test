package com.xtramiles.college_student_mvn.application.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.xtramiles.college_student_mvn.application.dto.CreateStudentRequest;
import com.xtramiles.college_student_mvn.application.dto.StudentResponse;
import com.xtramiles.college_student_mvn.application.dto.UpdateStudentRequest;
import com.xtramiles.college_student_mvn.domain.model.Student;

public class StudentMapper {
    public static Student toStudent(CreateStudentRequest request) {
        return Student.builder()
                .id(request.getId())
                .namaDepan(request.getNamaDepan())
                .namaBelakang(request.getNamaBelakang())
                .tanggalLahir(request.getTanggalLahir())
                .build();
    }

    public static Student toStudent(UpdateStudentRequest request) {
        return Student.builder()
                .id(request.getId())
                .namaDepan(request.getNamaDepan())
                .namaBelakang(request.getNamaBelakang())
                .tanggalLahir(request.getTanggalLahir())
                .build();
    }
    
    public static StudentResponse toStudentResponse(Student student) {
        return StudentResponse.builder()
                .nomorIndukMahasiswa(student.getId())
                .namaLengkap(student.getNamaLengkap())
                .usia(student.getUsia())
                .build();
    }

    public static List<StudentResponse> toStudentResponseList(List<Student> students) {
        return students.stream()
                .map(StudentMapper::toStudentResponse)
                .collect(Collectors.toList());
    }
}
