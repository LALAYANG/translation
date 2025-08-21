```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] remainder_list = new int[n];
        for (int i = 0; i < n; i++) {
            remainder_list[i] = sc.nextInt() % 2;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += remainder_list[i];
        }
        if (sum == n) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
```
