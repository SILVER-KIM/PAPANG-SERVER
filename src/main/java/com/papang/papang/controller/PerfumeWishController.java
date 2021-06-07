package com.papang.papang.controller;

import com.papang.papang.entity.Perfume;
import com.papang.papang.entity.Perfume_Wish;
import com.papang.papang.entity.User;
import com.papang.papang.repository.PerfumeWishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/perfume_wish")
public class PerfumeWishController {

    @Autowired
    PerfumeWishRepository pw_repo;

    @GetMapping(value = "/{name}/{brand}", produces = "application/json; charset=utf-8")
    public Perfume_Wish getPerfumeWish(@PathVariable("name") String name, @PathVariable("brand") String brand){
        return pw_repo.findPerfumeList(name, brand);
    }

    @GetMapping(value = "/search/{word}", produces = "application/json; charset=utf-8")
    public List<Perfume_Wish> getSearchPerfume(@PathVariable("word") String word){
        return pw_repo.findByWord(word);
    }

    @PostMapping("/add_wish/{name}/{brand}")
    public Perfume_Wish addWishCount(@PathVariable("name") String name, @PathVariable("brand") String brand, @RequestBody Map<String, String> map){
        Perfume_Wish pw = pw_repo.findPerfumeList(name, brand);
        pw.setWish_count(Integer.parseInt(map.get("wish_count")));
        return pw_repo.save(pw);
    }

    @PostMapping("/delete_wish/{name}/{brand}")
    public Perfume_Wish deleteWishCount(@PathVariable("name") String name, @PathVariable("brand") String brand, @RequestBody Map<String, String> map){
        Perfume_Wish pw = pw_repo.findPerfumeList(name, brand);
        pw.setWish_count(Integer.parseInt(map.get("wish_count")));
        return pw_repo.save(pw);
    }
}
