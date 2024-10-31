package com.bank.entities;

import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;

public class Billing {
    public LocalDate billingDate;
    public String description;
    public double price;

    public Billing( LocalDate billingDate, String description, double price ) {
        this.billingDate = billingDate;
        this.description = description;
        this.price = price;
    }

    // public 

}
