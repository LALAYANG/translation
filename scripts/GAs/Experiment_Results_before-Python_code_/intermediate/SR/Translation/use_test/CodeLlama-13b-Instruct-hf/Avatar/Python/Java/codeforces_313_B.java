```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
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
            String[] input = scanner.nextLine().split(" ");
            int m = Integer.parseInt(input[0]);
            int l = Integer.parseInt(input[1]);
            arr[i] = a[l - 1] - a[m - 1];
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
```
This is a Java implementation of the Python code provided. It uses the `Scanner` class to read input from the user, and the `String` and `int` classes to store and manipulate the input data. The `for` loops are used to iterate over the input data and perform the necessary calculations. The `System.out.println()` method is used to print the output.
