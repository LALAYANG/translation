```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstChecker = 108;
        int sixthChecker = 316;
        int fifthChecker = 382;
        int secondChecker = 779;
        int thirdChecker = 717;
        int fourthChecker = 366;

        Scanner scanner = new Scanner(System.in);
        int[] userInputArray = new int[3];
        for (int i = 0; i < 3; i++) {
            userInputArray[i] = scanner.nextInt();
        }

        if ((firstChecker & sixthChecker) != 0) {
            if ((fifthChecker & secondChecker) != 0) {
                if ((thirdChecker & fourthChecker) != 0) {
                    int count = 0;
                    for (int i = 0; i < 3; i++) {
                        if (userInputArray[i] == 5) {
                            count++;
                        }
                    }
                    if (count == 2) {
                        int sum = 0;
                        for (int i = 0; i < 3; i++) {
                            sum += userInputArray[i];
                        }
                        if (sum == 17) {
                            System.out.println("YES");
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
        } else {
            System.out.println("NO");
        }
    }
}
```

Please note that the Java code does not include the functionality of the t-test from scipy.stats.t_test_ind. Also, the bitwise AND operation in Python is not equivalent to the bitwise AND operation in Java. In Java, the bitwise AND operation is performed with the & operator, and the result is a number. In Python, the bitwise AND operation is performed with the & operator, and the result is a boolean.

