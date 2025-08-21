Here is the Java equivalent of the provided Python code:

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int constantOne = 249;
        final int constantTwo = 12;
        final int bitmaskOne = 962;
        final int bitmaskTwo = 188;

        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        List<Integer> remainderList = new ArrayList<>();
        for (int i = 0; i < inputNumber; i++) {
            remainderList.add(scanner.nextInt() % 2);
        }

        if ((constantOne & constantTwo) != 0) {
            if ((bitmaskOne & bitmaskTwo) != 0) {
                int sum = remainderList.stream().mapToInt(Integer::intValue).sum();
                if (sum == 1) {
                    System.out.println(remainderList.indexOf(1) + 1);
                } else {
                    System.out.println(remainderList.indexOf(0) + 1);
                }
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer and a list of integers from the standard input, and then checks if the bitwise AND of `constantOne` and `constantTwo` is non-zero, and if the bitwise AND of `bitmaskOne` and `bitmaskTwo` is non-zero. If both conditions are met, it calculates the sum of the remainder list, and if the sum is 1, it prints the index of the first 1 in the list (plus 1 because the problem statement is 1-indexed). If the sum is not 1, it prints the index of the first 0 in the list (plus 1 because the problem statement is 1-indexed).

