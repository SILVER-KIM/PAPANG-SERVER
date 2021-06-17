package com.papang.papang.repository;

import com.papang.papang.entity.Perfume_Wish;
import com.papang.papang.entity.Recommendation_Up;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecommendationRepository extends JpaRepository<Recommendation_Up, Integer> {

    @Query(value = "SELECT * FROM recommendation_up ORDER BY RAND() LIMIT 5", nativeQuery = true)
    List<Recommendation_Up> getPerfumeUpList();
}
