package com.ghulam.models;

import javax.persistence.*;

@Entity
@Table(name = "chef")
public class Chef {
    @Id
    @Column(name = "chef_id")
    private int chefId;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    private Rating rating;

    @OneToOne
    private Kitchen kitchen;

    public Chef() { }

    public Chef(int chefId, String name, int age, Rating rating) {
        this.chefId = chefId;
        this.name = name;
        this.age = age;
        this.rating = rating;
    }

    public int getChefId() {
        return chefId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Rating getRating() {
        return rating;
    }

    public void setChefId(int chefId) {
        this.chefId = chefId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Chef [" +
                "chefId=" + chefId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", rating=" + rating +
                " ].";
    }
}
