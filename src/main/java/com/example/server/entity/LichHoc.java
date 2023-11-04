package com.example.server.entity;

import jakarta.persistence.*;

@Table
@Entity(name = "LichHoc")
public class LichHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 10)
    private int id;

    @Column(name = "thu", length = 10)
    private int thu;
    @Column(name = "kip", length = 10)
    private int kip;

    @Column(name = "phong", length = 255)
    private String phong;

    @ManyToOne
    @JoinColumn(name = "maGiangVien")
    private GiangVien giangVien;

    @ManyToOne
    @JoinColumn(name = "maLopHocPhan")
    private LopHocPhan lopHocPhan;

    public LichHoc() {

    }

    public LichHoc(int id, int thu, int kip, String phong) {
        this.id = id;
        this.thu = thu;
        this.kip = kip;
        this.phong = phong;
    }

}
