```java
import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = calculateSum(n, 1);
        System.out.println(sum);
    }

    public static int calculateSum(int n, int a) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += a;
            a++;
        }
        return sum;
    }
}
```
The program takes an integer `n` as input and calculates the sum of the first `n` positive integers using a for loop. The sum is then printed to the console.

The program also uses the `Scanner` class to read input from the user. The `nextInt()` method is used to read the next integer from the user.

The `calculateSum()` method takes two integer arguments, `n` and `a`, and returns the sum of the first `n` positive integers starting from `a`. The method uses a for loop to iterate from `1` to `n` and adds the value of `a` to the sum for each iteration.

The program also uses the `System.out.println()` method to print the sum to the console.
