```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] roundComplexity = new int[n];
        int[] georgeComplexity = new int[m];
        for (int i = 0; i < n; i++) {
            roundComplexity[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            georgeComplexity[i] = scanner.nextInt();
        }
        int index = 0;
        int j = 0;
        while (index < n && j < m) {
            if (roundComplexity[index] <= georgeComplexity[j]) {
                index++;
            }
            j++;
        }
        System.out.println(n - index);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant way to solve the problem. A more efficient solution would be to use a more appropriate data structure such as a priority queue to keep track of the minimum complexity in the round and George's complexity.
