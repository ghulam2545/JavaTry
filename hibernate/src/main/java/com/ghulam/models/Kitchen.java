package com.ghulam.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "kitchen")
public class Kitchen {
    private int kitchenId;
    private String location;
    private int area;

    public Kitchen() { }

    public Kitchen(int kitchenId, String location, int area) {
        this.kitchenId = kitchenId;
        this.location = location;
        this.area = area;
    }

    public int getKitchenId() {
        return kitchenId;
    }

    public String getLocation() {
        return location;
    }

    public int getArea() {
        return area;
    }

    public void setKitchenId(int kitchenId) {
        this.kitchenId = kitchenId;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Kitchen [" +
                "kitchenId=" + kitchenId +
                ", location='" + location + '\'' +
                ", area=" + area +
                " ].";
    }
}
