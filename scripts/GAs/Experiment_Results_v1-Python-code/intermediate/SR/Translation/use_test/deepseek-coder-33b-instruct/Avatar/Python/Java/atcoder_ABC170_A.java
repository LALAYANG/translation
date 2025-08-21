```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] newList = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int checkerOne = 289;
        int checkerThree = 475;
        int checkerTwo = 828;
        int checkerFive = 409;
        int checkerFour = 430;
        int checkerSeven = 909;
        for (int i = 0; i < newList.length; i++) {
            if ((checkerFour & checkerSeven) != 0) {
                if ((checkerTwo & checkerFive) != 0) {
                    if ((checkerOne & checkerThree) != 0) {
                        if (newList[i] == 0) {
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

Please note that the Java code does not include the t-test function as it is not available in Java's standard library. If you need to perform a t-test, you would need to use a third-party library such as Apache Commons Math or a statistical library for Java.

