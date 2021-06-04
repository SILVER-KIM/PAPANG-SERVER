package com.papang.papang.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@Table(name="perfume_wish")
public class Perfume_Wish {

    @Id
    @Column(name="name", nullable = false)
    String name;

    @Column(name="wish_count")
    int wish_count;

    public String getName(){
        return this.name;
    }

    public int getWish_count(){
        return this.wish_count;
    }

    public void setWish_count(int wish_count){
        this.wish_count = wish_count;
    }
}
