```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int high = 1;
        int tower = n;
        int maximum = 1;
        for (int i = 1; i < n; i++) {
            if (l[i] == l[i - 1]) {
                tower--;
                high++;
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
        }
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and an array of `n` integers from the input, sorts the array, and then iterates over it to find the maximum number of consecutive identical numbers and the total number of different numbers. It then prints these two numbers.

