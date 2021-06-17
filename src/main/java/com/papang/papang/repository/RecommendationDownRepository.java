package com.papang.papang.repository;

import com.papang.papang.entity.Recommendation_Down;
import com.papang.papang.entity.Recommendation_Up;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecommendationDownRepository extends JpaRepository<Recommendation_Down, Integer> {

    @Query(value = "SELECT * FROM recommendation_down ORDER BY RAND() LIMIT 5", nativeQuery = true)
    List<Recommendation_Down> getPerfumeDownList();
}
