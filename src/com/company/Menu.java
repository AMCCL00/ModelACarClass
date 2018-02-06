package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);

    protected void createCar(){
        Car car = new Car();
        car.getCarInfo();

        menu(car);

    }

    public void menu(Car car){
        System.out.println("What would you like to do with the " + car.getMake() + " " + car.getModel() + "?");
        System.out.println("1. Accelerate \n2. Decelerate \n3. Fill the gas tank\n4. Exit");
        try{
            switch(input.nextInt()){
                case 1:
                    //Accelerate
                   car.driveCar(car);
                    break;
                case 2:
                    car.slowCar(car);
                    //Decelerate
                    break;
                case 3:
                    //Fill the tank
                    car.addGas(car);
                    break;
                case 4:
                    //Exit
                    System.exit(1231);
                default:
                    System.out.println("Please enter a number between 1 and 4.");
                    menu(car);
            }
        } catch(InputMismatchException ime){
            input.nextLine();
            System.out.println("Please enter a number between 1 and 4.");
            menu(car);
        }
    }
}
