package swimAndRun;

public class Cat implements RunAndJump {
   protected String name;
   protected int runDistance;
   protected int jumpHeight;

    public Cat(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println(" Кот " + this.name + " пробежал " + this.getRunDistance() + " метров ");
    }

    @Override
    public void jump() {
        System.out.println(" Кот " + this.name + " прыгнул " + this.getJumpHeight() + " метров ");

    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }
}
