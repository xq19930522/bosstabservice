package com.example.boss.service.impl;

import com.example.boss.bean.Message;
import com.example.boss.repository.MessageRepository;
import com.example.boss.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MeaasageServiceimpl implements MessageService {

    @Autowired
    MessageRepository repository;


    /**
     *
     *  获取所有消息数据
     * 、
     * @return
     */

    @Override
    public List<Message> queryAll() {
        return repository.findAll();

    }


    /**
     *  添加message消息数据
     * @param message
     * @return
     */
    @Override
    public Message insert(Message message) {
        message.setHeadportraiturl(message.getHeadportraiturl());
        message.setMsg(message.getMsg());
        message.setCompanyname(message.getCompanyname());
        message.setJobname(message.getJobname());
        message.setNickname(message.getNickname());
        return repository.save(message);
    }








}
