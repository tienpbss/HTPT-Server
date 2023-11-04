package com.example.server.service;

import com.example.server.entity.QuanLy;
import com.example.server.repository.QuanLyRepository;
import com.example.server.service.interF.IQuanLyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuanLyService implements IQuanLyService {
    @Autowired
    private QuanLyRepository quanLyRepository;

    @Override
    public List<QuanLy> findAll() {
        List<QuanLy> results = new ArrayList<>();
        List<QuanLy> entities = quanLyRepository.findAll();
        for(QuanLy item: entities) {
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
