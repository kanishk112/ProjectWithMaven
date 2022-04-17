package com.tut;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Student_details")
public class student {
    @Id
    private int id;
    private String name;
    private String city;

    private Certificate cert;

    public student(int id, String name, String city, Certificate cert) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.cert = cert;
    }

    public Certificate getCert() {
        return cert;
    }

    public void setCert(Certificate cert) {
        this.cert = cert;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public student()
    {
        super();
    }
}
