package com.ghulam.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
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

    @OneToOne(mappedBy = "chef", cascade = CascadeType.ALL)
    private Kitchen kitchen;
}
