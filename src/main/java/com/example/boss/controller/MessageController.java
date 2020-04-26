package com.example.boss.controller;


import com.example.boss.bean.Message;
import com.example.boss.service.MessageService;
import com.example.boss.utils.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;








@RestController
@RequestMapping("/message")
public class MessageController {
    private  String  msg;
    private  String jobname;
    private  String companyname;
    private  String nickname;
    private  String headportraiturl;


    @Autowired
    MessageService messageService;


    @RequestMapping("/addmessageinfo")
    public   Object  addMessageinfo(HttpServletRequest servletRequest){
        String   msg=servletRequest.getParameter("msg");
        String   jobname=servletRequest.getParameter("jobname");
        String   companyname=servletRequest.getParameter("companyname");
        String   nickname=servletRequest.getParameter("nickname");
        String   headportraiturl=servletRequest.getParameter("headportraiturl");
        Map<String,Object> map=new HashMap<>();
        if(TextUtils.Isempty(msg)||TextUtils.Isempty(jobname)||
                TextUtils.Isempty(companyname)||TextUtils.Isempty(nickname)
                ||TextUtils.Isempty(headportraiturl)){
            map.put("code",100);
            map.put("msg","请求参数不能为空");
        }else{
            Message message=new Message();
            message.setJobname(jobname);
            message.setCompanyname(companyname);
            message.setMsg(msg);
            message.setHeadportraiturl(headportraiturl);
            message.setNickname(nickname);
            messageService.insert(message);
            map.put("code",200);
            map.put("msg","添加数据成功");
        }
        return  map;
    }


     @RequestMapping("/getmessageinfo")
    public   Object getmessageinfo(){
        Map<String,Object>map=new HashMap<>();
         List<Message>data=messageService.queryAll();
         if(data!=null&data.size()!=0){
             map.put("code",200);
             map.put("msg","获取数据成功");
             map.put("data",data);
         }else{
             map.put("code",100);
             map.put("msg","暂时没有数据");
         }
          return  map;
    }

}
