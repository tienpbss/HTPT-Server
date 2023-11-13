package com.example.server.service.interF;

import com.example.server.entity.SinhVien;

import java.util.List;

public interface ISinhVienService {
    List<SinhVien> findAll();

    SinhVien findByEmail(String email);

    SinhVien save(SinhVien sinhvien);
    boolean login(String email, String password);
    boolean logout(String email, String password);
}
