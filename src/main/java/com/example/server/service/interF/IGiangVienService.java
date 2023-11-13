package com.example.server.service.interF;

import com.example.server.entity.GiangVien;
import com.example.server.entity.SinhVien;

import java.util.List;

public interface IGiangVienService {
    List<GiangVien> findAll();

    GiangVien findByEmail(String email);

    GiangVien save(GiangVien giangvien);
    boolean login(String email, String password);
    boolean logout(String email, String password);
}
