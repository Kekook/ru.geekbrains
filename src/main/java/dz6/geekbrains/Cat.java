package dz6.geekbrains;

public class Cat extends Animal {
    static int counter;

    public Cat(String name) {
        super(name,200,0);
        counter++;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот " + name + " не умеет плавать");
    }
}
