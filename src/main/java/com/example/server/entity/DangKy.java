package com.example.server.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table
@Entity(name = "Dangky")
@Data
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
