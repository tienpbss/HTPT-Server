package com.example.server.service;

import com.example.server.entity.ChiNhanh;
import com.example.server.repository.ChiNhanhRepository;
import com.example.server.service.interF.IChiNhanhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChiNhanhService implements IChiNhanhService {
    @Autowired
    private ChiNhanhRepository chiNhanhRepository;

    @Override
    public List<ChiNhanh> findAll() {
        List<ChiNhanh> results = new ArrayList<>();
        List<ChiNhanh> entities = chiNhanhRepository.findAll();
        for(ChiNhanh item: entities) {
            results.add(item);
        }

        return results;
    }
}
