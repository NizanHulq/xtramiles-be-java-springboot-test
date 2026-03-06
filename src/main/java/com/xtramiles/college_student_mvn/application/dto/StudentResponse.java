package com.xtramiles.college_student_mvn.application.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponse {
    String nomorIndukMahasiswa;
    String namaLengkap;
    int usia;
}
