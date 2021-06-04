package com.papang.papang.controller;

import com.papang.papang.entity.Wish;
import com.papang.papang.repository.WishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/wish")
public class WishCotroller {

    @Autowired
    WishRepository w_repo;

    @GetMapping(value = "/{email}", produces = "application/json; charset=utf-8")
    public List<Wish> getWishList(@PathVariable("email") String email)
    {
        return w_repo.getWishList(email);
    }

    @GetMapping(value = "/{email}/{name}", produces = "application/json; charset=utf-8")
    public Wish getWishList(@PathVariable("email") String email,
                                  @PathVariable("name") String name)
    {
        return w_repo.getWishPerfume(email, name);
    }

    @PostMapping("/add")
    public Wish addWish(@RequestBody Map<String, String> map){
        return w_repo.save(new Wish(map.get("email"), Integer.parseInt(map.get("perfumeID")),
                map.get("brand"), map.get("name")));
    }

    @PostMapping("/delete/{email}/{name}")
    public int deleteWish(@PathVariable("email") String email, @PathVariable("name") String name){
        w_repo.deleteWishPerfume(email, name);
        return 1004;
    }

}
