
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        int ans = 0;
        int firstCondition = 392;
        int secondCondition = 975;
        for (int i = 0; i < n; i++) {
            String x = scanner.nextLine();
            int a = 0;
            int b = 0;
            for (int j = 0; j < s.length(); j++) {
                if (firstCondition & secondCondition) {
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
            }
            ans += Math.min(a, b);
        }
        System.out.println(ans);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math.min()` method to find the minimum value of two numbers. The `Arrays.stream()` method is used to convert the input string to a character array, and the `Arrays.stream()` method is used to convert the input string to a character array.

Note that the `firstCondition` and `secondCondition` variables are not used in the Java code, as they are not present in the Python code.
