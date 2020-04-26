package com.example.boss.utils;
import java.util.HashMap;
import java.util.Map;




public class BackUtils {

    public static  Map<String ,Object>backmap(Map<String , Object> map, int  code){
        Map<String ,Object>hashmap=new HashMap<>();
        if(code==100){
            hashmap.put("code",code);
            hashmap.put("msg","账号密码不能为空");
        }else  if(code ==200){
            hashmap.put("code",code);
            hashmap.put("msg","登录成功");
        }else  if(code==101){
            hashmap.put("cdoe",code);
            hashmap.put("msg","用户名或者密码错误");

        }
        hashmap.putAll(map);
       return  hashmap;

    }



    public static  Map<String ,Object>backmap(int  code){
        Map<String ,Object>hashmap=new HashMap<>();
        if(code==100){
            hashmap.put("code",code);
            hashmap.put("msg","账号密码不能为空");
        }else  if(code ==200){
            hashmap.put("code",code);
            hashmap.put("msg","登录成功");
        }else  if(code==101){
            hashmap.put("cdoe",code);
            hashmap.put("msg","用户名或者密码错误");
        }
        return  hashmap;
    }




}
