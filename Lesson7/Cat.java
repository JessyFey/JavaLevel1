package Lesson7;

public class Cat {
    private final String name;
    private boolean satiety = false;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate, int eatSize) {
        if (this.satiety) {
            System.out.printf("Котик %s подошел к миске, но он сыт и кушать не будет.%n", this.name);
        } else if (plate.canEat(eatSize)) {
            plate.foodAmount -= eatSize;
            System.out.printf("Котик %s подошел к миске и съел %s корма.%n", this.name, eatSize);
            this.satiety = true;
        } else {
            System.out.printf("Котик %s не может покушать - в тарелке слишком мало корма.%n", this.name);
        }
    }

    public void printInfo() {
        System.out.printf("Котик %s %s.%n", this.name, this.satiety ? "сыт" : "голоден");
    }
}
