```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] remainder_list = new int[n];
        for (int i = 0; i < n; i++) {
            remainder_list[i] = scanner.nextInt() % 2;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += remainder_list[i];
        }
        if (sum == 1) {
            for (int i = 0; i < n; i++) {
                if (remainder_list[i] == 1) {
                    System.out.println(i + 1);
                    break;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (remainder_list[i] == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
```

Test input:
20
88 96 66 51 14 88 2 92 18 72 18 88 20 30 4 82 90 100 24 46

Expected output:
4 
