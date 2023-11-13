package com.example.server.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class SinhVienRegisterDto {
    private String ten;
    private String email;
    private String password;
    private String ngaysinh;
    private String gioitinh;
}
