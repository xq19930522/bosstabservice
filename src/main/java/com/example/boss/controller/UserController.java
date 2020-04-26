package com.example.boss.controller;

import com.example.boss.bean.User;
import com.example.boss.service.UserService;
import com.example.boss.utils.BackUtils;
import com.example.boss.utils.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/user")
public class UserController {
   @RequestMapping("/index")
    public    Object index(){
       Map<String ,Object>map=new HashMap<>();
       map.put("code",200);
       map.put("msg","部署成功");
        return  map;
    }

    @Autowired
    private UserService userService;

    /**
     * @param servletRequest
     * @return
     */
    @GetMapping(value = "/register")
    public Map<String, Object> register(HttpServletRequest servletRequest) {
        String username = servletRequest.getParameter("username");
        String password =servletRequest.getParameter("password");
        Map<String, Object> map = new HashMap<>();
        if (TextUtils.Isempty(username) || TextUtils.Isempty(password)) {
            map.put("msg", "用户名或者密码不能为空");
            map.put("code", 101);
            return map;
        } else {
            String insertstr = userService.selectuser(username);
            if (insertstr.equals("success")) {
                map.put("msg", "用户已经存在请不要重复注册");
                map.put("code", 100);
                return map;
            } else {
                User user = new User();
                user.setUsername(username);
                user.setPassword(password);
                userService.insert(user);
                map.put("msg", "注册账号成功");
                map.put("code", 200);
                return map;
            }
        }
    }
    /***
     *
     * @param username
     * @param password
     * @return
     *  登录
     *
     */
    @GetMapping(value = "/validlogin")
    public Object validLogin(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        Map<String, Object> map = new HashMap<>();
        if (TextUtils.Isempty(username) || TextUtils.Isempty(password)) {
            map= BackUtils.backmap(100);
        } else {
            String loginstr = userService.validLogin(username, password);
            if (loginstr.equals("success")) {
                map= BackUtils.backmap(200);
            } else {
                map= BackUtils.backmap(101);
            }
        }
        return map;
    }

}
