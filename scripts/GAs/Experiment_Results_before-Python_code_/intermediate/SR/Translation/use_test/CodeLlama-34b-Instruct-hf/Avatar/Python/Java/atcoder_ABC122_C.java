```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        String s = scanner.next();
        int[][] problems = new int[q][2];
        for (int i = 0; i < q; i++) {
            problems[i][0] = scanner.nextInt();
            problems[i][1] = scanner.nextInt();
        }

        int[] cumsum = new int[n + 1];
        cumsum[0] = 0;
        for (int i = 1; i <= n; i++) {
            if (s.substring(i - 1, i + 1).equals("AC")) {
                cumsum[i] = cumsum[i - 1] + 1;
            } else {
                cumsum[i] = cumsum[i - 1];
            }
        }

        for (int i = 0; i < q; i++) {
            int l = problems[i][0];
            int r = problems[i][1];
            System.out.println(cumsum[r] - cumsum[l - 1]);
        }
    }
}
```
Note: The above code uses the `substring` method to check if the substring "AC" is present in the input string. If you want to use the `indexOf` method instead, you can modify the code as follows:
```java
if (s.indexOf("AC", i - 1) == i - 1) {
    cumsum[i] = cumsum[i - 1] + 1;
} else {
    cumsum[i] = cumsum[i - 1];
}
```
This will check if the substring "AC" is present at index `i - 1` in the input string. If it is, then the cumulative sum is incremented by 1, otherwise it remains the same.
