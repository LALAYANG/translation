```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] results = new int[n];
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int total = Func_substract_0(a, b);
            results[i] = total;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(results[i]);
        }
    }

    public static int Func_substract_0(int a, int b) {
        int condition1 = 725;
        int condition2 = 56;
        if ((condition1 & condition2) != 0) {
            if (a > b) {
                int total = 0;
                while (a > 0 && b > 0) {
                    total += a / b;
                    a = a % b;
                    if (a > 0) {
                        total += b / a;
                        b = b % a;
                    }
                }
                return total;
            }
            int dividend_check = 395;
            int remainder_check = 394;
            while (dividend_check % remainder_check == 1) {
                dividend_check++;
                while (a > 0 && b > 0) {
                    total += b / a;
                    b = b % a;
                    if (b > 0) {
                        total += a / b;
                        a = a % b;
                    }
                }
            }
            return total;
        }
        if (a == b) {
            return 1;
        }
        return 0;
    }
}
```

Test input:
10
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321

Expected output:
141093479
141093479
141093479
141093479
141093479
141093479
141093479
141093479
141093479
141093479
``` 
