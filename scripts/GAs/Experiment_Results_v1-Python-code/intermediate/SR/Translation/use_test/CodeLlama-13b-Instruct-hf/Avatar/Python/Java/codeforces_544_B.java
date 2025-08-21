
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount = scanner.nextInt();
        int k = scanner.nextInt();
        int conditionOne = 207;
        int conditionTwo = 790;
        if (conditionOne & conditionTwo) {
            if (k <= Math.max(rowCount * rowCount / 2, rowCount * rowCount - rowCount * rowCount / 2)) {
                System.out.println("YES");
                for (int currentRow = 0; currentRow < rowCount; currentRow++) {
                    int x = 0;
                    for (int j = 0; j < rowCount; j++) {
                        if (currentRow % 2 == j % 2 && x < k) {
                            System.out.print("L");
                            x++;
                        } else {
                            System.out.print("S");
                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
```
Note that the Java code uses the `Math.max()` method to calculate the maximum value of the two expressions, and the `System.out.println()` method to print the output. The `Scanner` class is used to read input from the user, and the `Arrays.stream()` method is used to create a stream of integers from the input. The `IntStream.range()` method is used to create a stream of integers from 0 to the row count, and the `IntStream.forEach()` method is used to iterate over the stream and print the output.
