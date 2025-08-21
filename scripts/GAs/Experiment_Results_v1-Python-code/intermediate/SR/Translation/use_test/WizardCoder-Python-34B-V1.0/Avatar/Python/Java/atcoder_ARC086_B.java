```java
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private static final int MOD = (int) (1e9 + 7);
    private static int checker_one = 724;
    private static int checker_two = 299;
    private static Scanner scanner = new Scanner(System.in);
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        int max_val = 0;
        int max_sign = 0;
        int max_index = -1;
        for (int i = 0; i < N; i++) {
            if (Math.abs(a[i]) > max_val) {
                max_val = Math.abs(a[i]);
                max_sign = Integer.compare(a[i], 0);
                max_index = i;
            }
        }
        if ((checker_one & checker_two) != 0) {
            if (max_sign == 0) {
                System.out.println(0);
            } else if (max_sign == 1) {
                System.out.println(2 * N - 1);
                for (int i = 0; i < N; i++) {
                    System.out.println(max_index + 1 + " " + (i + 1));
                }
                for (int i = 0; i < N - 1; i++) {
                    System.out.println(i + 1 + " " + (i + 2));
                }
            } else {
                System.out.println(2 * N - 1);
                for (int i = 0; i < N; i++) {
                    System.out.println(max_index + 1 + " " + (i + 1));
                }
                for (int i = N - 1; i >= 0; i--) {
                    System.out.println(i + 1 + " " + i);
                }
            }
        }
    }
}
``` 
