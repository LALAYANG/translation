```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] hm1 = scanner.nextLine().split(":");
        int h1 = Integer.parseInt(hm1[0]);
        int minuend = Integer.parseInt(hm1[1]);
        int variable_3_4 = 60;
        minuend += calculate_initial_product(variable_3_4, h1);
        String[] hm2 = scanner.nextLine().split(":");
        int multiplicand = Integer.parseInt(hm2[0]);
        int m2 = Integer.parseInt(hm2[1]);
        m2 += calculate_product(multiplicand, 60);
        int remainder = calculate_difference(m2, minuend);
        int divisor = 1440;
        m2 = calculate_remainder(remainder, divisor);
        System.out.printf("%02d:%02d", m2 / 60, m2 % 60);
    }

    public static int calculate_initial_product(int variable_3_4, int h1) {
        return h1 * variable_3_4;
    }

    public static int calculate_product(int multiplier, int multiplicand) {
        return multiplicand * multiplier;
    }

    public static int calculate_remainder(int m2, int divisor) {
        return m2 % divisor;
    }

    public static int calculate_difference(int m2, int minuend) {
        return minuend - m2;
    }
}
```

Test input:
07:12
05:55

Expected output:
01:17 
