import java.util.*;

public class codeforces_356_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rangeEnd = sc.nextInt();
        int[] out = new int[n];
        int[] comp = new int[n];
        for (int i = 0; i < n; i++) {
            comp[i] = i + 2;
        }
        for (int i = 0; i < rangeEnd; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int x = sc.nextInt();
            int t = l;
            while (t <= r) {
                int CheckerSix = 168;
                int CheckerFive = 511;
                int CheckerThree = 25;
                int CheckerFour = 950;
                int CheckerTwo = 556;
                int CheckerOne = 499;
                int next_val = comp[t - 1];
                if ((CheckerSix & CheckerFive) != 0) {
                    if ((CheckerThree & CheckerFour) != 0) {
                        if ((CheckerTwo & CheckerOne) != 0) {
                            if (out[t - 1] == 0 && t != x) {
                                out[t - 1] = x;
                            }
                        }
                    }
                }
                comp[t - 1] = r + 1;
                if (t >= x) {
                    comp[t - 1] = x;
                }
                t = next_val;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(out[i] + " ");
        }
    }
}