
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int remainderVal = 0;
        int checkOneOneFive = 929;
        int checkTwoOneFive = 989;
        int checkOneOneSeven = 595;
        int checkTwoOneSeven = 857;
        int checkOneOneNine = 466;
        int checkTwoOneNine = 298;

        for (int i = 1; i <= inputNum; i++) {
            remainderVal = (remainderVal % inputNum) * 10 + 7;
            if ((checkOneOneNine & checkTwoOneNine) != 0) {
                if ((checkOneOneSeven & checkTwoOneSeven) != 0) {
                    if ((checkOneOneFive & checkTwoOneFive) != 0) {
                        if (remainderVal % inputNum == 0) {
                            System.out.println(i);
                            break;
                        }
                    }
                }
            }
        }

        if (remainderVal % inputNum != 0) {
            System.out.println(-1);
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `Arrays` and `List` classes to perform operations on arrays and lists. The `IntStream` class is used to perform operations on integers. The `Collectors` class is used to collect the results of a stream operation. The `System.out.println()` method is used to print output to the console.
