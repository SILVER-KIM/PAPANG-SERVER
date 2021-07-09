package com.papang.papang.controller;

import com.papang.papang.entity.Perfume;
import com.papang.papang.entity.Perfume_Wish;
import com.papang.papang.entity.UserRecommendation;
import com.papang.papang.entity.Wish;
import com.papang.papang.repository.UserRecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/user_recommend")
public class UserRecommendationController {

    @Autowired
    UserRecommendationRepository ur_repo;

    @GetMapping(value = "/{email}", produces = "application/json; charset=utf-8")
    public UserRecommendation getPerfumeOne(@PathVariable("email") String email){
        return ur_repo.findById(email).orElse(null);
    }

    @PostMapping("/save")
    public UserRecommendation addWish(@RequestBody Map<String, String> map){
        return ur_repo.save(new UserRecommendation(map.get("email"),
                Integer.parseInt(map.get("style")), Integer.parseInt(map.get("flavor1")),
                Integer.parseInt(map.get("flavor2")), Integer.parseInt(map.get("flavor3")),
                map.get("size")));
    }

    @PostMapping("/change_save/{email}")
    public UserRecommendation addWish(@PathVariable("email") String email, @RequestBody Map<String, String> map){
        UserRecommendation ur = ur_repo.findById(email).orElse(null);
        ur.setStyle(Integer.parseInt(map.get("style")));
        ur.setFlavor1(Integer.parseInt(map.get("flavor1")));
        ur.setFlavor2(Integer.parseInt(map.get("flavor2")));
        ur.setFlavor3(Integer.parseInt(map.get("flavor3")));
        ur.setSize(map.get("size"));
        return ur_repo.save(ur);
    }
}
