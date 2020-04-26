package com.example.boss.bean;


import javax.persistence.*;

@Table
@Entity
public class Message {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    private  String  msg;
    private  String jobname;
    private  String companyname;
    private  String nickname;
    private  String headportraiturl;



    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public String getMsg() {
        return msg;
    }


    public String getHeadportraiturl() {
        return headportraiturl;
    }

    public void setHeadportraiturl(String headportraiturl) {
        this.headportraiturl = headportraiturl;
    }



    public String getJobname() {
        return jobname;
    }

    public String getCompanyname() {
        return companyname;
    }

    public String getNickname() {
        return nickname;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }
}
