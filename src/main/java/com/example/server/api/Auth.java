package com.example.server.api;

import com.example.server.Enum.UserType;
import com.example.server.dto.*;


import com.example.server.entity.GiangVien;
import com.example.server.entity.SinhVien;
import com.example.server.security.CustomUserDetailsService;
import com.example.server.security.JwtUtil;
import com.example.server.service.GiangVienService;
import com.example.server.service.SinhVienService;
import jakarta.ws.rs.BadRequestException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class Auth {
    @Autowired
    private final AuthenticationManager authenticationManager;
    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private SinhVienService sinhVienService;
    @Autowired
    private GiangVienService giangVienService;
    @Autowired
    private CustomUserDetailsService customUserDetailsService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping(value = "/sinhvienLogin")
    public ResponseEntity<SinhVienLoginResponseDto> sinhvienLogin(@RequestBody LoginDto loginDto) {
        System.out.println("sinh vien login");
        customUserDetailsService.setUserType(UserType.SINHVIEN);
        try {
            Authentication authentication =
                    authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginDto.getEmail(), loginDto.getPassword()));
            String email = authentication.getName();
            SinhVien sinhVien = sinhVienService.findByEmail(email);
            String token = jwtUtil.createToken(email, UserType.SINHVIEN.toString());
            SinhVienLoginResponseDto loginRes = new SinhVienLoginResponseDto(sinhVien,token);

            return ResponseEntity.ok(loginRes);

        }catch (BadCredentialsException e){
            throw new BadRequestException("Invalid username or password");
//            ErrorRes errorResponse = new ErrorRes(HttpStatus.BAD_REQUEST,"Invalid username or password");
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }catch (Exception e){
            throw new BadRequestException(e.getMessage());
//            ErrorRes errorResponse = new ErrorRes(HttpStatus.BAD_REQUEST, e.getMessage());
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
//        return null;
    }

    @PostMapping(value = "/sinhvienRegister")
    public ResponseEntity<SinhVienLoginResponseDto> sinhvienRegister(
            @RequestBody SinhVienRegisterDto sinhVienRegisterDto
    ) {
        System.out.println("Register");
        SinhVien sinhVien = SinhVien.builder()
                .ten(sinhVienRegisterDto.getTen())
                .email(sinhVienRegisterDto.getEmail())
                .password(passwordEncoder.encode(sinhVienRegisterDto.getPassword()))
                .ngaySinh(sinhVienRegisterDto.getNgaysinh())
                .gioiTinh(sinhVienRegisterDto.getGioitinh())
                .build();
        SinhVien sinhvienSaved = sinhVienService.save(sinhVien);
        String token = jwtUtil.createToken(sinhvienSaved.getEmail(), UserType.SINHVIEN.toString());
        SinhVienLoginResponseDto sinhVienLoginResponseDto = new SinhVienLoginResponseDto(sinhvienSaved, token);
        return ResponseEntity.ok(sinhVienLoginResponseDto);
    }

    @PostMapping(value = "/sinhvienLogout")
    public void sinhvienLogout() {

    }
    @PostMapping(value = "/giangvienLogin")
    public ResponseEntity<GiangVienLoginResponseDto> giangvienLogin(@RequestBody LoginDto loginDto) {
        System.out.println("giang vien login");
        customUserDetailsService.setUserType(UserType.GIANGVIEN);
        try {
            Authentication authentication =
                    authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginDto.getEmail(), loginDto.getPassword()));
            String email = authentication.getName();
            GiangVien giangVien = giangVienService.findByEmail(email);
            String token = jwtUtil.createToken(email, UserType.GIANGVIEN.toString());
            GiangVienLoginResponseDto loginRes = new GiangVienLoginResponseDto(giangVien,token);

            return ResponseEntity.ok(loginRes);

        }catch (BadCredentialsException e){
            throw new BadRequestException("Invalid username or password");
//            ErrorRes errorResponse = new ErrorRes(HttpStatus.BAD_REQUEST,"Invalid username or password");
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }catch (Exception e){
            throw new BadRequestException(e.getMessage());
//            ErrorRes errorResponse = new ErrorRes(HttpStatus.BAD_REQUEST, e.getMessage());
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
//        return null;
    }

    @PostMapping(value = "/giangvienRegister")
    public ResponseEntity<GiangVienLoginResponseDto> giangvienRegister(
            @RequestBody GiangVienRegisterDto giangVienRegisterDto
    ) {
        GiangVien giangVien = GiangVien.builder()
                .ten(giangVienRegisterDto.getTen())
                .email(giangVienRegisterDto.getEmail())
                .password(passwordEncoder.encode(giangVienRegisterDto.getPassword()))
                .ngaySinh(giangVienRegisterDto.getNgaysinh())
                .gioiTinh(giangVienRegisterDto.getGioitinh())
                .luong(giangVienRegisterDto.getLuong())
                .build();
        GiangVien giangvienSaved = giangVienService.save(giangVien);
        String token = jwtUtil.createToken(giangvienSaved.getEmail(), UserType.GIANGVIEN.toString());
        GiangVienLoginResponseDto giangVienLoginResponseDto  = new GiangVienLoginResponseDto(giangVien, token);
        return ResponseEntity.ok(giangVienLoginResponseDto);
    }

    @PostMapping(value = "/giangvienLogout")
    public void giangvienLogout() {
        
    }
}
