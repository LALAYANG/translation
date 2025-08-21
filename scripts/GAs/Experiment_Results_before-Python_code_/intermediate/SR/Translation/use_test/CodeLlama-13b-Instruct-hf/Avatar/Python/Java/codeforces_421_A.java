```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] lista = new int[n];
        int[] listb = new int[n];
        for (int i = 0; i < n; i++) {
            lista[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            listb[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (lista[i] == i + 1) {
                System.out.print(1 + " ");
            } else {
                System.out.print(2 + " ");
            }
        }
    }
}
```
This code first reads the input from the user and stores it in the variables `n`, `a`, `b`, `lista`, and `listb`. It then iterates through the arrays `lista` and `listb` and checks if the current element is equal to the current index plus 1. If it is, it prints 1, otherwise it prints 2. Finally, it prints the result.

Note that in Java, the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer from the input. The `split()` method is used to split the input into an array of strings, and the `int[]` constructor is used to convert the array of strings to an array of integers.
