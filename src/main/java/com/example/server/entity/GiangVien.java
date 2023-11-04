package com.example.server.entity;

import jakarta.persistence.*;

import java.util.List;

@Table
@Entity(name = "GiangVien")
public class GiangVien {
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

    @Column(name = "luong", length = 255)
    private int luong;

    @ManyToOne
    @JoinColumn(name = "maChiNhanh")
    private ChiNhanh chiNhanh;

    @OneToMany(mappedBy = "giangVien", cascade = CascadeType.ALL)
    private List<LichHoc> lichHoc;

    public GiangVien() {

    }

    public GiangVien(int id) {

    }

    public GiangVien(int id, String ten, String ngaySinh, String gioiTinh, int luong, String email, String password) {
        this.id = id;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.luong = luong;
        this.email = email;
        this.password = password;
    }

}
