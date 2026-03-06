package com.xtramiles.college_student_mvn.domain.model;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    String id;
    String namaDepan;
    String namaBelakang;
    LocalDate tanggalLahir;

    public String getNamaLengkap() {
        return namaDepan + " " + namaBelakang;
    }
    public int getUsia() {
        return LocalDate.now().getYear() - tanggalLahir.getYear();
    }

}
