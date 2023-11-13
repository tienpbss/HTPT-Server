package com.example.server.dto;

import com.example.server.entity.GiangVien;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GiangVienLoginResponseDto {
    private GiangVien giangvien;
    private String token;
}

