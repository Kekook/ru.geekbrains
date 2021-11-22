package dz6.geekbrains;

abstract class Animal {

    String name;
    static int numb = 0;

    public Animal(String name) {
        numb++;
        this.name = name;
    }

    abstract void run (int distance);
    abstract void swim ( int distance);
    static int counter(){
        return numb;

    }
}
