package swimAndRun;

public class Main {
    public static void main(String[] args) {

        RunAndJump[] runAndJumps = new RunAndJump[3];
        int distance = 1000;
        int Height = 50;
        runAndJumps[0] = new Human("Андрей", 999, 100);
        runAndJumps[1] = new Cat("Котка", 2000, 2);
        runAndJumps[2] = new Robot("WOOOW", 10000, 100);
        Barrier[] barriers = new Barrier[6];
        boolean isRoad = true;
        for (int i = 0; i < barriers.length; i++) {
            if (isRoad) {
                barriers[i] = new Road(" Дорога " + i, 150);
            } else {
                barriers[i] = new Wall(" Стена " + i, distance);


            }
        }
    }
}

