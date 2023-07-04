package com.courses.kafkaticketsales.domain.dtos.ticketSalesDTO;

public enum Type {
    VIP("VIP"),
    REGULAR("Regular"),
    STUDENT("Student"),
    CHILD("Child"),
    SENIOR("Senior"),
    GENERAL_ACCESS("General Access"),
    NUMBERED_SEAT("Numbered Seat"),
    FAMILY("Family"),
    VIP_MEET_AND_GREET("VIP Meet and Greet");

    private String description;

    Type(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
