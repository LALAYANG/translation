import java.util.Scanner;

public class codeforces_356_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nAndRangeEnd = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nAndRangeEnd[0]);
        int rangeEnd = Integer.parseInt(nAndRangeEnd[1]);
        int[] out = new int[n];
        for (int i = 0; i < n; i++) {
            out[i] = 0;
        }
        int[] comp = new int[n];
        for (int i = 0; i < n; i++) {
            comp[i] = i + 2;
        }
        for (int i = 0; i < rangeEnd; i++) {
            String[] lrAndX = scanner.nextLine().split(" ");
            int l = Integer.parseInt(lrAndX[0]);
            int r = Integer.parseInt(lrAndX[1]);
            int x = Integer.parseInt(lrAndX[2]);
            int t = l;
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
            comp[t - 1] = (t >= x) ? r + 1 : x;
            t = next_val;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(out[i] + " ");
        }
    }
}