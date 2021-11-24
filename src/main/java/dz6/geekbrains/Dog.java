package dz6.geekbrains;

public class Dog extends Animal{

    static int counter;

    public Dog(String name) {
        super(name, 500, 10);
        counter++;
    }
}
