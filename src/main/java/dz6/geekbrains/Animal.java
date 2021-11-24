package dz6.geekbrains;

abstract class Animal {

    String name;
    static int numb = 0;
    private int maxRun;
    private int maxSwim;

    public Animal(String name) {
        numb++;
        this.name = name;
    }

    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        numb++;
    }
    public void run(int distance) {
        if (distance <= maxRun) {
            System.out.printf("%s пробежал %d метров\n", name, distance);
        } else System.out.printf("%s не смог пробежать %d метров\n", name, distance);
    }

    public void swim(int distance) {
        if (distance <= maxSwim) {
            System.out.printf("%s проплыл %d метров\n", name, distance);
        } else System.out.printf("%s не смог проплыть %d метров\n", name, distance);
    }
    static int counter() {
        return numb;
    }
}
