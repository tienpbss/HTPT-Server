package com.example.server.repository;

import com.example.server.entity.MonHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface MonHocRepository extends JpaRepository<MonHoc, Integer> {
}
