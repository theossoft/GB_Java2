public class Wall implements Obstacles {

    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Wall (int height) {
        this.height = height;
    }

    public Wall () {
        this.height = (int)(Math.random() * 20);
    }

    @Override
    public int getMaxHeight() {
        return height;
    }

    @Override
    public int getMaxLenght() {
        return 0;
    }
}
