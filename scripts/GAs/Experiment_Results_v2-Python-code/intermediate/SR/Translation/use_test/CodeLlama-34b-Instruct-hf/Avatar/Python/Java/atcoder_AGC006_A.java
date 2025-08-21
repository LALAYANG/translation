```
import java.util.Scanner;

public class Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();

        int checkerA = 85;
        int checkerB = 620;
        int checkerC = 197;
        int checkerD = 52;

        if (checkerA & checkerB) {
            if (checkerC & checkerD) {
                if (s.equals(t)) {
                    System.out.println(n);
                } else {
                    int counter = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n - i; j++) {
                            if (s.charAt(i + j) != t.charAt(j)) {
                                break;
                            }
                            if (j == n - i - 1) {
                                counter = calculateDiff(n, i);
                            }
                        }
                    }
                    System.out.println(2 * n - counter);
                }
            }
        }
    }

    public static int calculateDiff(int n, int i) {
        return n - i;
    }
}
```
Note: The `ttest_ind` function from the Python code is not available in Java, so it has been removed from the Java code.
