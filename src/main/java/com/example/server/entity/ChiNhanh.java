package com.example.server.entity;

import jakarta.persistence.*;

import java.util.List;

@Table
@Entity(name = "ChiNhanh")
public class ChiNhanh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ten")
    private String ten;

    @OneToMany(mappedBy = "chiNhanh", cascade = CascadeType.ALL)
    private List<QuanLy> quanLy;

    @OneToMany(mappedBy = "chiNhanh", cascade = CascadeType.ALL)
    private List<GiangVien> giangVien;

    @OneToMany(mappedBy = "chiNhanh", cascade = CascadeType.ALL)
    private List<SinhVien> sinhVien;

    @OneToMany(mappedBy = "chiNhanh", cascade = CascadeType.ALL)
    private List<LopHocPhan> lopHocPhan;

    public ChiNhanh() {

    }

    public ChiNhanh(int id) {

    }

    public ChiNhanh(int id, String ten) {
        this.id = id;
        this.ten = ten;
    }

}
