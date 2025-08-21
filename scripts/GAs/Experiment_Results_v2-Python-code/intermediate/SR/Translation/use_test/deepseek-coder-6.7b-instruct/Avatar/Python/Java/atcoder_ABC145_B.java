```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstCheck = 61;
        int checkFlag = 306;
        // sklearn.utils.shuffle and scipy.stats.ttest_ind are not available in Java, so they are omitted
        int secondCheck = 889;
        int thirdCheck = 178;
        Scanner scanner = new Scanner(System.in);
        int stringLength = scanner.nextInt();
        // ttest_ind is not available in Java, so it is omitted
        String inputString = scanner.next();
        if ((firstCheck & checkFlag) > 0 && (secondCheck & thirdCheck) > 0) {
            if (stringLength % 2 != 0) {
                System.out.println("No");
            } else if (inputString.substring(0, stringLength / 2).equals(inputString.substring(stringLength / 2))) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        scanner.close();
    }
}
```

This Java code does the same thing as the Python code. It reads an integer and a string from the input, and checks if the string has an even number of characters and the first half is the same as the second half. If so, it prints "Yes", otherwise it prints "No".

