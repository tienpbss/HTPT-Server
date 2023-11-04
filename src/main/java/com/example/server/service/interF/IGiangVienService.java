package com.example.server.service.interF;

import com.example.server.entity.GiangVien;

import java.util.List;

public interface IGiangVienService {
    List<GiangVien> findAll();
    boolean login(String email, String password);
    boolean logout(String email, String password);
}
