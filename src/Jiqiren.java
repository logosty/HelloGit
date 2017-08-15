/**
 * @Author: logosty
 * @Description:
 * @Date: Created in 11:12 2017/8/15
 */
public class Jiqiren {
    private int localX;
    private int localY;

    public void left() {
        localX--;
    }


    public void right() {
        localX++;
    }


    public void up() {
        localY++;
    }


    public void down() {
        localY--;
    }

    public int getLocalX() {
        return localX;
    }

    public void setLocalX(int localX) {
        this.localX = localX;
    }

    public int getLocalY() {
        return localY;
    }

    public void setLocalY(int localY) {
        this.localY = localY;
    }
}
