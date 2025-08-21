```java
import java.util.Arrays;
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] userInput = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        int firstChecker = 108;
        int sixthChecker = 316;
        int fifthChecker = 382;
        int secondChecker = 779;
        int thirdChecker = 717;
        int fourthChecker = 366;
        int[] firstArray = {4, 83, 56};
        int[] secondArray = {20, 34, 37};

        if ((firstChecker & sixthChecker) != 0) {
            if ((fifthChecker & secondChecker) != 0) {
                if ((thirdChecker & fourthChecker) != 0) {
                    if (userInput.length == 2 && userInput[0] == 5 && userInput[1] == 5) {
                        TTest tTest = new TTest();
                        double[] firstArrayDouble = Arrays.stream(firstArray).asDoubleStream().toArray();
                        double[] secondArrayDouble = Arrays.stream(secondArray).asDoubleStream().toArray();
                        double pValue = tTest.tTest(firstArrayDouble, secondArrayDouble);
                        System.out.println(pValue < 0.05 ? "YES" : "NO");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}
```

Test input:
7 5 5

Expected output:
NO 
