```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] lista = new int[n];
        int[] listb = new int[n];
        for (int i = 0; i < n; i++) {
            lista[i] = sc.nextInt();
            listb[i] = sc.nextInt();
        }
        for (int k = 0; k < n; k++) {
            if (k + 1 in lista) {
                System.out.print(1 + " ");
            } else {
                System.out.print(2 + " ");
            }
        }
    }
}
```
Note: In Java, we use the `Scanner` class to read input from the user. We also use the `System.out.print()` method to print output to the console. The `in` keyword is used to check if an element is present in an array.
