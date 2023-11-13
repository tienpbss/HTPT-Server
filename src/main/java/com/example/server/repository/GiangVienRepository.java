package com.example.server.repository;

import com.example.server.entity.GiangVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface GiangVienRepository extends JpaRepository<GiangVien, Integer> {
    GiangVien findFirstByEmail(String email);
    boolean existsByEmail(String email);
}
