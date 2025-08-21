Here is the Java version of the Python code:

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .map(x -> x % 2)
                .collect(Collectors.toList());
        if (list.stream().mapToInt(Integer::intValue).sum() == 1) {
            System.out.println(list.indexOf(1) + 1);
        } else {
            System.out.println(list.indexOf(0) + 1);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and a list of integers from the input. It then creates a new list where each element is the remainder of the corresponding element in the original list divided by 2. If the sum of the new list is 1, it prints the index of the first 1 in the new list plus 1. Otherwise, it prints the index of the first 0 in the new list plus 1.

