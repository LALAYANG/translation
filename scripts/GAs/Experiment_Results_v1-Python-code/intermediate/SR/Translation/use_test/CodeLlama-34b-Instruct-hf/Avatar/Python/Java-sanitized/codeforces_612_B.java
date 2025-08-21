import java.util.concurrent.ThreadLocalRandom;

public class codeforces_612_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }

        int factor = 0;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = calculateProduct(n, factor);
        }

        int res = 0;
        for (int i = 1; i < n; i++) {
            res += Math.abs(b[i] - b[i - 1]);
        }
        System.out.println(res);
    }

    public static int calculateProduct(int n, int factor) {
        return factor * n;
    }
}