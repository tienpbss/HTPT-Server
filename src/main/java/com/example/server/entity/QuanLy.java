package com.example.server.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table
@Entity(name = "Quanly")
@Data
public class QuanLy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 10)
    private int id;

    @Column(name = "ten", length = 255)
    private String ten;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "password", length = 255)
    private String password;
    @Column(name = "ngaySinh", length = 255)
    private String ngaySinh;

    @Column(name = "gioiTinh", length = 255)
    private String gioiTinh;

    @ManyToOne
    @JoinColumn(name = "maChiNhanh")
    private ChiNhanh chiNhanh;

    public QuanLy() {

    }

    public QuanLy(int id, String ten, String ngaySinh, String gioiTinh, String email, String password) {
        this.id = id;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.email = email;
        this.password = password;
    }

}
