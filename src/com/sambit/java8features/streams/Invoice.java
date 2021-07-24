package com.sambit.java8features.streams;

import java.util.Date;

public class Invoice {
    private Integer id;
    private Double amount;
    private String number;
    private Date CreatedOn;

    public Invoice(Integer id, Double amount, String number, Date createdOn) {
        this.id = id;
        this.amount = amount;
        this.number = number;
        CreatedOn = createdOn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreatedOn() {
        return CreatedOn;
    }

    public void setCreatedOn(Date createdOn) {
        CreatedOn = createdOn;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", amount=" + amount +
                ", number='" + number + '\'' +
                ", CreatedOn=" + CreatedOn +
                '}';
    }
}
