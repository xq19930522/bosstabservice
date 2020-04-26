package com.example.boss.controller;
import com.example.boss.bean.Company;
import com.example.boss.service.CompanyService;
import com.example.boss.utils.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;







@RequestMapping("/company")
@RestController
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @RequestMapping("/addcompanyinfo")
    public Object  addcompanyinfo(){
        Map<String ,Object>map=new HashMap<>();
        return  map;
    }

    @RequestMapping("/getcompanyinfo")
    public  Object getcompanyinfo(){
        Map<String ,Object >map=new HashMap<>();
        List<Company>data=companyService.queryAll();
        if(data!=null&&data.size()!=0){
            map.put("code",200);
            map.put("msg","获取数据成功");
            map.put("data",data);

        }else{
            map.put("code",100);
            map.put("msg","暂时没有数据");

        }
        return  map;
    }


    /**
     *
     * @return
     *  根据表里面的头id来查询
     *
     */
    @RequestMapping("/getcompanydetails")
     public    Map<String ,Object>getcompanydetails(@RequestParam(value = "id") Integer id){
         Map<String ,Object>map=new HashMap<>();
         try {
             if (TextUtils.Isempty(String.valueOf(id))) {
                 map.put("msg", "请求参会id不能为空");
                 map.put("code", 101);
             }else{
                 Company company=companyService.queryAllDetails(id);
                 if(company!=null){
                     map.put("code",200);
                     map.put("msg","获取数据成功");
                     map.put("data",company);
                 }else {
                     map.put("code",101);
                     map.put("msg","没有找对应的数据");
                 }
             }
         }catch (Exception e){
             map.put("cdoe",100);
             map.put("msg","服务器异常");
         }
         return map;
     }





}
