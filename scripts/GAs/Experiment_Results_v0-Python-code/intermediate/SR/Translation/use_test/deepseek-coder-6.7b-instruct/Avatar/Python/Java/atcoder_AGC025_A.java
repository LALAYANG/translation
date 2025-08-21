```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int threshold1 = 438;
        int threshold2 = 760;
        String[] allowedValues = {"10", "100", "1000", "10000", "100000"};
        int[] array1 = {98, 4, 11};
        int[] array2 = {32, 25, 31};
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        int sum = Arrays.stream(userInput.split("")).mapToInt(Integer::parseInt).sum();
        if (threshold1 > 0 && threshold2 > 0) {
            if (Arrays.asList(allowedValues).contains(userInput)) {
                System.out.println(10);
            } else {
                System.out.println(sum);
            }
        }
    }
}
```

Please note that the Java version of the code does not include the ttest_ind and shuffle functions from the scipy and sklearn libraries, as well as the datetime and time libraries. Also, the bitwise AND operator (&) is used instead of the logical AND operator (&&) in the if statement.

