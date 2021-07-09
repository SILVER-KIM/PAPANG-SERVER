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
@Table(name="user_recommendation")
public class UserRecommendation {

    @Id
    @Column(name="email", nullable = false)
    String email;

    @Column(name="style", nullable = false)
    int style;

    @Column(name="flavor1", nullable = false)
    int flavor1;

    @Column(name="flavor2", nullable = false)
    int flavor2;

    @Column(name="flavor3", nullable = false)
    int flavor3;

    @Column(name="size", nullable = false)
    String size;

    public String getEmail(){
        return this.email;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getStyle() {
        return style;
    }

    public void setStyle(int style) {
        this.style = style;
    }

    public int getFlavor1() {
        return flavor1;
    }

    public void setFlavor1(int flavor1) {
        this.flavor1 = flavor1;
    }

    public int getFlavor2() {
        return flavor2;
    }

    public void setFlavor2(int flavor2) {
        this.flavor2 = flavor2;
    }

    public int getFlavor3() {
        return flavor3;
    }

    public void setFlavor3(int flavor3) {
        this.flavor3 = flavor3;
    }

    public UserRecommendation(String email, int style, int flavor1, int flavor2, int flavor3, String size){
        this.email = email;
        this.style = style;
        this.flavor1 = flavor1;
        this.flavor2 = flavor2;
        this.flavor3 = flavor3;
        this.size = size;
    }
}
