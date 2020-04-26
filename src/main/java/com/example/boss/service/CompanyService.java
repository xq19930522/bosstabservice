package com.example.boss.service;

import com.example.boss.bean.Company;

import java.util.List;

public interface CompanyService {

    Company insert(Company company);


    List<Company>queryAll();


    Company queryAllDetails(Integer id);


}
