package com.papang.papang.repository;

import com.papang.papang.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, String> {

    @Query("SELECT u FROM User u WHERE u.phone = :phone")
    User getEmail(String phone);
}
