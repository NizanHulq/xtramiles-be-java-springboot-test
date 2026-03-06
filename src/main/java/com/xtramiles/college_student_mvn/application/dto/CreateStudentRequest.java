package com.xtramiles.college_student_mvn.application.dto;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateStudentRequest {
    String id;
    String namaDepan;
    String namaBelakang;
    LocalDate tanggalLahir;
}
