package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);

    protected void createCar(){
        System.out.println("What type of car would you like to create?");
        System.out.println("1. Custom\n2. Prebuilt\n3. Exit");
        try{
            switch(input.nextInt()){
                case 1:
                    Car car = new Car();
                    car.getCarInfo();
                    menu(car);
                    break;
                case 2:
                    Civic civic = new Civic("Honda", "Civic", 1996, 0, 100);
                    civic.getCarInfo();
                    menu(civic);
                    break;
                case 3:
                    System.exit(232342);
                default:
                    System.out.println("Please enter a number between 1 and 3.");
            }
        }catch(Exception e){
            input.nextLine();
            System.out.println("Please enter a 1, 2 or 3");
            createCar();
        }

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
