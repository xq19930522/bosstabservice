package com.example.boss.repository;

import com.example.boss.bean.Message;
import com.example.boss.bean.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Integer> {

    Message findAllById(Integer id);



}
