package com.example.boss.service.impl;

import com.example.boss.bean.Company;
import com.example.boss.repository.CompanyRepository;
import com.example.boss.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceimpl implements CompanyService {
    @Autowired
    CompanyRepository companyRepository;

    @Override
    public Company insert(Company company) {
        company.setCount(company.getCount());
        company.setEmployee(company.getEmployee());
        company.setHot(company.getHot());
        company.setInc(company.getInc());
        company.setLocation(company.getLocation());
        company.setLogo(company.getHot());
        company.setName(company.getName());
        company.setSize(company.getSize());
        company.setType(company.getType());
        return companyRepository.save(company);
    }

    @Override
    public List<Company> queryAll() {
        return companyRepository.findAll();
    }

    @Override
    public Company queryAllDetails(Integer id) {
        return companyRepository.findAllById(id);

    }








}
