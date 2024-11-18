package com.user.model;

public class User {
    private String description; // Transaction description
    private double amount;      // Transaction amount
    private String type;        // Transaction type (income/expense)

    // Default constructor
    public User() {}

    // Constructor to initialize transaction details
    public User(String description, double amount, String type) {
        this.description = description;
        this.amount = amount;
        this.type = type;
    }

    // Getter and Setter methods for the attributes
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
