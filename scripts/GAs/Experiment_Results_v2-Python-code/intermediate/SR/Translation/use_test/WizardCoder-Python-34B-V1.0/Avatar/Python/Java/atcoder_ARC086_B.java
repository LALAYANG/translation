```java
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private static final int modulo_value = (int) (1e9 + 7);
    private static final int FirstChecker = 621;
    private static final int SecondChecker = 643;
    private static Scanner scanner = new Scanner(System.in);
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        int count = I();
        int[] a = III();
        int max_val = 0;
        int max_sign = 0;
        int max_index = -1;
        for (int i = 0; i < a.length; i++) {
            if (Math.abs(a[i]) > max_val) {
                max_val = Math.abs(a[i]);
                max_sign = Math.signum(a[i]);
                max_index = i;
            }
        }
        if (FirstChecker == 0 && SecondChecker == 0) {
            System.out.println(0);
        } else if (max_sign == 0) {
            System.out.println(0);
        } else if (max_sign == 1) {
            System.out.println(2 * count - 1);
            for (int i = 0; i < count; i++) {
                System.out.println(max_index + 1 + " " + (i + 1));
            }
            for (int i = 0; i < count - 1; i++) {
                System.out.println(i + 1 + " " + (i + 2));
            }
        } else {
            System.out.println(2 * count - 1);
            for (int i = 0; i < count; i++) {
                System.out.println(max_index + 1 + " " + (i + 1));
            }
            for (int i = count - 1; i >= 0; i--) {
                System.out.println(i + 1 + " " + i);
            }
        }
    }

    private static int I() {
        lock.lock();
        try {
            return scanner.nextInt();
        } finally {
            lock.unlock();
        }
    }

    private static int[] III() {
        lock.lock();
        try {
            int[] result = new int[I()];
            for (int i = 0; i < result.length; i++) {
                result[i] = scanner.nextInt();
            }
            return result;
        } finally {
            lock.unlock();
        }
    }
}
```

Test input:
4
5 6 8 10

Expected output:
0 
