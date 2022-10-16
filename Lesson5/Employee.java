package Lesson5;

public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phoneNum;
    private int salary;
    private int age;

    public Employee(String _fio, String _position, String _email, String _phoneNum, int _salary, int _age) {
        fio = _fio;
        position = _position;
        email = _email;
        phoneNum = _phoneNum;
        salary = _salary;
        age = _age;
    }

    public void info() {
        System.out.println("ФИО: " + fio + "; Должность: " + position + "; Почта: " + email + "; Телефон: " + phoneNum + "; Зарплата: " + salary + "; Возраст: " + age);
    }

    public int getAge() {
        return age;
    }
}
