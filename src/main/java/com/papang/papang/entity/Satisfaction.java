package com.papang.papang.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@Table(name="satisfaction")
@IdClass(SatisfactionVOKey.class)
public class Satisfaction implements Serializable{

    @Id
    @Column(name="type", nullable = false)
    String type;

    @Id
    @Column(name="text", nullable = false)
    String text;

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public Satisfaction(String type, String text){
        this.type = type;
        this.text = text;
    }
}
