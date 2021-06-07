package com.papang.papang.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@Table(name="wish")
@IdClass(WishVOKey.class)
public class Wish implements Serializable {

    @Id
    @Column(name="email", nullable = false)
    String email;

    @Id
    @Column(name="brand", nullable = false)
    String brand;

    @Id
    @Column(name="name", nullable = false)
    String name;

    public String getEmail(){
        return this.email;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getName(){
        return this.name;
    }

    public Wish(String email, String brand, String name){
        this.email = email;
        this.brand = brand;
        this.name = name;
    }
}
