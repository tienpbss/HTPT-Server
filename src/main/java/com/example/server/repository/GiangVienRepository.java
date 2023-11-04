package com.example.server.repository;

import com.example.server.entity.GiangVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface GiangVienRepository extends JpaRepository<GiangVien, Integer> {
}
