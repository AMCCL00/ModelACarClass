package com.company;

public class Vehicle {
    String Make;
    String Model;
    int Year;

    public Vehicle(String make, String model, int year) {
        Make = make;
        Model = model;
        Year = year;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }
}
