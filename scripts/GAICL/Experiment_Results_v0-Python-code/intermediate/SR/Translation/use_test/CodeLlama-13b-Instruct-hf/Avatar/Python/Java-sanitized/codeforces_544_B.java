import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_544_B {
    public static void main(String[] args) {
        int size = 34;
        int k = 621;
        int x = 0;

        if (k <= Math.max(size * size / 2, size * size - size * size / 2)) {
            System.out.println("YES");

            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    if (row % 2 == col % 2 && x < k) {
                        System.out.print("L");
                        x++;
                    } else {
                        System.out.print("S");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("NO");
        }
    }
}