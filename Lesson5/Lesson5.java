package Lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        /*Employee employee1 = new Employee("Иванов И.И.", "эксперт", "1234@ya.com","79513015647", 1000, 27);

        employee1.info();*/

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Иванов А.А.", "Инженер", "ivanov@mailbox.com", "89231231212", 18000, 25);
        persArray[1] = new Employee("Сидоров С.Ю.", "Аналитик", "sidorov@mailbox.com", "89231231267", 22000, 27);
        persArray[2] = new Employee("Петров А.С.", "Аналитик", "petrov@mailbox.com", "89231231298", 20000, 30);
        persArray[3] = new Employee("Тюрин О.Н.", "Старший аналитик", "tyrin@mailbox.com", "89231231245", 35000, 40);
        persArray[4] = new Employee("Артамонов К.Г.", "Старший инженер", "artamonov@mailbox.com", "89125769800", 38000, 43);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() >= 40) {
                persArray[i].info();
            }
        }
    }

}
