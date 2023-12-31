package com.example.demo.account.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "customer")
public class Customer extends Person {

    @Column(name = "telephone", columnDefinition = "VARCHAR(100)")
    private String telephone;
    @Column(name = "customer_since", columnDefinition = "DATE")
    private LocalDate customer_since;
    @Column(name = "credit_rating", columnDefinition = "INTEGER")
    private int credit_rating;

    public Customer() {
    }
    public Customer(String personId,
                    String tax_id,
                    String fname,
                    String lname,
                    LocalDate dob,
                    String telephone,
                    LocalDate customer_since,
                    int credit_rating) {
        super(personId, tax_id, fname, lname, dob);
        this.telephone = telephone;
        this.customer_since = customer_since;
        this.credit_rating = credit_rating;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public LocalDate getCustomer_since() {
        return customer_since;
    }

    public void setCustomer_since(LocalDate customer_since) {
        this.customer_since = customer_since;
    }

    public int getCredit_rating() {
        return credit_rating;
    }

    public void setCredit_rating(int credit_rating) {
        this.credit_rating = credit_rating;
    }
}
