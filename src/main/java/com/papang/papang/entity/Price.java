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
@Table(name="price")
public class Price {

    @Id
    @Column(name="perfumeID", nullable = false)
    int perfumeID;

    @Column(name="check")
    String check;

    @Column(name="url1")
    String url1;

    @Column(name="url2")
    String url2;

    @Column(name="url3")
    String url3;

    public int getPerfumeID(){
        return this.perfumeID;
    }

    public String getCheck(){
        return this.check;
    }

    public String getUrl1(){
        return this.url1;
    }

    public String getUrl2(){
        return this.url2;
    }

    public String getUrl3(){
        return this.url3;
    }

}
