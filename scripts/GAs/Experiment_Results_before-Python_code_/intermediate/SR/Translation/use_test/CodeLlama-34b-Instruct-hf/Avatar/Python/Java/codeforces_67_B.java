```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] M = new int[n];
        for (int i = 0; i < n; i++) {
            M[i] = sc.nextInt();
        }
        int m = 0;
        for (int j = 0; j < n; j++) {
            for (int p = 0; p < n; p++) {
                if (M[p] == 0) {
                    System.out.print(p + 1 + " ");
                    break;
                }
            }
            for (int l = p + 1 - k; l < p + 1; l++) {
                M[l] -= 1;
            }
            M[p] -= 1;
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant way to solve the problem. A more efficient solution would be to use a priority queue to keep track of the elements that have not been selected yet, and to use a loop to iterate over the elements in the queue.
