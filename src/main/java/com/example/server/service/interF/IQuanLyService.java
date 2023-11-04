package com.example.server.service.interF;

import com.example.server.entity.QuanLy;

import java.util.List;

public interface IQuanLyService {
    List<QuanLy> findAll();
    boolean login(String email, String password);
    boolean logout(String email, String password);
}
