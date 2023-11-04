package com.example.server.service.interF;

import com.example.server.entity.ChuyenNganh;

import java.util.List;

public interface IChuyenNganhService {
    ChuyenNganh save(ChuyenNganh chuyenNganh);
    boolean delete(ChuyenNganh chuyenNganh);
    List<ChuyenNganh> findAll();
    ChuyenNganh findAndUpdate(ChuyenNganh chuyenNganh);
}
