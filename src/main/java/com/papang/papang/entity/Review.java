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
@Table(name="review")
public class Review {

    @Id
    @Column(name="name", nullable = false)
    String name;

    @Column(name="brand")
    String brand;

    @Column(name="type")
    String type;

    @Column(name="rate")
    int rate;

    @Column(name="text_review")
    String text_review;

    @Column(name="season")
    int season;

    @Column(name="hashtag")
    String hashtag;

    @Column(name="flavor1")
    int flavor1;

    @Column(name="flavor2")
    int flavor2;

    @Column(name="flavor3")
    int flavor3;

    @Column(name="image1")
    String image1;

    @Column(name="image2")
    String image2;

    @Column(name="image3")
    String image3;

    public String getName(){
        return this.name;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getType(){
        return this.type;
    }

    public int getRate(){
        return this.rate;
    }

    public String getText_review(){
        return this.text_review;
    }

    public int getSeason(){
        return this.season;
    }

    public String getHashtag(){
        return this.hashtag;
    }

    public int getFlavor1(){
        return this.flavor1;
    }

    public int getFlavor2(){
        return this.flavor2;
    }

    public int getFlavor3(){
        return this.flavor3;
    }

    public String getImage1(){
        return this.image1;
    }

    public String getImage2(){
        return this.image2;
    }

    public String getImage3(){
        return this.image3;
    }
}
