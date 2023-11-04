package com.example.server.entity;

import jakarta.persistence.*;

@Table
@Entity(name = "SinhVien")
public class DangKy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 10)
    private int id;

    @ManyToOne
    @JoinColumn(name = "maSinhVien")
    private SinhVien sinhVien;

    @ManyToOne
    @JoinColumn(name = "maLopHocPhan")
    private LopHocPhan lopHocPhan;

    public DangKy() {

    }

    public DangKy(int id) {
        this.id = id;
    }

}
