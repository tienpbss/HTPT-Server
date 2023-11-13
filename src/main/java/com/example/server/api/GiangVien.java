package com.example.server.api;

import com.example.server.service.GiangVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/giangvien")
public class GiangVien {
    @Autowired
    GiangVienService giangVienService;
    @GetMapping()
    List<com.example.server.entity.GiangVien> getAll() {
        System.out.println("Get all");
        return giangVienService.findAll();
    }
}
