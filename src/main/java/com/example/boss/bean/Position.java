package com.example.boss.bean;
import javax.persistence.*;

@Table
@Entity
public class Position {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private  Integer id;
  private  String  name;
  private  String cname;
  private  String  size;
  private  String salary;
  private  String  username;
  private  String title;


    public Position() {
    }

    public Position(Integer id, String name, String cname, String size, String salary, String username, String title) {
        this.id = id;
        this.name = name;
        this.cname = cname;
        this.size = size;
        this.salary = salary;
        this.username = username;
        this.title = title;
    }
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cname='" + cname + '\'' +
                ", size='" + size + '\'' +
                ", salary='" + salary + '\'' +
                ", username='" + username + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
