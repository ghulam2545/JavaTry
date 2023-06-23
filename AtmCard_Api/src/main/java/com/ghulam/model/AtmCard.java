package com.ghulam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity // mark this atm card as entity
@Getter // this provides getter method for card
@Setter // this provides setter method for card
public class AtmCard {

    @Id // specifies the primary key for card
    private String serialNumber;
    private int pinNumber;
    private String cardHolder;
    private int expiryMonth;
    private int expiryYear;
    private CARD_TYPE cardType;

    public AtmCard() {}

    public AtmCard(String serialNumber, int pinNumber, String cardHolder, int expiryMonth, int expiryYear, CARD_TYPE cardType) {
        this.serialNumber = serialNumber;
        this.pinNumber = pinNumber;
        this.cardHolder = cardHolder;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "AtmCard{" +
                "serialNumber='" + serialNumber + '\'' +
                ", pinNumber=" + pinNumber +
                ", cardHolder='" + cardHolder + '\'' +
                ", expiryMonth=" + expiryMonth +
                ", expiryYear=" + expiryYear +
                ", cardType=" + cardType +
                '}';
    }
}
