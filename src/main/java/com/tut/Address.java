package com.tut;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student_address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_Id")
    private int id;


    private String city;
    private String street;
    private boolean isOpen;

    @Transient
    //By using Transient Hibernate will not create column for x
    private double x;

    @Temporal(TemporalType.DATE)
    //Formatting of date type;it will only store date not time stamps
    private Date addedDate;

    @Lob
    //Lob is for storing large objects
    private byte[] image;

    public Address()
    {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
