package com.example.server.dto;

import com.example.server.entity.SinhVien;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SinhVienLoginResponseDto {
    private SinhVien sinhvien;
    private String accessToken;

}
