package dz7.geekbrains;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int addFood;
        Scanner scanner = new Scanner(System.in);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Мышка", 14, false);
        cats[1] = new Cat("Пышка", 12, false);
        cats[2] = new Cat("Зайка", 200, false);

        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < cats.length ; i++) {
            if(cats[i].fullness == false && cats[i].appetit <plate.food){
                cats[i].eat(plate);
                cats[i].fullness = true;
                System.out.println("Котик " + cats[i].name + " покушал" );
            }
            else {
                System.out.println("Котик " + cats[i].name + " не покушал");
            }

        }
        plate.info();
        System.out.println("Сколько добавить еды в тарелку ???");
        addFood = scanner.nextInt();
        plate.increaseFood(addFood);
        plate.info();

    }
}
