package com.papang.papang.controller;

import com.papang.papang.entity.FlavorHashtag;
import com.papang.papang.entity.Perfume;
import com.papang.papang.repository.PerfumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/perfume_recommend")
public class RecommendationController {

    @Autowired
    PerfumeRepository p_repo;

    @GetMapping(value = "/{style}/{main}/{first}/{second}/{size1}/{size2}", produces = "application/json; charset=utf-8")
    public ArrayList<String> getPerfumeRecommendation2(@PathVariable("style") int style, @PathVariable("main") int main,
                                                       @PathVariable("first") int first, @PathVariable("second") int second,
                                                       @PathVariable("size1") int size1, @PathVariable("size2") int size2){
        return p_repo.findByRecommendationPerfume(style, main, first, second, size1, size2);
    }

    @GetMapping(value = "/{style}/{main}/{first}/{size1}/{size2}", produces = "application/json; charset=utf-8")
    public ArrayList<String> getPerfumeRecommendation3(@PathVariable("style") int style, @PathVariable("main") int main,
                                                       @PathVariable("first") int first, @PathVariable("size1") int size1,
                                                       @PathVariable("size2") int size2){

        return p_repo.findByRecommendationPerfumeExclude(style, main, first, size1, size2);
    }

}
