package Lesson7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Васька");
        Cat cat2 = new Cat("Булка");
        Cat cat3 = new Cat("Килька");
        Cat cat4 = new Cat("Иннокентий");
        Cat cat5 = new Cat("Обормотик");
        Plate plate = new Plate(100);
        Cat[] cats = {cat1, cat2, cat3, cat4, cat5};

        plate.printInfo();
        for (Cat cat : cats) {
            cat.printInfo();
        }
        System.out.println("Котики идут кушать:");
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate, new Random().nextInt(1,30));
        }
        System.out.println("Каждый котик подошел к тарелке:");
        for (Cat cat : cats) {

            cat.printInfo();
        }

        plate.printInfo();
        plate.addFoodAmount();
        plate.printInfo();
    }
}
