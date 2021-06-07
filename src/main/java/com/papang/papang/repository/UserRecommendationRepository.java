package com.papang.papang.repository;

import com.papang.papang.entity.UserRecommendation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRecommendationRepository extends JpaRepository<UserRecommendation, String> {
}
