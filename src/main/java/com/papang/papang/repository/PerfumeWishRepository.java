package com.papang.papang.repository;

import com.papang.papang.entity.Perfume;
import com.papang.papang.entity.Perfume_Wish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;

public interface PerfumeWishRepository extends JpaRepository<Perfume_Wish, String> {

    @Query("SELECT pw FROM Perfume_Wish pw WHERE pw.name = :name AND pw.brand = :brand")
    Perfume_Wish findPerfumeList(String name, String brand);

    @Query("SELECT pw FROM Perfume_Wish pw WHERE pw.brand like %:word% OR pw.name like %:word%")
    List<Perfume_Wish> findByWord(String word);
}
