package com.xtramiles.college_student_mvn.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xtramiles.college_student_mvn.infrastructure.entity.StudentEntity;

public interface StudentJpaRepository extends JpaRepository<StudentEntity, String> {

}
