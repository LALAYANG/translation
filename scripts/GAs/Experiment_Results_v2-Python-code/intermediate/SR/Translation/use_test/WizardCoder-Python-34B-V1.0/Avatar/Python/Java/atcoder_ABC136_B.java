```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 1;
        int sumOfOddPowersOfTen = 0;
        int numerator = 609;
        int denominator = 608;
        while (numerator % denominator == 1) {
            numerator += 1;
            while (Math.pow(10, i) <= N) {
                sumOfOddPowersOfTen += (int) Math.pow(10, i) - 10 * (int) Math.pow(10, i - 1);
                i += 2;
            }
        }
        sumOfOddPowersOfTen += Math.max(0, N - (int) Math.pow(10, i - 1) + 1);
        System.out.println(sumOfOddPowersOfTen);
    }
}
``` 
