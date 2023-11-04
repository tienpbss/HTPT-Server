package com.example.server.service;

import com.example.server.entity.ChuyenNganh;
import com.example.server.entity.MonHoc;
import com.example.server.repository.MonHocRepository;
import com.example.server.service.interF.IMonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MonHocService implements IMonHocService {
    @Autowired
    private MonHocRepository monHocRepository;

    @Override
    public MonHoc save(MonHoc monHoc, ChuyenNganh chuyenNganh) {
        MonHoc _monHoc = new MonHoc();
        _monHoc = monHocRepository.save(monHoc);

        return _monHoc;
    }

    @Override
    public MonHoc findAndUpdate(MonHoc monHoc) {
        MonHoc _monHoc = new MonHoc();
        _monHoc = monHocRepository.saveAndFlush(monHoc);

        return _monHoc;
    }

    @Override
    public List<MonHoc> findAll() {
        List<MonHoc> results = new ArrayList<>();
        List<MonHoc> entities = monHocRepository.findAll();
        for(MonHoc item: entities) {
            results.add(item);
        }

        return results;
    }

    @Override
    public boolean delete(MonHoc monHoc) {
        monHocRepository.delete(monHoc);

        return true;
    }

}
