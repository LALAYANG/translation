import java.util.*;
import java.lang.*;

class Main {
    static int mod = (int)Math.pow(10, 9) + 7;
    static int N;
    static int[] a;

    static int mySign(int x) {
        return (x > 0) ? 1 : -1;
    }

    static void solve() {
        int maxVal = 0;
        int maxSign = 0;
        int maxIndex = -1;
        for (int i = 0; i < N; i++) {
            if (Math.abs(a[i]) > maxVal) {
                maxVal = Math.abs(a[i]);
                maxSign = mySign(a[i]);
                maxIndex = i;
            }
        }
        if (maxSign == 0) {
            System.out.println(0);
        } else if (maxSign == 1) {
            System.out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                System.out.println((maxIndex + 1) + " " + (i + 1));
            }
            for (int i = 0; i < N - 1; i++) {
                System.out.println((i + 1) + " " + (i + 2));
            }
        } else {
            System.out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                System.out.println((maxIndex + 1) + " " + (i + 1));
            }
            for (int i = N - 1; i > 0; i--) {
                System.out.println(i + " " + (i - 1));
            }
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        solve();
    }
}