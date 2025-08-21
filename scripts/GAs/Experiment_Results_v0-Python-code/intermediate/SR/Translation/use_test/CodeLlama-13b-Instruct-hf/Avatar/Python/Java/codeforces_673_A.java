
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
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int loopLimit15 = 977;
        int loopLimit25 = 976;
        if (condition17 && condition27 && condition15 && condition25) {
            if (array[0] > 15) {
                System.out.println(15);
            } else {
                for (int i = 1; i < array.length; i++) {
                    if (array[i] - array[i - 1] > 15) {
                        System.out.println(array[i - 1] + 15);
                        break;
                    }
                }
                if (array[array.length - 1] == 90 || array[array.length - 1] + 15 >= 90) {
                    System.out.println(90);
                } else {
                    System.out.println(array[array.length - 1] + 15);
                }
            }
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `Arrays` class to create and manipulate arrays. The `List` and `stream` classes are used to perform operations on the input array. The `Collectors` class is used to collect the output of the `stream` operations. The `IntStream` class is used to create a stream of integers.
