package com.papang.papang.repository;

import com.papang.papang.entity.Wish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface WishRepository extends JpaRepository<Wish, String> {

    @Query("SELECT w FROM Wish w WHERE w.email = :email")
    List<Wish> getWishList(String email);

    @Query("SELECT w FROM Wish w WHERE w.email = :email AND w.name = :name")
    Wish getWishPerfume(String email, String name);

    @Transactional
    @Modifying
    @Query("DELETE FROM Wish w WHERE w.email = :email AND w.name = :name")
    int deleteWishPerfume(String email, String name);
}
