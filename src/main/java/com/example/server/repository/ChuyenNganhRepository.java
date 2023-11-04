package com.example.server.repository;

import com.example.server.entity.ChuyenNganh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface ChuyenNganhRepository extends JpaRepository<ChuyenNganh, Integer> {
}
