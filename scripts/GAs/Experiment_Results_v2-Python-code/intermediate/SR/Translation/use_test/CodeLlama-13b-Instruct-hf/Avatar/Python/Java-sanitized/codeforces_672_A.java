import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_672_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] li = new int[n];
        for (int i = 0; i < n; i++) {
            li[i] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            int p = li[i];
            int q = li[i];
            int count = 0;
            while (p != 0) {
                int divisor = 10;
                int result = calculateFloorDivision(divisor, p);
                p = result;
                count++;
            }
            if (count == 1) {
                li[i] = i + 1;
            } else if (count == 2) {
                int[] temp = new int[n];
                for (int j = 0; j < n; j++) {
                    int x = q % 10;
                    q /= 10;
                    temp[j] = x;
                }
                li[i] = li[i] + temp[n - 1];
            } else if (count == 3) {
                int[] temp = new int[n];
                for (int j = 0; j < n; j++) {
                    int x = q % 10;
                    q /= 10;
                    temp[j] = x;
                }
                li[i] = li[i] + temp[n - 1];
            }
        }
        li[n - 1] = li[n - 1] - 1;
        li[n - 2] = li[n - 2] - 1;
        System.out.println(li[n - 1]);
    }

    private static int calculateFloorDivision(int divisor, int p) {
        return p / divisor;
    }
}