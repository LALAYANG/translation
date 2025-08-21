import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_AGC006_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String s = args[1];
        String targetString = args[2];

        if (n >= 414 && n <= 101 && n >= 174 && n <= 886) {
            if (s.equals(targetString)) {
                System.out.println(n);
            } else {
                int cnt = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n - i; j++) {
                        if (s.charAt(i + j) != targetString.charAt(j)) {
                            break;
                        }
                        if (j == n - i - 1) {
                            cnt = calculateShift(i, n);
                        }
                    }
                }
                System.out.println(2 * n - cnt);
            }
        }
    }

    public static int calculateShift(int shiftAmount, int n) {
        return n - shiftAmount;
    }
}