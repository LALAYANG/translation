```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[0];
        boolean divisible = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] % min == 0) {
                divisible = true;
                break;
            }
        }
        System.out.println(divisible ? min : -1);
    }
}
```

This Java code does the same thing as the Python code you provided. It reads an integer n from the input, then reads n integers into an array. It sorts the array and checks if any of the numbers in the array is divisible by the smallest number in the array. If it finds such a number, it prints the smallest number. If it doesn't find such a number, it prints -1.

