package com.example.server.repository;

import com.example.server.entity.ChiNhanh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
@Repository
public interface ChiNhanhRepository extends JpaRepository<ChiNhanh, Integer> {
}
