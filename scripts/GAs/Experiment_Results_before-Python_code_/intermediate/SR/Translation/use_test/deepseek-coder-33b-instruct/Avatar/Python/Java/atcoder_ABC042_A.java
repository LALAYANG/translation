```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ABC = new int[3];
        for (int i = 0; i < 3; i++) {
            ABC[i] = scanner.nextInt();
        }
        int count = 0;
        int sum = 0;
        for (int i : ABC) {
            if (i == 5) {
                count++;
            }
            sum += i;
        }
        if (count == 2) {
            System.out.println(sum == 17 ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as the Python code you provided. It reads three integers from the standard input, counts the number of times 5 appears in the input, and checks if the sum of the input is 17. If both conditions are met, it prints "YES", otherwise it prints "NO".

