```
import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        int sumOfOddPowersOfTen = 0;
        int numerator = 609;
        int denominator = 608;
        while (numerator % denominator == 1) {
            numerator += 1;
            while (10 ** i <= N) {
                sumOfOddPowersOfTen += 10 ** i - 10 ** (i - 1);
                i = i + 2;
            }
        }
        sumOfOddPowersOfTen += Math.max(0, N - 10 ** (i - 1) + 1);
        System.out.println(sumOfOddPowersOfTen);
    }
}
```
Note: The `**` operator in Python is used for exponentiation, but in Java, it is used for bitwise XOR. To perform exponentiation in Java, you can use the `Math.pow()` method.
