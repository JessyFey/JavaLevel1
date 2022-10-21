package Lesson7;

import java.util.Random;

public class Plate {
    public int foodAmount;

    public Plate(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public void printInfo() {
        System.out.printf("В тарелке находится %s корма.%n", this.foodAmount);
    }

    public boolean canEat(int eatSize) {
        return eatSize <= this.foodAmount;
    }

    public void addFoodAmount() {
        int amount = new Random().nextInt(30);
        this.foodAmount += amount;
        System.out.printf("Добавляем в тарелку %s корма.%n", amount);
    }
}
