package com.example.boss.controller;
import com.example.boss.bean.Position;
import com.example.boss.service.PositionService;
import com.example.boss.utils.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@RestController
@RequestMapping("/position")
public class PositionController {
    @Autowired
    PositionService   positionService;

    @PostMapping("/addpositioninfo")
    public  Object  addPositionInfo(HttpServletRequest servletRequest){
        String   name=servletRequest.getParameter("name");
        String   cname=servletRequest.getParameter("cname");
        String   size=servletRequest.getParameter("size");
        String   salary=servletRequest.getParameter("salary");
        String   username=servletRequest.getParameter("username");
        String   title=servletRequest.getParameter("title");
        Map<String ,Object>map=new HashMap<>();
        if(TextUtils.Isempty(name)||TextUtils.Isempty(cname)||
                TextUtils.Isempty(size)||TextUtils.Isempty(salary)||TextUtils.Isempty(username)||
                TextUtils.Isempty(title)){
            map.put("msg","职位信息不能为空");
            map.put("code",100);
        }else{
            Position position=new Position();
            position.setUsername(username);
            position.setTitle(title);
            position.setSize(size);
            position.setSalary(salary);
            position.setName(name);
            position.setCname(cname);
            positionService.insert(position);
            map.put("msg","添加职位信息成功");
            map.put("code",200);
        }
        return  map;

    }



  @GetMapping("/getpositioninfo")
  public  Object    getPositioninfo(){
           Map<String ,Object>map=new HashMap<>();
        try{
            List<Position>data=positionService.queryAll();
            if(data!=null&&data.size()!=0){
                map.put("data",data);
                map.put("code",200);
                map.put("msg","获取数据成功");
            }else{
                map.put("code",100);
                map.put("msg","暂时没有数据");
            }
        }catch (Exception e){
            map.put("code",101);
            map.put("msg","服务器异常");
        }
        return  map;
     }


    /**
     * @param id
     * @return
     * 获取公司数据详情
     *
     *
     *
     */

    @GetMapping("/getpositiondetails")
     public  Object  getPositionDetails(@RequestParam(value = "id") Integer id){
        Map<String,Object>map=new HashMap<>();
        try{
            Position position=positionService.querybyid(id);
            if(position!=null){
                map.put("code",200);
                map.put("msg","获取详情数据成功");
                map.put("position",position);
            }else{
                map.put("code",100);
                map.put("msg","没有找打到对应数据");
            }
        }catch (Exception e){
            map.put("code",101);
            map.put("msg","服务器异常");
        }
        return  map;
     }


}
