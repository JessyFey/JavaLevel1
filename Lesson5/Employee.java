package Lesson5;

public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phoneNum;
    private int salary;
    private int age;

    public Employee(String fio, String position, String email, String phoneNum, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО: " + fio + "; Должность: " + position + "; Почта: " + email + "; Телефон: " + phoneNum + "; Зарплата: " + salary + "; Возраст: " + age);
    }

    public int getAge() {
        return age;
    }
}
