package com.example.server.dto;

import lombok.Data;

@Data
public class GiangVienRegisterDto {
    private String ten;
    private String email;
    private String password;
    private String ngaysinh;
    private String gioitinh;
    private Integer luong;
}