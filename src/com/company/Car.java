package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Car extends Vehicle{
    Scanner input = new Scanner(System.in);
    private int speed = 0;
    private int gas = 100;

    public Car() {
        setMake();
        setModel();
        setYear();
        setSpeed(0);
        setGas(100);
    }

    public Car(String make, String model, int year, int speed, int gas) {
        super(year,make,model);
    }


    public void setYear() {
        System.out.println("What is the year of the car you would like to make?");
        try{
            setYear(input.nextInt());
        }catch(InputMismatchException ime){
            System.out.println("Please enter a number for the year.");
            setYear();
        }
    }
    public void setMake() {
        System.out.println("What is the make of car you would like to create?");
        super.setMake(input.nextLine());
    }

    public void setModel() {
        System.out.println("What is the model of car you would like to create?");
        super.setModel(input.nextLine());
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public void getCarInfo(){
        System.out.println("The current car is a " + getYear() + " " + getMake() + " " + getModel() + " It is going " + getSpeed() + " MPH and it has " + getGas() + "% left in the tank");
    }
    public void driveCar(Car car){
        for (int seconds = 0; seconds <= 5; seconds++){
            car.setSpeed(car.getSpeed() + 1);
            car.setGas(car.getGas() - 1);

            System.out.println("The " + car.getMake()+ " " +car.getModel() + " is going " + car.getSpeed() + " MPH and has " + car.getGas() + "% of its total tank full.");
        }
        Menu mainMenu = new Menu();
        mainMenu.menu(car);
    }
    public void slowCar(Car car){
        for (int seconds = 0; seconds <= 5; seconds++){
            car.setSpeed(car.getSpeed() - 1);
            car.setGas(car.getGas() - 1);

            System.out.println("The " + car.getMake()+ " " +car.getModel() + " is going " + car.getSpeed() + " MPH and has " + car.getGas() + "% of its total tank full.");
        }
        Menu mainMenu = new Menu();
        mainMenu.menu(car);
    }
    public void addGas(Car car){
        System.out.println("Your tank is now full.");
        car.setGas(100);
        Menu mainMenu = new Menu();
        mainMenu.menu(car);
    }
}
