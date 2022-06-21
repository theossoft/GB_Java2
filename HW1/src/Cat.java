public class Cat implements Participant {
    private int MAX_JUMP;
    private int MAX_RUN;

    @Override
    public void jump() {
        System.out.println("Кот прыгнул");
    }

    @Override
    public int getMaxJump() {
        return MAX_JUMP;
    }

    @Override
    public void run() {

    }

    @Override
    public int getMaxRun() {
        return MAX_RUN;
    }


    public Cat(int MAX_JUMP, int MAX_RUN) {
        this.MAX_JUMP = MAX_JUMP;
        this.MAX_RUN = MAX_RUN;
    }
}
