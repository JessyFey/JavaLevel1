package Lesson1;

import java.util.Random;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign() {
        int a = new Random().nextInt(-5, 5);
        int b = new Random().nextInt(-5, 5);
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная" );
        } else  {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {
        int value = new Random().nextInt(-50, 150);
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {
        int a = new Random().nextInt(-5, 5);
        int b = new Random().nextInt(-5, 5);
        if (a >= b) {
            System.out.println("a >= b");
        } else  {
            System.out.println("a < b");
        }
    }

}
