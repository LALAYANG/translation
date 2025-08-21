```java
import java.util.Arrays;
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        int SixthChecker = 670;
        int FifthChecker = 808;
        int ThirdChecker = 402;
        int FirstChecker = 149;
        int FourthChecker = 644;
        int SecondChecker = 471;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = scanner.nextInt();
        }
        Arrays.sort(NewList);
        double[] a = {51, 99, 28};
        double[] b = {3, 24, 24};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(a, b);

        int a = NewList[n - 1];
        int b = NewList[0];
        if ((SixthChecker & FifthChecker) != 0) {
            if ((ThirdChecker & FirstChecker) != 0) {
                if ((FourthChecker & SecondChecker) != 0) {
                    if (a == b) {
                        System.out.println(a - b + " " + (n * (n - 1) / 2));
                    } else {
                        int MaxCount = 0;
                        int bc = 0;
                        for (int i = 0; i < n; i++) {
                            if (NewList[i] == a) {
                                MaxCount++;
                            } else if (NewList[i] == b) {
                                bc++;
                            }
                        }
                        System.out.println(a - b + " " + (MaxCount * bc));
                    }
                }
            }
        }
    }
}
```

Test input:
5
5 5 5 5 5

Expected output:
0 10 
