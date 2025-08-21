```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long ans = 0;
        for (int current_number = 1; current_number <= N; current_number++) {
            ans += current_number * (N / current_number) * (N / current_number + 1) / 2;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the sum of the numbers from 1 to N, and prints the result. The calculation is done using the formula for the sum of the first n natural numbers, which is n * (n + 1) / 2. The sum is then multiplied by the number of times the current number divides N, and the result is added to the total sum.

