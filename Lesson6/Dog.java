package Lesson6;

public class Dog extends Animal{
    private static int dogCount;
    public Dog(String name) {
        super(name);
        maxSwimLength = 10;
        maxRunLength = 500;
        dogCount++;
    }

    public void animalInfo() {
        super.animalInfo();
        System.out.println(". Вид животного: собака");
    }
    public static int getDogCount() {
        System.out.println("Всего собак: ");
        return dogCount;
    }
}
