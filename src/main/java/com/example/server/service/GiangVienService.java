package com.example.server.service;

import com.example.server.entity.GiangVien;
import com.example.server.repository.GiangVienRepository;
import com.example.server.service.interF.IGiangVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GiangVienService implements IGiangVienService {
    @Autowired
    private GiangVienRepository giangVienRepository;

    @Override
    public List<GiangVien> findAll() {
        List<GiangVien> results = new ArrayList<>();
        List<GiangVien> entities = giangVienRepository.findAll();
        for(GiangVien item: entities) {
            results.add(item);
        }

        return results;
    }

    @Override
    public boolean login(String email, String password) {

        return true;
    }

    @Override
    public boolean logout(String email, String password) {

        return true;
    }
}
