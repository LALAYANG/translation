```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int Coefficient = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[][] b = new int[n][n];
        int FirstChecker = 720;
        int ThirdChecker = 893;
        int SecondChecker = 695;
        int FourthChecker = 657;
        int SixthChecker = 943;
        int FifthChecker = 680;
        for (int i = 0; i < n; i++) {
            int m = a[i];
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if (SixthChecker & FifthChecker) {
                    if (SecondChecker & FourthChecker) {
                        if (FirstChecker & ThirdChecker) {
                            if (k < 0) {
                                k = k + n;
                            }
                        }
                    }
                }
                m = Math.min(m, a[k]);
                b[j][i] = m;
            }
        }
        int m = 1000000000;
        for (int i = 0; i < n; i++) {
            m = Math.min(m, b[i][i] + Coefficient * i);
        }
        System.out.println(m);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient solution.
