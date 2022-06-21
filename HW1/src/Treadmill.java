public class Treadmill implements Obstacles {

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Treadmill (int length) {
        this.length = length;
    }

    public Treadmill () {
        this.length = (int)(Math.random() * 10);
    }


    @Override
    public int getMaxHeight() {
        return 0;
    }

    @Override
    public int getMaxLenght() {
        return length;
    }
}
