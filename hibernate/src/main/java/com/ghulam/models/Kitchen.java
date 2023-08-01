package com.ghulam.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "kitchen")
public class Kitchen {
    @Id
    @Column(name = "kitchen_id")
    private int kitchenId;

    @Column(name = "location")
    private String location;

    @Column(name = "area")
    private int area;

    @OneToOne
    @JoinColumn(name = "chef_id")
    private Chef byChef;
}
