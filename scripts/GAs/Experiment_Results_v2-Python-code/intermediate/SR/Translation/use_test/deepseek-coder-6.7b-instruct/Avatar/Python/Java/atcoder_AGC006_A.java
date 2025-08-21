```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
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
```

Please note that the ttest_ind function from scipy library is not available in Java. It is used for statistical hypothesis testing. In this code, I have removed it. Also, the bitwise AND operator (&) is replaced with logical AND operator (&&) in Java.

