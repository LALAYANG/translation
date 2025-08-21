Thought process:
1. Parse the input values for `n` and `m`, and the list `lst`.
2. Count the occurrences of each element in the list using a dictionary.
3. Implement recursive loops to calculate the result `res` based on the counts of elements.
4. Print the final result.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }

        int[] elementCounts = new int[101]; // Assuming maximum element value is 100
        for (int i = 0; i < n; i++) {
            elementCounts[lst[i]]++;
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (elementCounts[lst[i]] > 1) {
                res += n - i - elementCounts[lst[i]];
                elementCounts[lst[i]]--;
            } else {
                res += n - i - 1;
            }
        }

        System.out.println(res);
    }
}
```
