package com.example.boss.repository;


import com.example.boss.bean.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Integer> {

   Position findAllById(Integer id);


}
