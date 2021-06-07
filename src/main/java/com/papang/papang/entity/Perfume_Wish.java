package com.papang.papang.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name="perfume_wish")
@IdClass(Perfume_WishVOKey.class)
public class Perfume_Wish {

    @Id
    @Column(name="name", nullable = false)
    String name;

    @Id
    @Column(name="brand", nullable = false)
    String brand;

    @Column(name="wish_count")
    int wish_count;

    public String getName(){
        return this.name;
    }

    public String getBrand() {
        return brand;
    }

    public int getWish_count(){
        return this.wish_count;
    }

    public void setWish_count(int wish_count){
        this.wish_count = wish_count;
    }
}
