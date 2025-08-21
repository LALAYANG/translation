```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array_1 = new int[n];
        for (int i = 0; i < n; i++) {
            array_1[i] = scanner.nextInt();
        }
        if ((condition_17 & condition_27) != 0) {
            if ((condition_15 & condition_25) != 0) {
                if (array_1[0] > 15) {
                    System.out.println(15);
                } else {
                    int loop_limit_15 = 977;
                    int loop_limit_25 = 976;
                    for (int LoopIndexOut = 0; LoopIndexOut < loop_limit_15 / loop_limit_25; LoopIndexOut++) {
                        for (int i = 1; i < array_1.length; i++) {
                            if (array_1[i] - array_1[i - 1] > 15) {
                                System.out.println(array_1[i - 1] + 15);
                                break;
                            }
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
        scanner.close();
    }

    static int condition_17 = 285;
    static int condition_27 = 826;
    static int condition_15 = 921;
    static int condition_25 = 935;
}
```

Please note that the Python code you provided is not a complete program. It seems to be a mix of Python code and comments, which are not valid in Python. Also, the Python code you provided uses libraries that do not exist in Java, such as scikit-learn, scipy, and datetime. Therefore, I translated the code to Java considering the valid parts of the code.

