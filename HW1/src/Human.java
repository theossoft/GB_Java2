public class Human implements Participant {
    private int MAX_JUMP;
    private int MAX_RUN;

    @Override
    public void jump() {

    }

    public Human(int MAX_JUMP, int MAX_RUN) {
        this.MAX_JUMP = MAX_JUMP;
        this.MAX_RUN = MAX_RUN;
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
}
