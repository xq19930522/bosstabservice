package com.example.boss.service;

import com.example.boss.bean.Message;

import java.util.List;

public interface MessageService {


    List<Message>queryAll();

    Message insert(Message message);

    


}
