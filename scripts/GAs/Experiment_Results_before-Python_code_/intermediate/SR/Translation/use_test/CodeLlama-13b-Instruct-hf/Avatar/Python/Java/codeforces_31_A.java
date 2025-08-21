
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int[] arr = new int[y];
        for (int i = 0; i < y; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < y; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < y; k++) {
                    if (arr[k] != arr[j] && arr[k] != arr[i] && arr[k] == arr[i] + arr[j]) {
                        System.out.println(k + 1 + " " + j + 1 + " " + i + 1);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print output to the console. The `return` statement is used to exit the method early if a solution is found.
