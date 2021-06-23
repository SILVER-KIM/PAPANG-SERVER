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


    @Query("SELECT d.perfumeID, d.name, d.brand FROM Perfume d " +
            "WHERE d.concentration = :concentration AND d.size between :size1 AND :size2 " +
            "AND d.style = :style AND d.main = :main AND d.first = :first AND d.second = :second")
    ArrayList<String> findByRecommendationPerfume(int concentration, int size1, int size2, int style,
                                                   int main, int first, int second);

    @Query(value = "SELECT d.perfumeID, d.name, d.brand FROM perfume d " +
            "WHERE d.concentration = :concentration AND d.size between :size1 AND :size2 " +
            "AND d.style = :style AND d.main = :main AND d.first = :first ORDER BY RAND() LIMIT 5", nativeQuery = true)
    ArrayList<String> findByRecommendationPerfumeExclude(int concentration, int size1, int size2, int style,
                                                  int main, int first);

    @Query("select p from Perfume p where p.name = :name")
    List<Perfume> findByName(String name);
}
