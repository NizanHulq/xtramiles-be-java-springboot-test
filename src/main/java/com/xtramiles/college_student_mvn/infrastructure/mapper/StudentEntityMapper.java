package com.xtramiles.college_student_mvn.infrastructure.mapper;

import com.xtramiles.college_student_mvn.domain.model.Student;
import com.xtramiles.college_student_mvn.infrastructure.entity.StudentEntity;

public class StudentEntityMapper {
    public static StudentEntity toStudentEntity(Student student) {
        return StudentEntity.builder()
                .id(student.getId())
                .namaDepan(student.getNamaDepan())
                .namaBelakang(student.getNamaBelakang())
                .tanggalLahir(student.getTanggalLahir())
                .build();
    }

    public static Student toStudent(StudentEntity entity) {
        return Student.builder()
                .id(entity.getId())
                .namaDepan(entity.getNamaDepan())
                .namaBelakang(entity.getNamaBelakang())
                .tanggalLahir(entity.getTanggalLahir())
                .build();
    }
}
