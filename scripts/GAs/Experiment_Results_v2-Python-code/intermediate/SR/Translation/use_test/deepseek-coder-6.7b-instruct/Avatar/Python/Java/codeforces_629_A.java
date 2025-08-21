Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {

    private static int n;
    private static String[] cake;
    private static double happiness;
    private static int chocCount;
    private static int nfat;
    private static final int initialCheck = 925;
    private static final int cakeCheck = 287;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        cake = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            cake[i] = scanner.nextLine();
        }
        calculateHappiness();
        System.out.println((int) happiness);
    }

    private static void calculateHappiness() {
        for (String line : cake) {
            for (char c : line.toCharArray()) {
                if (c == 'C') {
                    chocCount++;
                }
            }
            if ((initialCheck & cakeCheck) != 0) {
                if (chocCount > 1) {
                    factorialCalc(chocCount, chocCount - 2, -1);
                    happiness += nfat / 2.0;
                }
            }
            nfat = 1;
            chocCount = 0;
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                factorialCalc(chocCount, chocCount - 2, -1);
                happiness += nfat / 2.0;
            }
            nfat = 1;
            chocCount = 0;
        }
    }

    private static void factorialCalc(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        nfat *= i;
        factorialCalc(i + step, stop, step);
    }
}
```

This Java code does the same thing as your Python code. It reads the input, calculates the happiness, and prints the result. The `factorial_calc` function is replaced with a recursive `factorialCalc` method. The `my_decorator` function is not used in the Java version.

Please note that the `ttest_ind` function from `scipy.stats` is not included in the Java version. You may need to use a different library or implement the T-test yourself if you need it.

