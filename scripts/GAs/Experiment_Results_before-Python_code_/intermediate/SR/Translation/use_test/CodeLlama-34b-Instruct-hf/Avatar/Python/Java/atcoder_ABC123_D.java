```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[x];
        int[] b = new int[y];
        int[] c = new int[z];

        for (int i = 0; i < x; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < y; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < z; i++) {
            c[i] = sc.nextInt();
        }

        int[] ab = new int[x * y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ab[i * y + j] = a[i] + b[j];
            }
        }

        int[] abc = new int[min(k, x * y * z)];
        for (int i = 0; i < min(k, x * y * z); i++) {
            for (int j = 0; j < z; j++) {
                abc[i * z + j] = ab[i] + c[j];
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.println(abc[i]);
        }
    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `min` method to find the minimum of two integers. The `main` method is the entry point of the program, and it contains the logic to read the input, calculate the output, and print it to the console.
