package com.example.boss.repository;

import com.example.boss.bean.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Integer> {

    Company findAllById(Integer id);




}
