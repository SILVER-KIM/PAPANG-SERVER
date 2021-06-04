package com.papang.papang.controller;

import com.papang.papang.entity.Perfume_Wish;
import com.papang.papang.entity.User;
import com.papang.papang.repository.PerfumeWishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/perfume_wish")
public class PerfumeWishController {

    @Autowired
    PerfumeWishRepository pw_repo;

    @GetMapping(value = "/{name}", produces = "application/json; charset=utf-8")
    public Perfume_Wish getPerfumeWish(@PathVariable("name") String name){
        return pw_repo.findById(name).orElse(null);
    }

    @PostMapping("/add_wish/{name}")
    public Perfume_Wish addWishCount(@PathVariable("name") String name, @RequestBody Map<String, String> map){
        Perfume_Wish pw = pw_repo.findById(name).orElse(null);
        pw.setWish_count(Integer.parseInt(map.get("wish_count")));
        return pw_repo.save(pw);
    }

    @PostMapping("/delete_wish/{name}")
    public Perfume_Wish deleteWishCount(@PathVariable("name") String name, @RequestBody Map<String, String> map){
        Perfume_Wish pw = pw_repo.findById(name).orElse(null);
        pw.setWish_count(Integer.parseInt(map.get("wish_count")));
        return pw_repo.save(pw);
    }
}
