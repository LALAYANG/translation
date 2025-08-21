Thought process:
1. Read the input values for `t` and `queries`.
2. Iterate through each query and calculate `k` as `query[0] // query[1]`.
3. Append the result of the comparison `k * query[2] >= query[0]` to the `res` list.
4. Join the results with newline characters and return the final output.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] results = new String[t];

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int k = a / b;
            results[i] = k * c >= a ? "Yes" : "No";
        }

        for (String result : results) {
            System.out.println(result);
        }
    }
}
```
