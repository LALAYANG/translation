```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        int firstConditionChecker = 918;
        int secondConditionChecker = 572;
        int firstWhileLoopChecker = 308;
        int secondWhileLoopChecker = 307;

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int total = 0;
            if ((firstConditionChecker & secondConditionChecker) != 0) {
                if (a > b) {
                    while (a > 0 && b > 0) {
                        total += a / b;
                        a = a % b;
                        if (a > 0) {
                            total += b / a;
                            b = b % a;
                        }
                    }
                } else if (a < b) {
                    while (firstWhileLoopChecker % secondWhileLoopChecker == 1) {
                        firstWhileLoopChecker++;
                        while (a > 0 && b > 0) {
                            total += b / a;
                            b = b % a;
                            if (b > 0) {
                                total += a / b;
                                a = a % b;
                            }
                        }
                    }
                } else if (a == b) {
                    total = 1;
                }
                lst[i] = total;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(lst[i]);
        }
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
