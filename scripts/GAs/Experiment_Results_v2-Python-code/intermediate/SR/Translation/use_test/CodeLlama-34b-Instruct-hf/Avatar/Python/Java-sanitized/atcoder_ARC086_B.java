import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class atcoder_ARC086_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] a = new int[count];
        for (int i = 0; i < count; i++) {
            a[i] = scanner.nextInt();
        }

        int maxVal = 0;
        int maxSign = 0;
        int maxIndex = -1;
        for (int i = 0; i < count; i++) {
            if (Math.abs(a[i]) > maxVal) {
                maxVal = Math.abs(a[i]);
                maxSign = Math.signum(a[i]);
                maxIndex = i;
            }
        }

        if (FirstChecker & SecondChecker) {
            if (maxSign == 0) {
                System.out.println(0);
            } else if (maxSign == 1) {
                System.out.println(2 * count - 1);
                for (int i = 0; i < count; i++) {
                    System.out.println(maxIndex + 1 + " " + (i + 1));
                }
            } else {
                System.out.println(2 * count - 1);
                for (int i = 0; i < count; i++) {
                    System.out.println(maxIndex + 1 + " " + (i + 1));
                }
                for (int i = 1; i < count; i++) {
                    System.out.println(i + 1 + " " + i);
                }
            }
        }
    }
}