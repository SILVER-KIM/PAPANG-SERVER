package com.papang.papang.controller;

import com.papang.papang.entity.Perfume;
import com.papang.papang.entity.Price;
import com.papang.papang.repository.PerfumeRepository;
import com.papang.papang.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/price_url")
public class PriceController {

    @Autowired
    PriceRepository p_repo;

    @GetMapping(value = "/{perfumeID}", produces = "application/json; charset=utf-8")
    public Price getPerfumeOne(@PathVariable("perfumeID") int perfumeID){
        return p_repo.findById(perfumeID).orElse(null);
    }
}
