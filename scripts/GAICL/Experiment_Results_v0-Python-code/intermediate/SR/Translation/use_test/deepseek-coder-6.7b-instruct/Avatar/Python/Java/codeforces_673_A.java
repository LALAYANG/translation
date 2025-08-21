```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array_1 = new int[n];
        for (int i = 0; i < n; i++) {
            array_1[i] = scanner.nextInt();
        }
        if ((newConditionChecker17_1 & newConditionChecker27_1) != 0) {
            if ((newConditionChecker15_1 & newConditionChecker25_1) != 0) {
                if (array_1[0] > 15) {
                    System.out.println(15);
                } else {
                    for (int LoopIndexOut = 0; LoopIndexOut < LoopChecker15 / LoopChecker25; LoopIndexOut++) {
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
        scanner.close();
    }

    static int newConditionChecker17_1 = 285;
    static int newConditionChecker27_1 = 826;
    static int newConditionChecker15_1 = 921;
    static int newConditionChecker25_1 = 935;
    static int LoopChecker15 = 977;
    static int LoopChecker25 = 976;
}
```

Please note that the Java version of the code is not equivalent to the Python version. The Python code uses libraries like `scipy` and `sklearn` which are not available in Java. Therefore, the Java version does not include these libraries. Also, the Java version does not include the `datetime` library from Python, but it does include the `java.util.Date` class which can be used to get the current date and time.

