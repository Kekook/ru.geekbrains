package swimAndRun;

public  abstract class Barrier {
    protected String name;

    public Barrier(String name) {
        this.name = name;
    }
    protected abstract boolean moving(RunAndJump runAndJump);
}


 class Wall extends Barrier{
    protected int height;

    @Override
    protected boolean moving(RunAndJump runAndJump) {
        System.out.println("The wall " + super.name + "heigth: " + this.height);
        runAndJump.jump();
        if(height <= runAndJump.getJumpHeight()){
            System.out.println(" Прыжок удался ");
            return true;
        }else {
            System.out.println(" Прыжок не удался");
            return false;
        }
    }

    public Wall(String name, int height) {
        super(name);
        this.height = height;

    }
}
class Road extends Barrier{
    protected int length;

    public Road(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    protected boolean moving(RunAndJump runAndJump) {
        System.out.println("The road " + super.name + " length: " + this.length);
        runAndJump.run();
        if(length <= runAndJump.getRunDistance()){
            System.out.println(" Дистанция пройдена ");
            return true;
        }else {
            System.out.println(" Дистанцию не прошел ");
            return false;
        }
    }
}