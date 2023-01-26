package com.cunbm.invest.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {

    // Primary ID which increments
    // automatically when new entry
    // is added into the database
    @Id
    @GeneratedValue(strategy
            = GenerationType.AUTO)
    int id;

    String name;

    String profile;


    public Company() {
    }

    public Company(String name,
                   String profile) {
        this.name = name;
        this.profile = profile;
    }

    public Company(int id,
                   String name) {
        this.id = id;
        this.name = name;
        this.profile = "IT&C";
    }

    // Getters and setters of
    // the variables
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public String getProfile() {
        return profile;
    }


    public void setId(int id) {
        this.id = id;
    }

}