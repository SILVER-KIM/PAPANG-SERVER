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

    // 추가향료1은 선택하고 추가향료2를 선택없음을 했을 경우
    @Query(value = "SELECT d.perfumeID, d.name, d.brand FROM perfume d " +
            "WHERE d.style = :style AND d.main = :main " +
            "AND d.first = :first AND d.size between :size1 AND :size2 " +
            "ORDER BY RAND() LIMIT 5", nativeQuery = true)
    ArrayList<String> findByRecommendationPerfumeExclude(int style, int main, int first,
                                                         int size1, int size2);

    // 수정된 추천 시스템 버전으로 추가향료1을 15가지 향료에서 무조건 선택하도록 했을 경우
    // 우리가 추가향료1을 DB의 first, second에서 같은게 있으면 다 긁어오도록(5개 랜덤으로!)
    @Query(value = "SELECT d.perfumeID, d.name, d.brand FROM perfume d " +
            "WHERE d.style = :style AND d.main = :main " +
            "AND (d.first = :first OR d.second = :first) AND d.size between :size1 AND :size2 " +
            "ORDER BY RAND() LIMIT 5", nativeQuery = true)
    ArrayList<String> findByRecommendationPerfumeExclude2(int style, int main, int first,
                                                         int size1, int size2);

    @Query("select p from Perfume p where p.name = :name")
    List<Perfume> findByName(String name);
}
