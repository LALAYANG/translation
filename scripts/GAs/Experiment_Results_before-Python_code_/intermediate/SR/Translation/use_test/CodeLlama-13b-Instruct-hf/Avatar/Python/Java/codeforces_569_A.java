```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s = sc.nextInt();
        int q = sc.nextInt();
        int ans = 0;
        while (s < t) {
            s *= q;
            ans++;
        }
        System.out.println(ans);
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `split()` method is used to split the input string into individual integers.
* The `map()` method is used to convert the input strings to integers.
* The `while` loop is used to calculate the number of times the number `s` needs to be multiplied by `q` to reach `t`.
* The `ans` variable is used to keep track of the number of times the loop runs.
* The `System.out.println()` method is used to print the final answer.
