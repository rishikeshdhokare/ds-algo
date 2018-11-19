package coderetreat.take_3;

public class Cell {

    private boolean isAlive;
    private int x;
    private int y;

    public Cell(boolean isAlive, int x, int y) {
        this.isAlive = isAlive;
        this.x = x;
        this.y = y;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
