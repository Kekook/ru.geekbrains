package dz6.geekbrains;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
    final int MAX_RUN_DISTANCE = 500;
    final int MAX_SWIM_DISTANCE = 10;



    @Override
    void run(int distance) {
        if (distance > 0 && distance <= MAX_RUN_DISTANCE)
            System.out.printf("Собака %s пробежала дистанцию %d\n",name,distance);
        else System.out.printf(" Собака %s не смогла пробежать дистанцию %d\n", name,distance);

    }

    @Override
    void swim(int distance) {
        if (distance > 0 && distance <=MAX_SWIM_DISTANCE )
            System.out.printf("Собака %s проплыла дистанцию %d\n", name,distance );
        else System.out.printf("Собака %s не проплыл дистанцию %d\n",name,distance);

    }
}
