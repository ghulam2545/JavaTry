package com.ghulam.models;

import javax.persistence.Embeddable;

@Embeddable
public class Rating {
    private int Cooking;
    private int cutting;
    private int serving;

    public Rating() { }

    public Rating(int cooking, int cutting, int serving) {
        Cooking = cooking;
        this.cutting = cutting;
        this.serving = serving;
    }

    public int getCooking() {
        return Cooking;
    }

    public int getCutting() {
        return cutting;
    }

    public int getServing() {
        return serving;
    }

    public void setCooking(int cooking) {
        Cooking = cooking;
    }

    public void setCutting(int cutting) {
        this.cutting = cutting;
    }

    public void setServing(int serving) {
        this.serving = serving;
    }

    @Override
    public String toString() {
        return "Rating [ " +
                "Cooking=" + Cooking +
                ", cutting=" + cutting +
                ", serving=" + serving +
                " ].";
    }
}
