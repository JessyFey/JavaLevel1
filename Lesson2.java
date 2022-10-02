package lesson2;

import javax.print.DocFlavor;

public class Lesson2 {
    public static void main(String[] args) {
     System.out.println(Task1(0, 10));
     System.out.println(Task2(20));
     System.out.println(Task3(20));
     Task4("Строка для цикла", 7);
     System.out.println(Task5(2024));
    }

    private static boolean Task1(int a, int b) {
        if ((a+b) >= 10 && (a+b) <= 20) {
            System.out.println("Task1 result:");
            return true;
        }
        System.out.println("Task1 result:");
        return false;
    }

    private static String Task2(int a) {
        if (a >= 0) {
            System.out.println("Task2 result:");
            return "Число " + a + " положительное";
        }
        System.out.println("Task2 result:");
        return "Число " + a + " отрицательное";
    }

    private static boolean Task3(int a) {
        if (a>= 0) {
            System.out.println("Task3 result:");
            return false;
        }
        System.out.println("Task3 result:");
        return true;
    }

    private static void Task4(String text, int a) {
        System.out.println("Task4 result:");
        for (int i = 0; i < a; i++) {
            System.out.println(text);
        }
    }

    private static boolean Task5(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            System.out.println("Task5 result:");
            return false ;
        }
        System.out.println("Task5 result:");
            return true;
    }

    }
