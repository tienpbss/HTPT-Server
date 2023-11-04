package com.example.server.entity;

import jakarta.persistence.*;

import java.util.List;

@Table
@Entity(name = "LopHocPhan")
public class LopHocPhan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 10)
    private int id;

    @Column(name = "svToiDa", length = 10)
    private int svToiDa;
    @Column(name = "namHoc", length = 255)
    private String namHoc;

    @Column(name = "hocKy", length = 10)
    private int hocKy;

    @ManyToOne
    @JoinColumn(name = "maChiNhanh")
    private ChiNhanh chiNhanh;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "maMonHoc")
    private MonHoc monHoc;

    @OneToMany(mappedBy = "lopHocPhan", cascade = CascadeType.ALL)
    private List<DangKy> dangKy;

    @OneToMany(mappedBy = "lopHocPhan", cascade = CascadeType.ALL)
    private List<LichHoc> lichHoc;

    public LopHocPhan() {

    }

    public LopHocPhan(int id) {

    }

    public LopHocPhan(int id, int svToiDa, String namHoc, int hocKy) {
        this.id = id;
        this.svToiDa = svToiDa;
        this.namHoc = namHoc;
        this.hocKy = hocKy;
    }

}
