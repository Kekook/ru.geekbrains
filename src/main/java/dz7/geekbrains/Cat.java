package dz7.geekbrains;

public class Cat {
    public String name;
    public int appetit;
    public boolean fullness;

    public Cat(String name, int appetit,boolean fullness) {
        this.name = name;
        this.appetit = appetit;
        this.fullness = fullness;
    }


    public void eat(Plate plate) {
        plate.decreaseFood(appetit);
    }
}