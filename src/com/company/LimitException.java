package com.company;

public class LimitException extends Exception {
    private double remainingAmount;
    private String message;

    public LimitException(double remainingAmount, String message) {
        this.remainingAmount = remainingAmount;
        this.message = message;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}

