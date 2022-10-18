package Lesson6;

public class Main {
    public static void main(String[] args) {
     Cat cat1 = new Cat("Булка");
     Cat cat2 = new Cat("Машка");
     Dog dog1 = new Dog("Сосиска");
     Dog dog2 = new Dog("Фунтик");
     Dog dog3 = new Dog("Бобик");

     cat1.animalInfo();
     dog1.animalInfo();

     System.out.println(Animal.getAnimalsCount());
     System.out.println(Cat.getCatCount());
     System.out.println(Dog.getDogCount());

     cat1.run(200);
     cat2.swim(10);
     dog1.swim(100);
     dog2.run(1000);
     dog3.run(200);

    }
}
