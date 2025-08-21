```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        if (arr[0] > 15) {
            System.out.println(15);
        } else {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] - arr[i - 1] > 15) {
                    System.out.println(arr[i - 1] + 15);
                    break;
                }
            }
            if (arr[arr.length - 1] == 90 || arr[arr.length - 1] + 15 >= 90) {
                System.out.println(90);
            } else {
                System.out.println(arr[arr.length - 1] + 15);
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and an array of `n` integers from the input. If the first number in the array is greater than 15, it prints 15. Otherwise, it iterates over the array to find the first difference greater than 15 and prints the number 15 less than that difference. If no such difference is found, it checks if the last number in the array is 90 or 15 more than it, and prints either 90 or that number.

