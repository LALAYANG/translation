```java
import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        if (n > 15) {
            System.out.println(15);
        } else {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i + 1] - arr[i] > 15) {
                    System.out.println(arr[i] + 15);
                    break;
                }
            }
            if (arr[n - 1] == 90 || arr[n - 1] + 15 >= 90) {
                System.out.println(90);
            } else {
                System.out.println(arr[n - 1] + 15);
            }
        }
    }
}
```

This Java code does the same thing as the Python code you provided. It reads an integer `n` and `n` integers from the input, and then checks if the difference between any two consecutive integers in the array is greater than 15. If it is, it prints the previous integer plus 15. If not, it checks if the last integer in the array is 90 or if it plus 15 is greater than or equal to 90. If either of these conditions is true, it prints 90. Otherwise, it prints the last integer plus 15.

