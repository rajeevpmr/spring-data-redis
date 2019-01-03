package com.example.redis.model;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("person")
public class Person implements Serializable {

    private enum Gender {
        male, female
    }

    private String id;
    private String name;
    private Gender gender;
    private int points;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }


}
