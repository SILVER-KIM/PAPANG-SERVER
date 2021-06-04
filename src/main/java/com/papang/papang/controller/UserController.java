package com.papang.papang.controller;

import com.papang.papang.entity.Perfume;
import com.papang.papang.entity.User;
import com.papang.papang.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/join")
public class UserController {

    @Autowired
    UserRepository u_repo;

    @GetMapping(value = "/{email}", produces = "application/json; charset=utf-8")
    public User getUser(@PathVariable("email") String email){
        return u_repo.findById(email).orElse(null);
    }

    @PostMapping("/user")
    public User join(@RequestBody Map<String, String> map){
        return u_repo.save(new User(map.get("email"), map.get("password"),
                map.get("name"), map.get("nickname"), map.get("gender"),
                Integer.parseInt(map.get("birth")), map.get("address"),
                map.get("access"), map.get("phone")));
    }

    @PostMapping("/reset_pw/{email}")
    public User resetPW(@PathVariable("email") String email, @RequestBody Map<String, String> map){
        User user = u_repo.findById(email).orElse(null);
        user.setPassword(map.get("password"));
        return u_repo.save(user);
    }

    @GetMapping(value = "/search_email/{phone}", produces = "application/json; charset=utf-8")
    public User getEmail(@PathVariable("phone") String phone){
        return u_repo.getEmail(phone);
    }

}
