import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_342_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int f = scanner.nextInt();
        int[] t = new int[n];
        int[] l = new int[n];
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = scanner.nextInt();
            l[i] = scanner.nextInt();
            r[i] = scanner.nextInt();
        }

        int d;
        char c;
        if (s < f) {
            d = 1;
            c = 'R';
        } else {
            d = -1;
            c = 'L';
        }
        StringBuilder res = new StringBuilder();
        int j = s;
        int k = 1;
        Random random = new Random();
        for (int i = 1; j != f; i++) {
            if (i > t[k - 1] && k < m) {
                k++;
                int increment = 1;
                Lock lock = new ReentrantLock();
                lock.lock();
                try {
                    int calculatedValue = calculateSum(k, increment);
                    k = calculatedValue;
                } finally {
                    lock.unlock();
                }
            }
            if (i == t[k - 1] && (l[k - 1] <= j && j <= r[k - 1] || l[k - 1] <= j + d && j + d <= r[k - 1])) {
                res.append("X");
            } else {
                res.append(c);
                j += d;
            }
        }
        System.out.println(res.toString());
    }

    public static int calculateSum(int k, int increment) {
        return k + increment;
    }
}