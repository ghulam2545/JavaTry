package com.ghulam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        /**
         * public API
         * ***********
         * POST http://localhost:8080/card/add-card
         * GET http://localhost:8080/card?serialNumber=<existing sn>
         * GET http://localhost:8080/card/read-cards (read all card)
         * PUT http://localhost:8080/card
         * DELETE http://localhost:8080/card?serialNumber=<existing sn>
         */
    }
}
