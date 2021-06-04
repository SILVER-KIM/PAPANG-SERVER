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
    @Column(name="perfumeID", nullable = false)
    int perfumeID;

    @Column(name="brand")
    String brand;

    @Column(name="name")
    String name;

    public String getEmail(){
        return this.email;
    }

    public int getPerfumeID(){
        return this.perfumeID;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getName(){
        return this.name;
    }

    public Wish(String email, int perfumeID, String brand, String name){
        this.email = email;
        this.perfumeID = perfumeID;
        this.brand = brand;
        this.name = name;
    }
}
