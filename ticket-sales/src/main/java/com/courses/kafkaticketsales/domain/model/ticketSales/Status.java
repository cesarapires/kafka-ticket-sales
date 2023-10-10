package com.courses.kafkaticketsales.domain.model.ticketSales;

public enum Status {
    SOLD("Sold"),
    CANCELED("Canceled"),
    USED("Used"),
    RESERVED("Reserved"),
    AWAITING_PAYMENT("Awaiting Payment"),
    EXPIRED("Expired"),
    TRANSFERRED("Transferred");

    private String description;

    Status(String description) {
        this.description = description;
    }
}
