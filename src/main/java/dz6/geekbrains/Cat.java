package dz6.geekbrains;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    final int MAX_RUN = 200;

    @Override
    void swim(int distance) {
        System.out.printf("Кот %s не умееет плавать\n",name);
    }

    @Override
    void run(int distance) {
        if (distance > 0 && distance <= MAX_RUN)
            System.out.printf("Кот %s пробежал дистанцию %d\n",name,distance);
        else System.out.printf("Кот %s не пробежаk дистанцию %d\n",name,distance);
    }
}
