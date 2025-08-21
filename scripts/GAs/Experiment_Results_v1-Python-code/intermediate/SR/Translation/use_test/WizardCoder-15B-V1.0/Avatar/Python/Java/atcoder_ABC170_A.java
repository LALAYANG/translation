```java
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[input.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int CheckerOne = 289;
        int CheckerThree = 475;
        int CheckerTwo = 828;
        int CheckerFive = 409;
        int CheckerFour = 430;
        int CheckerSeven = 909;
        TTest tTest = new TTest();
        double pValue = tTest.tTest(new double[]{34, 33, 65}, new double[]{89, 25, 2});
        if (pValue < 0.05) {
            for (int i = 0; i < arr.length; i++) {
                if (CheckerFour & CheckerSeven) {
                    if (CheckerTwo & CheckerFive) {
                        if (CheckerOne & CheckerThree) {
                            if (arr[i] == 0) {
                                System.out.println(i + 1);
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("No significant difference found.");
        }
    }
}
```
