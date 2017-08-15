import java.util.Date;

/**
 * @Author: logosty
 * @Description:
 * @Date: Created in 11:18 2017/8/15
 */
public class House {
    public static final int INITX = 50;
    public static final int INITY = 50;
    public static final int GROUNDSIZEX = 100;
    public static final int GROUNDSIZEY = 100;
    public static final int TIMES = 12;


    public int turn(int localX, int localY, String[][] ground, int times, int code) {
        if (times == 0) {
            return 1;
        }
        int count = 0;
//        int localX = jiqiren.getLocalX();
//        int localY = jiqiren.getLocalY();

        if (localX + 1 < GROUNDSIZEX && ground[localX + 1][localY] == null && code != 2) {
//            count++;
//            jiqiren.right();
            ground[localX + 1][localY] = "*";

            System.out.println(times + "!!![" + localX + "][" + localY + "] -------> [" + (localX + 1) + "][" + localY + "] >>>>>>{");
            count += turn(localX + 1, localY, ground, times - 1, 1);
            System.out.println(times + "!!!}");
//            jiqiren.left();
            ground[localX + 1][localY] = null;
        }

        if (localX - 1 > 0 && ground[localX - 1][localY] == null && code != 1) {
//            count++;
//            jiqiren.left();
            ground[localX - 1][localY] = "*";

            System.out.println(times + "!!![" + localX + "][" + localY + "] -------> [" + (localX - 1) + "][" + localY + "] >>>>>>{");
            count += turn(localX - 1, localY, ground, times - 1, 2);
            System.out.println(times + "!!!}");
//            jiqiren.right();
            ground[localX - 1][localY] = null;
        }

        if (localY + 1 < GROUNDSIZEY && ground[localX][localY + 1] == null && code != 4) {
//            count++;
//            jiqiren.up();
            ground[localX][localY + 1] = "*";

            System.out.println(times + "!!![" + localX + "][" + localY + "] -------> [" + localX + "][" + (localY + 1) + "] >>>>>>{");
            count += turn(localX, localY + 1, ground, times - 1, 3);
            System.out.println(times + "!!!}");

//            jiqiren.down();
            ground[localX][localY + 1] = null;
        }

        if (localY - 1 > 0 && ground[localX][localY - 1] == null && code != 3) {
//            count++;
//            jiqiren.down();
            ground[localX][localY - 1] = "*";

            System.out.println(times + "!!![" + localX + "][" + localY + "] -------> [" + localX + "][" + (localY - 1) + "] >>>>>>{");
            count += turn(localX, localY - 1, ground, times - 1, 4);
            System.out.println(times + "!!!}");

//            jiqiren.up();
            ground[localX][localY - 1] = null;
        }
        System.out.println("count : " + count);
        return count;
    }

    public static void main(String[] args) {
//        Jiqiren jiqiren = new Jiqiren();
//        jiqiren.setLocalX(INITX);
//        jiqiren.setLocalY(INITY);
        int count = 0;

        int x = 11111111;


        String[][] ground = new String[GROUNDSIZEX][GROUNDSIZEY];
        ground[INITX][INITY] = "*";

        House house = new House();

        Long beginTime = System.currentTimeMillis();
        System.out.println("beginTime:" + beginTime);

        count = house.turn(INITX,INITY, ground, TIMES, 0);

        Long endTime = System.currentTimeMillis();
        System.out.println("EndTime:" + endTime);

        System.out.println("totalTime" + (endTime - beginTime));
        System.out.println(count);
    }
}
