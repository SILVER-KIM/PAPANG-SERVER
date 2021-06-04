package com.papang.papang.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@Table(name="user")
public class User implements Serializable {

    public User(String email, String password, String name, String nickname, String gender, int birth, String address, String access, String phone){
        this.email = email;
        this.password = password;
        this.name = name;
        this.nickname = nickname;
        this.gender = gender;
        this.birth = birth;
        this.address = address;
        this.access = access;
        this.phone = phone;
    }

    @Id
    @Column(name="email", nullable = false)
    String email;

    @Column(name="password")
    String password;

    @Column(name="name")
    String name;

    @Column(name="nickname")
    String nickname;

    @Column(name="gender")
    String gender;

    @Column(name="birth")
    int birth;

    @Column(name="address")
    String address;

    @Column(name="access")
    String access;

    @Column(name="phone")
    String phone;

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getNickname(){
        return this.nickname;
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public String getGender(){
        return this.gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public int getBirth(){
        return this.birth;
    }
    public void setBirth(int birth){
        this.birth = birth;
    }

    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getAccess(){
        return this.access;
    }
    public void setAccess(String access){
        this.access = access;
    }

    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
}
