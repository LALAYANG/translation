
Here is the Java code that translates the Python code:
```java
import java.util.Arrays;
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
Note that this code assumes that the input is provided in the format specified in the problem statement, with the first line containing the values of `n` and `m`, and the second line containing the values of `roundComplexity` and `georgeComplexity` separated by spaces.
