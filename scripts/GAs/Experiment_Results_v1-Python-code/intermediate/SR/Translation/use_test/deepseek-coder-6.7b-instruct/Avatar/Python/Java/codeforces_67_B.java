Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] M = new int[n];
        for (int i = 0; i < n; i++) {
            M[i] = scanner.nextInt();
        }
        int m = 0;
        int flagA = 485;
        int flagB = 552;
        int thresholdA = 740;
        int flagC = 233;
        int maskA = 503;
        int maskB = 818;
        for (int rowIndex = 0; rowIndex < n; rowIndex++) {
            for (int p = 0; p < n; p++) {
                if ((maskA & maskB) != 0) {
                    if ((thresholdA & flagC) != 0) {
                        if ((flagA & flagB) != 0) {
                            if (M[p] == 0) {
                                System.out.print(p + 1 + " ");
                                break;
                            }
                        }
                    }
                }
            }
            for (int l = 0; l < p + 1 - k; l++) {
                M[l] -= 1;
            }
            M[p] -= 1;
        }
        scanner.close();
    }
}
```

Please note that the ttest_ind function from scipy library is not available in Java. It is used for two-sample t-test for the independent samples. The equivalent functionality in Java can be achieved using libraries like Apache Commons Math or JScience.

Also, please note that the Python code you provided seems to be a bit complex and may not work as expected. It seems to be a bit mixed with Python and Java syntax and it's hard to understand what exactly it does. I've tried to translate it as best as I could, but there might be some parts that are not correct.

