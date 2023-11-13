package com.example.server.security;


import com.example.server.Enum.UserType;
import com.example.server.entity.GiangVien;
import com.example.server.entity.NguoiDung;
import com.example.server.entity.SinhVien;
import com.example.server.repository.GiangVienRepository;
import com.example.server.repository.SinhVienRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Data
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private final SinhVienRepository sinhVienRepository;
    @Autowired
    private final GiangVienRepository giangVienRepository;
    private UserType userType;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        System.out.println(userType);
        if (userType == UserType.GIANGVIEN) {
            GiangVien user = giangVienRepository.findFirstByEmail(email);
            List<String> roles = new ArrayList<>();
            roles.add(UserType.GIANGVIEN.toString());
            UserDetails userDetails =
                    org.springframework.security.core.userdetails.User.builder()
                            .username(user.getEmail())
                            .password(user.getPassword())
                            .roles(roles.toArray(new String[0]))
                            .build();
            return userDetails;
        }
        else {
            SinhVien user = sinhVienRepository.findFirstByEmail(email);
            List<String> roles = new ArrayList<>();
            roles.add(UserType.SINHVIEN.toString());
            UserDetails userDetails =
                    org.springframework.security.core.userdetails.User.builder()
                            .username(user.getEmail())
                            .password(user.getPassword())
                            .roles(roles.toArray(new String[0]))
                            .build();
            return userDetails;
        }
    }
}
