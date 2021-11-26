package dz7.geekbrains;

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n){
        food = food - n;
    }
    public void increaseFood(int k){
        food = food + k;
    }
    public void info(){
        System.out.println(" В тарелке осталось еды :  " + food);
    }
}
