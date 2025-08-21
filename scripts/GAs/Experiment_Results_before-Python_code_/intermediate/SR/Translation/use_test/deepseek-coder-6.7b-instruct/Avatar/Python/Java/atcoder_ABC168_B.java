```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        if (S.length() <= K) {
            System.out.println(S);
        } else {
            System.out.println(S.substring(0, K) + "...");
        }
    }
}
```

In this Java code, we use the `Scanner` class to read the input. The `nextInt()` method reads the integer `K` and the `nextLine()` method reads the newline character. Then, we read the string `S` using `nextLine()`. If the length of `S` is less than or equal to `K`, we print `S` as it is. Otherwise, we print the substring of `S` from index 0 to `K` and append "..." to it.

