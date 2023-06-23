package com.ghulam.service;

import com.ghulam.model.AtmCard;
import com.ghulam.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// bad practice!
interface CardServiceInterface {
    public String addCard(AtmCard card);
    public AtmCard readCard(String serialNumber);
    public List<AtmCard> readAllCards();
    public String updateCard(AtmCard card);
    public String deleteCard(String serialNumber);
    // public void updateAllCard();
    // public void deleteAllCard();
}

@Service
public class CardService implements CardServiceInterface {
    CardRepository cardRepo = null;
    public CardService(CardRepository cardRepo) {
        this.cardRepo = cardRepo;
    }

    @Override
    public String addCard(AtmCard card) {
        AtmCard res = cardRepo.save(card);
        return "New atm card with serial number: " + res.getSerialNumber() + " added.";
    }

    @Override
    public AtmCard readCard(String serialNumber) {
        AtmCard res = cardRepo.findById(serialNumber).get(); // #
        return res;
    }

    @Override
    public List<AtmCard> readAllCards() {
        List<AtmCard> res = cardRepo.findAll();
        return res;
    }

    @Override
    public String updateCard(AtmCard card) {
        AtmCard res = cardRepo.save(card);
        return "Card with serial number: " + card.getSerialNumber() + " updated.";
    }

    @Override
    public String deleteCard(String serialNumber) {
        cardRepo.deleteById(serialNumber);
        return "Card with serial number: " + serialNumber + " deleted.";
    }
}
