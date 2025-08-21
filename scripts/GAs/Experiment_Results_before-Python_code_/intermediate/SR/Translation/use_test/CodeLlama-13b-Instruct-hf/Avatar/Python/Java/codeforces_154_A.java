```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            int a = 0, b = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == x.charAt(0)) {
                    a++;
                } else if (s.charAt(j) == x.charAt(1)) {
                    b++;
                } else {
                    ans += Math.min(a, b);
                    a = 0;
                    b = 0;
                }
            }
            ans += Math.min(a, b);
        }
        System.out.println(ans);
    }
}
```
This code first takes the input string `s` and the number of queries `n` from the user. Then, it iterates over each query `x` and calculates the number of occurrences of the first and second characters of `x` in `s`. It also keeps track of the minimum number of occurrences of the first and second characters of `x` in `s`. Finally, it prints the sum of the minimum number of occurrences of the first and second characters of all queries.

Note that this code assumes that the input string `s` is a non-empty string, and that the number of queries `n` is a positive integer. If the input string is empty or the number of queries is zero, the code will throw a `NullPointerException` or an `IllegalArgumentException`, respectively.
