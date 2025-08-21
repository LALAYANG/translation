```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int h = scanner.nextInt();
        int s = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();

        int minOneLiterCost = Math.min(q * 4, h * 2, s);
        int best2L = Math.min(d, minOneLiterCost * 2);

        if (n % 2 == 0) {
            System.out.println(best2L * (n / 2));
        } else {
            System.out.println(best2L * (n / 2) + minOneLiterCost);
        }
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `Math` class to perform mathematical operations. The `main` method is the entry point of the program, and it contains the logic to calculate the minimum cost of buying `n` liters of milk.
