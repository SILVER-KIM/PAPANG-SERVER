package com.papang.papang.controller;

import com.papang.papang.entity.Recommendation_Down;
import com.papang.papang.entity.Recommendation_Up;
import com.papang.papang.repository.RecommendationDownRepository;
import com.papang.papang.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/papang_perfume")
public class PapangRecommendController {

    @Autowired
    RecommendationRepository r_repo;

    @Autowired
    RecommendationDownRepository rd_repo;

    @GetMapping(value = "/up", produces = "application/json; charset=utf-8")
    public List<Recommendation_Up> getPerfumeUp(){
        return r_repo.getPerfumeUpList();
    }

    @GetMapping(value = "/down", produces = "application/json; charset=utf-8")
    public List<Recommendation_Down> getPerfumeDown(){
        return rd_repo.getPerfumeDownList();
    }
}
