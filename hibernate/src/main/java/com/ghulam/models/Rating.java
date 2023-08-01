package com.ghulam.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class Rating {
    @Column(name = "cooking", nullable = false)
    private int Cooking;

    @Column(name = "cutting")
    private int cutting;

    @Column(name = "serving")
    private int serving;
}
