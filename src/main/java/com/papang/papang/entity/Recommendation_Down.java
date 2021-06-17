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
@Table(name="recommendation_down")
public class Recommendation_Down {
    @Id
    @Column(name="perfumeID", nullable = false)
    int perfumeID;

    @Column(name="brand")
    String brand;

    @Column(name="name")
    String name;

    public String getBrand(){
        return this.brand;
    }
    public String getName(){
        return this.name;
    }
    public int getPerfumeID(){
        return this.perfumeID;
    }

    public Recommendation_Down(int perfumeID, String brand, String name){
        this.perfumeID = perfumeID;
        this.brand = brand;
        this.name = name;
    }
}
