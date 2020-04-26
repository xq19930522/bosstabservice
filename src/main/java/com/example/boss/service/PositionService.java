package com.example.boss.service;

import com.example.boss.bean.Position;
import java.util.List;


public interface PositionService {


    Position    insert (Position position );


    List<Position>queryAll();


    Position   querybyid(Integer id);



}
