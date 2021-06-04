package com.papang.papang.service;

import com.papang.papang.entity.Price;
import com.papang.papang.repository.PriceRepository;
import org.jsoup.Jsoup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.List;

@Service
public class PriceService {

    @Autowired
    PriceRepository p_repo;
    List<Price> prices;
}
