package com.company;

public class Civic extends Car{
    public Civic(String make, String model, int year, int speed, int gas) {
        super(make,model,year,speed,gas);
    }
@Override
    public  void getCarInfo(){
        System.out.println("The prebuilt make is a " + getMake());
        System.out.println("The prebuilt model is a " + getModel());
        System.out.println("The prebuilt year is " + getYear());
    }
}
