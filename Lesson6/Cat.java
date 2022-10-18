package Lesson6;

public class Cat extends Animal{
    private static int catCount;

    public Cat(String name) {
        super(name);
        maxSwimLength = 0;
        maxRunLength = 200;
        catCount++;
    }

    public void animalInfo() {
        super.animalInfo();
        System.out.println(". Вид животного: кошка");
    }
    public static int getCatCount() {
        System.out.println("Всего котов: ");
        return catCount;
    }
}
