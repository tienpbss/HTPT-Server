package com.example.server.repository;

import com.example.server.entity.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface SinhVienRepository extends JpaRepository<SinhVien, Integer> {
    SinhVien findFirstByEmail(String email);
    boolean existsByEmail(String email);
}
