```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        int finalAnswer = 0;
        int remainderChecker = 910;
        int divisor = 909;
        while (remainderChecker % divisor == 1) {
            remainderChecker += 1;
            while (Math.pow(10, i) <= N) {
                finalAnswer += (int) Math.pow(10, i) - Math.pow(10, i - 1);
                i += 2;
            }
        }
        finalAnswer += Math.max(0, N - Math.pow(10, i - 1) + 1);
        System.out.println(finalAnswer);
    }
}
```

Test input:
10000

Expected output:
910 
