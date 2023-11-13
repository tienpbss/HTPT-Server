package com.example.server.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table
@Entity(name = "ChuyenNganh")
@Data
public class ChuyenNganh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 10)
    private int id;

    @Column(name = "ten", length = 255)
    private String ten;

    @OneToMany(mappedBy = "chuyenNganh", cascade = CascadeType.ALL)
    private List<MonHoc> monHoc;

    @OneToMany(mappedBy = "chuyenNganh", cascade = CascadeType.ALL)
    private List<SinhVien> sinhVien;

    public ChuyenNganh() {

    }

    public ChuyenNganh(int id) {

    }

    public ChuyenNganh(int id, String ten) {
        this.id = id;
        this.ten = ten;
    }

}
