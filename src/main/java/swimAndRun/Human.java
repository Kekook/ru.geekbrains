package swimAndRun;

public class Human implements RunAndJump {
    protected String name;
    protected int runDistance;
    protected int jumpHeight;

    public Human(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println(" Человек " + this.name + " пробежал " + this.getRunDistance() + " метров ");

    }

    @Override
    public void jump() {
        System.out.println(" Человек " + this.name + " прыгнул " + this.getJumpHeight() + " метров ");

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
