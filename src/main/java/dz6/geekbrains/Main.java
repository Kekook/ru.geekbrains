package dz6.geekbrains;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Пупс");
        cat1.run(150);
        cat1.swim(20);
        Cat cat2 = new Cat("Том");
        cat2.run(27);
        cat2.swim(88);
        Dog dog1 = new Dog("Шарик");
        dog1.run(100);
        dog1.swim(100);
        Dog dog2 = new Dog("Васька");
        dog2.swim(27);
        dog2.run(11);
        Dog dog3 = new Dog("Паря");
        dog3.swim(1000);
        dog3.run(25);
        System.out.println();
        System.out.println("Было создано " + Cat.counter + " котов");
        System.out.println("Было создано " + Dog.counter + " собак");
        System.out.println("Было создано " + Animal.counter() + " животных");
    }
}
