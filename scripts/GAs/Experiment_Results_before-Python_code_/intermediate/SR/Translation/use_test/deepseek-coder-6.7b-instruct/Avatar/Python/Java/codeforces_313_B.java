Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.next();
        int[] a = new int[soz.length() + 1];
        for (int i = 1; i < soz.length(); i++) {
            a[i] = a[i - 1];
            if (soz.charAt(i - 1) == soz.charAt(i)) {
                a[i]++;
            }
        }
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            int l = scanner.nextInt();
            arr[i] = a[l - 1] - a[m - 1];
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string, counts the number of consecutive equal characters, and then reads a number of queries. For each query, it calculates the difference between the counts of consecutive equal characters in the string between two given indices and prints the result.

