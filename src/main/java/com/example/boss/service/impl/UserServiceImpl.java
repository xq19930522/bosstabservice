package com.example.boss.service.impl;

import com.example.boss.bean.User;
import com.example.boss.repository.UserRepository;
import com.example.boss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;







@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User insert(User user) {
        user.setUsername(user.getUsername());
        user.setPassword(user.getPassword());
        return userRepository.save(user);
    }

    @Override
    public void delete() {

    }

    @Override
    public String updatePassword(String password, String phone_number) {
        User user = userRepository.findByPhone(phone_number);
        user.setPassword(password);
        userRepository.save(user);
        return "success";
    }

    @Override
    public void updateUsername(String username, String phone_number) {

    }


    /**
     * @param username
     * @return 注册的时候查询是否用户已经存在
     */
    @Override
    public String selectuser(String username) {
        User user = userRepository.findByUsername(username);
        if (user != null) {
            return "success";
        } else {
            return "fail";
        }
    }

    @Override
    public String validLogin(String username, String password) {
        User user = userRepository.findByUsername(username);

        if (user != null) {
            if (user.getPassword().equals(password)) {
                return "success";
            } else {
                return "defeated";
            }
        } else {
            return "fail";
        }

    }


    /**
     *
     * @param id
     * @return
     *
     *
     *
     */
    @Override
    public User querybyid(Integer id) {
        return userRepository.findAllById(id);

    }




    /**
     * @param username
     * @param password
     * @return
     */
    @Override
    public String updatePsw(String username, String password, String newpsw) {
        User user = userRepository.findByUsername(username);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                user.setPassword(newpsw);
                userRepository.save(user);
                return "success";
            } else {
                return "defeated";
            }
        } else {
            return "fail";
        }

    }


    @Override
    public List<User> queryAll() {
        return userRepository.findAll();
    }






}
