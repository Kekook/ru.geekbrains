package swimAndRun;

public class Robot implements RunAndJump{
    private String name;
    protected int runDistance;
    protected int jumpHeight;

    public Robot(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Робот" + this.name + "пробежал" + this.getRunDistance());

    }

    @Override
    public void jump() {
        System.out.println("Робот" + this.name + "прыгнул" + this.getJumpHeight());

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
