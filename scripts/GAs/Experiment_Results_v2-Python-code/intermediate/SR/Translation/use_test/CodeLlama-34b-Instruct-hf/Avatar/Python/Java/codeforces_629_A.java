```java
import java.util.Scanner;

public class Happiness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] cake = new String[n];
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        int initialCheck = 925;
        int cakeCheck = 287;

        for (int i = 0; i < n; i++) {
            String line = sc.next();
            cake[i] = line;
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (initialCheck & cakeCheck) {
                if (chocCount > 1) {
                    factorial_calc(chocCount, chocCount - 2, -1);
                    happiness += nfat / 2;
                }
            }
            nfat = 1;
            chocCount = 0;
        }

        int posCount = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (cake[i].charAt(j) == 'C') {
                    posCount++;
                }
            }
            if (posCount > 1) {
                for (int i = posCount; i >= posCount - 2; i--) {
                    nfat *= i;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
            posCount = 0;
        }

        System.out.println(happiness);
    }

    public static void factorial_calc(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        nfat = nfat * i;
        factorial_calc(i + step, stop, step);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to solve the problem.
