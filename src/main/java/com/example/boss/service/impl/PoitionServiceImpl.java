package com.example.boss.service.impl;
import com.example.boss.bean.Position;
import com.example.boss.repository.PositionRepository;
import com.example.boss.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class PoitionServiceImpl implements PositionService {

    @Autowired
    PositionRepository positionRepository;

    @Override
    public Position insert(Position position) {
        position.setCname(position.getCname());
        position.setName(position.getName());
        position.setSalary(position.getSalary());
        position.setSize(position.getSize());
        position.setTitle(position.getTitle());
        position.setUsername(position.getUsername());
        return positionRepository.save(position);
    }

    @Override
    public List<Position> queryAll() {
        return positionRepository.findAll();
    }




    /***
     * @param id
     * @return
     */
    @Override
    public Position querybyid(Integer id) {
        return positionRepository.findAllById(id);
    }



}
