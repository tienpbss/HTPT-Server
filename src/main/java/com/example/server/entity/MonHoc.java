package com.example.server.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table
@Entity(name = "MonHoc")
@Data
public class MonHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 10)
    private int id;

    @Column(name = "ten", length = 255)
    private String ten;

    @Column(name = "soTc", length = 10)
    private int soTc;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "maChuyenNganh")
    private ChuyenNganh chuyenNganh;

    @OneToMany(mappedBy = "monHoc", cascade = CascadeType.ALL)
    private List<LopHocPhan> lopHocPhan;

    public MonHoc() {

    }

    public MonHoc(int id) {

    }

    public MonHoc(int id, String ten, int soTc, ChuyenNganh chuyenNganh) {
        this.id = id;
        this.ten = ten;
        this.soTc = soTc;
        this.chuyenNganh = chuyenNganh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoTc() {
        return soTc;
    }

    public void setSoTc(int soTc) {
        this.soTc = soTc;
    }

    public ChuyenNganh getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(ChuyenNganh chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public List<LopHocPhan> getLopHocPhan() {
        return lopHocPhan;
    }

    public void setLopHocPhan(List<LopHocPhan> lopHocPhan) {
        this.lopHocPhan = lopHocPhan;
    }
}
