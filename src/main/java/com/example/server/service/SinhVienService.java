package com.example.server.service;

import com.example.server.entity.GiangVien;
import com.example.server.entity.SinhVien;
import com.example.server.repository.GiangVienRepository;
import com.example.server.repository.SinhVienRepository;
import com.example.server.service.interF.IGiangVienService;
import com.example.server.service.interF.ISinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SinhVienService implements ISinhVienService {
    @Autowired
    private SinhVienRepository sinhVienRepository;

    @Override
    public List<SinhVien> findAll() {
        List<SinhVien> results = new ArrayList<>();
        List<SinhVien> entities = sinhVienRepository.findAll();
        for(SinhVien item: entities) {
            results.add(item);
        }
        return results;
    }

    @Override
    public SinhVien findByEmail(String email) {
        return sinhVienRepository.findFirstByEmail(email);
    }

    @Override
    public SinhVien save(SinhVien sinhvien) {
        return sinhVienRepository.save(sinhvien);
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
