package com.example.server.repository;

import com.example.server.entity.QuanLy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface QuanLyRepository extends JpaRepository<QuanLy, Integer> {
}
