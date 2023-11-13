package com.example.server.api;

import com.example.server.entity.SinhVien;
import com.example.server.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sinhvien")
public class Sinhvien {
    @Autowired
    SinhVienService sinhVienService;
    @GetMapping()
    List<SinhVien> getAll() {
        System.out.println("Get all");
        return sinhVienService.findAll();
    }
}
