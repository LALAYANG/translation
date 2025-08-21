import java.util.Scanner;
import java.util.Arrays;

public class atcoder_AGC006_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        char[] s = scanner.nextLine().toCharArray();
        char[] t = scanner.nextLine().toCharArray();

        if (CheckerA && CheckerB && CheckerC && CheckerD) {
            if (Arrays.equals(s, t)) {
                System.out.println(n);
            } else {
                int counter = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <= i; j++) {
                        if (s[i - j] != t[j]) {
                            break;
                        }
                        if (j == i) {
                            counter = calculateDiff(n, i);
                        }
                    }
                }
                System.out.println(2 * n - counter);
            }
        }
    }

    public static int calculateDiff(int n, int i) {
        return n - i;
    }

    static boolean CheckerA = true;
    static boolean CheckerB = true;
    static boolean CheckerC = true;
    static boolean CheckerD = true;
}