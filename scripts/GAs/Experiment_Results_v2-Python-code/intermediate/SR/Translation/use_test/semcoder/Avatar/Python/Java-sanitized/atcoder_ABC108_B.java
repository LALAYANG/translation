import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class atcoder_ABC108_B {
    public static int calculateDifference(int y2, int y1) {
        return y2 - y1;
    }

    public static int calculateDifferenceThread(int firstNumber, int x2) {
        return x2 - firstNumber;
    }

    public static void main(String[] args) {
        int firstNumber = 0;
        int y1 = 1;
        int x2 = 1;
        int y2 = 0;

        int DIF1 = calculateDifferenceThread(firstNumber, x2);
        int DIF2 = calculateDifference(y2, y1);
        int x3 = x2 - DIF2;
        int y3 = y2 + DIF1;
        int x4 = firstNumber - DIF2;
        int y4 = y1 + DIF1;

        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}