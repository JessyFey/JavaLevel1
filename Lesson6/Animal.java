package Lesson6;

public class Animal {
    protected String name;
    protected int maxSwimLength;
    protected int maxRunLength;
    private static int animalsCount;


    public Animal(String name) {
        this.name = name;
        animalsCount++;
    }

    public static int getAnimalsCount() {
        System.out.println("Всего животных: ");
        return animalsCount;
    }

    public void animalInfo() {
        System.out.print("Животное: " + name);
    }
    public void run(int barrier) {
        if (barrier <= 0) {
            System.out.println("Животное " + name + " не сдвинулось с места.");
        }
        else if (maxRunLength == 0) {
            System.out.println("Животное " + name + " не умеет бегать.");
        }
        else if (barrier <= maxRunLength) {
            System.out.println("Животное " + name + " пробежало " + barrier +"м.");
        }
        else {
            System.out.printf("Животное " + name + " не может пробежать препятствие в %d метров, т.к. имеет ограничение бега в %d метров.%n", barrier, maxRunLength);
        }
    }

    public void swim(int barrier) {
        if (barrier <= 0) {
            System.out.println("Животное " + name + " не сдвинулось с места.");
        }
        else if (maxSwimLength == 0) {
            System.out.println("Животное " + name + " не умеет плавать.");
        }
        else if (barrier <= maxSwimLength) {
            System.out.println("Животное " + name + " проплыло " + barrier +"м.");
        }
        else {
            System.out.printf("Животное " + name + " не может проплыть %d метров, т.к. может проплыть только %d метров.%n", barrier, maxSwimLength);
        }
    }
}
