package com.example.boss.repository;


import com.example.boss.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByPhone(String phone);

    User findByUsername(String username);

    User findByIdAndAndPassword(Integer id, String password);

    User findAllById(Integer id);



}
