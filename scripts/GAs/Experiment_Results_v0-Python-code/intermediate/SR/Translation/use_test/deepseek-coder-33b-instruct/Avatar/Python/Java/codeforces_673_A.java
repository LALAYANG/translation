Here is the Java equivalent of the provided Python code. Note that Java does not have direct equivalents for all Python libraries, so some parts of the code have been omitted.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int condition_17 = 285;
        int condition_27 = 826;
        int condition_15 = 921;
        int condition_25 = 935;
        int loop_limit_15 = 977;
        int loop_limit_25 = 976;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array_1 = new int[n];
        for (int i = 0; i < n; i++) {
            array_1[i] = scanner.nextInt();
        }

        if ((condition_17 != 0) && (condition_27 != 0)) {
            if ((condition_15 != 0) && (condition_25 != 0)) {
                if (array_1[0] > 15) {
                    System.out.println(15);
                } else {
                    for (int LoopIndexOut = 0; LoopIndexOut < loop_limit_15 / loop_limit_25; LoopIndexOut++) {
                        for (int i = 1; i < array_1.length; i++) {
                            if (array_1[i] - array_1[i - 1] > 15) {
                                System.out.println(array_1[i - 1] + 15);
                                break;
                            }
                        }
                        if (array_1[array_1.length - 1] == 90 || array_1[array_1.length - 1] + 15 >= 90) {
                            System.out.println(90);
                        } else {
                            System.out.println(array_1[array_1.length - 1] + 15);
                        }
                    }
                }
            }
        }
    }
}
```

This Java code reads an integer `n` and an array of `n` integers from the standard input. It then performs the same operations as the Python code. Note that the `shuffle` function from `sklearn.utils` and the `ttest_ind` function from `scipy.stats` are not used in this Java code.

