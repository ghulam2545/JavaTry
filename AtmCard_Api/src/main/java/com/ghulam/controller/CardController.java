package com.ghulam.controller;

import com.ghulam.model.AtmCard;
import com.ghulam.service.CardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/card")
public class CardController {
    CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping("/add-card")
    public String addCard(@RequestBody AtmCard card) {
        return cardService.addCard(card);
    }

    @GetMapping
    public AtmCard readCard(@RequestParam("serialNumber") String serialNumber) {
        return cardService.readCard(serialNumber);
    }

    @GetMapping("/read-cards")
    public List<AtmCard> readAllCards() {
        return cardService.readAllCards();
    }

    @PutMapping // #
    public String updateCard(@RequestBody AtmCard card) {
        return cardService.updateCard(card);
    }

    @DeleteMapping
    public String deleteCard(@RequestParam("serialNumber") String serialNumber) {
        return cardService.deleteCard(serialNumber);
    }
}
