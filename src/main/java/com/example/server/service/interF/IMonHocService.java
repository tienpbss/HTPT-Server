package com.example.server.service.interF;

import com.example.server.entity.ChuyenNganh;
import com.example.server.entity.MonHoc;

import java.util.List;

public interface IMonHocService {
    MonHoc save(MonHoc monHoc, ChuyenNganh chuyenNganh);
    boolean delete(MonHoc monHoc);
    List<MonHoc> findAll();
    MonHoc findAndUpdate(MonHoc monHoc);
}
