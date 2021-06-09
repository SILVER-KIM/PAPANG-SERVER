package com.papang.papang.controller;

import com.papang.papang.entity.Satisfaction;
import com.papang.papang.repository.SatisfactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/satisfaction")
public class SatisfactionController {

    @Autowired
    SatisfactionRepository s_repo;

    @PostMapping("/add")
    public Satisfaction addWish(@RequestBody Map<String, String> map){
        return s_repo.save(new Satisfaction(map.get("type"), map.get("text")));
    }
}
