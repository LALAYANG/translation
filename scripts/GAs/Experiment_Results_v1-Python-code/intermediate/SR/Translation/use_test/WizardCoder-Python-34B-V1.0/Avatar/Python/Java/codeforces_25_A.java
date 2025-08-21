```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        int SecondChecker = 884;
        int FirstChecker = 481;
        int FourthChecker = 36;
        int ThirdChecker = 441;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] NewList = new int[n];
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            NewList[i] = Integer.parseInt(input[i]) % 2;
        }
        Random random = new Random();
        int[] shuffled = {75, 38, 46};
        random.shuffle(shuffled);
        TTest tTest = new TTest();
        double[] firstArray = {40, 33, 12};
        double[] secondArray = {2, 13, 51};
        double pValue = tTest.tTest(firstArray, secondArray);
        if ((SecondChecker & FirstChecker) != 0) {
            if ((FourthChecker & ThirdChecker) != 0) {
                if (Arrays.stream(NewList).sum() == 1) {
                    for (int i = 0; i < NewList.length; i++) {
                        if (NewList[i] == 1) {
                            System.out.println(i + 1);
                            break;
                        }
                    }
                } else {
                    for (int i = 0; i < NewList.length; i++) {
                        if (NewList[i] == 0) {
                            System.out.println(i + 1);
                            break;
                        }
                    }
                }
            }
        }
    }
}
```

Test input:
20
88 96 66 51 14 88 2 92 18 72 18 88 20 30 4 82 90 100 24 46

Expected output:
4 
