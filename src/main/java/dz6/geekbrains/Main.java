package dz6.geekbrains;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Котиг");
        cat1.run(130);
        cat1.swim(15);
        Cat cat2 = new Cat("Васька");
        cat2.run(300);
        cat2.swim(16);
        Dog dog1 = new Dog("Барбос");
        dog1.run(70);
        dog1.swim(49);
        Dog dog2 = new Dog("Витаминка");
        dog2.run(50);
        dog2.swim(5);
        System.out.println("Всего животных :" + Animal.counter());

    }
}
