package com.example.server.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table
@Entity(name = "SinhVien")
@Data
@AllArgsConstructor
@Builder
public class SinhVien{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 10)
    private int id;

    @Column(name = "ten", length = 255)
    private String ten;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "password", length = 255)
//    @JsonIgnore
    private String password;
    @Column(name = "ngaySinh", length = 255)
    private String ngaySinh;

    @Column(name = "gioiTinh", length = 255)
    private String gioiTinh;

    @ManyToOne
    @JoinColumn(name = "maChiNhanh")
    private ChiNhanh chiNhanh;

    @ManyToOne
    @JoinColumn(name = "maChuyenNganh")
    private ChuyenNganh chuyenNganh;

    @OneToMany(mappedBy = "sinhVien", cascade = CascadeType.ALL)
    private List<DangKy> dangKy;

    public SinhVien() {

    }

    public SinhVien(int id) {

    }

    public SinhVien(String ten, String ngaySinh, String gioiTinh, String email, String password) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.email = email;
        this.password = password;
    }

}