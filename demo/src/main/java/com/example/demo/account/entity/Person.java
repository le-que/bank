package com.example.demo.account.entity;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@MappedSuperclass
public abstract class Person {
    @Id
    @Column(name = "personId", columnDefinition = "VARCHAR(20)")
    private String personId;
    @Column(name = "tax_id", columnDefinition = "VARCHAR(20)")
    private String tax_id;
    @Column(name = "fname", columnDefinition = "VARCHAR(100)")
    private String fname;
    @Column(name = "lname", columnDefinition = "VARCHAR(100)")
    private String lname;
    @Column(name = "dob", columnDefinition = "DATE")
    private LocalDate dob;

    public Person() {
    }

    public Person(String personId, String tax_id, String fname, String lname, LocalDate dob) {
        this.personId = personId;
        this.tax_id = tax_id;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getTax_id() {
        return tax_id;
    }

    public void setTax_id(String tax_id) {
        this.tax_id = tax_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
