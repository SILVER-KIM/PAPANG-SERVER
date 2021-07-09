package com.papang.papang.repository;

import com.papang.papang.entity.Perfume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface PerfumeRepository extends JpaRepository<Perfume, Integer> {


    @Query(value = "SELECT d.perfumeID, d.name, d.brand FROM perfume d " +
            "WHERE d.style = :style AND d.main = :main " +
            "AND d.first = :first AND d.second = :second " +
            "AND d.size between :size1 AND :size2 " +
            "ORDER BY RAND() LIMIT 5", nativeQuery = true)
    ArrayList<String> findByRecommendationPerfume(int style, int main, int first, int second,
                                                  int size1, int size2);

    @Query(value = "SELECT d.perfumeID, d.name, d.brand FROM perfume d " +
            "WHERE d.style = :style AND d.main = :main " +
            "AND d.first = :first AND d.size between :size1 AND :size2 " +
            "ORDER BY RAND() LIMIT 5", nativeQuery = true)
    ArrayList<String> findByRecommendationPerfumeExclude(int style, int main, int first,
                                                         int size1, int size2);

    @Query("select p from Perfume p where p.name = :name")
    List<Perfume> findByName(String name);
}
