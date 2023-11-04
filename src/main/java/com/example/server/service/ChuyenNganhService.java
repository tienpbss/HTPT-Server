package com.example.server.service;

import com.example.server.entity.ChiNhanh;
import com.example.server.entity.ChuyenNganh;
import com.example.server.repository.ChuyenNganhRepository;
import com.example.server.service.interF.IChuyenNganhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChuyenNganhService implements IChuyenNganhService {
    @Autowired
    private ChuyenNganhRepository chuyenNganhRepository;

    @Override
    public ChuyenNganh save(ChuyenNganh chuyenNganh) {
        ChuyenNganh _chuyenNganh = new ChuyenNganh();
        _chuyenNganh = chuyenNganhRepository.save(chuyenNganh);

        return _chuyenNganh;
    }

    @Override
    public ChuyenNganh findAndUpdate(ChuyenNganh chuyenNganh) {
        ChuyenNganh _chuyenNganh = new ChuyenNganh();
        _chuyenNganh = chuyenNganhRepository.saveAndFlush(chuyenNganh);

        return _chuyenNganh;
    }

    @Override
    public List<ChuyenNganh> findAll() {
        List<ChuyenNganh> results = new ArrayList<>();
        List<ChuyenNganh> entities = chuyenNganhRepository.findAll();
        for(ChuyenNganh item: entities) {
            results.add(item);
        }

        return results;
    }

    @Override
    public boolean delete(ChuyenNganh chuyenNganh) {
        chuyenNganhRepository.delete(chuyenNganh);

        return true;
    }

}
