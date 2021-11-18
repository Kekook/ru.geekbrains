package dz5.geekbrains;

public class Employee {
    private String name;
    private String position;
    private String eMail;
    private int number;
    private int salary;
    private int age;

    public Employee(String name, String position, String eMail, int number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.eMail = eMail;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }
     void info(){
        System.out.println("Фио : " + name + " Должность : " + position + " email : " + eMail + " Номер телефона : " + number + " Зарплата : " + salary + " возраст: " + age );
    }
    public int getAge() {
        return age;
    }
}
