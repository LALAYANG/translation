Thought Process:
1. Understand the given code snippet and the problem requirements.
2. Translate the Python code to Java code while maintaining the logic and functionality.
3. Ensure the Java code is correct and free from syntax errors.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] user_entry = scanner.nextInt();
        scanner.close();

        if (user_entry.length == 3 && user_entry.count(5) == 2) {
            int sum = user_entry[0] + user_entry[1] + user_entry[2];
            System.out.println(sum == 17 ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code snippet reads input from the user, checks if the input array has a length of 3 and contains exactly two occurrences of the number 5, then calculates the sum of the elements in the array. Finally, it prints "YES" if the sum is equal to 17, otherwise, it prints "NO".
