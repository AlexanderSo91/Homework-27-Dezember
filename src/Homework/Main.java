package Homework;

import Transport.Car;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car myCar1 = new Car("Audi", "a8 50L TDI quattro", 3, "черный", 2020, "Германия");
        Car myCar2 = new Car("BMW", "Z8", 3, "черный", 2021, "Германия");
        Car myCar3 = new  Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная корея");
        Car myCar4 = new Car("Hyundai", "Avante", 1.6, "ораньжевый", 2016, "Южная Корея");

        System.out.println(myCar);
        System.out.println(myCar1);
        System.out.println(myCar2);
        System.out.println(myCar3);
        System.out.println(myCar4);

    }
}
