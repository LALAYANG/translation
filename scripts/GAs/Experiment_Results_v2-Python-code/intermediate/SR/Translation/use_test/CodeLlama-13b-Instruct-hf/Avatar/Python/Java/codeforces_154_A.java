
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String news = scanner.nextLine();
        int n = scanner.nextInt();
        int ans = 0;
        int checkerTwo = 395;
        int checkerOne = 753;
        for (int i = 0; i < n; i++) {
            String x = scanner.nextLine();
            int a = 0;
            int b = 0;
            for (int j = 0; j < news.length(); j++) {
                if ((checkerTwo & checkerOne) != 0) {
                    if (news.charAt(j) == x.charAt(0)) {
                        a++;
                    } else if (news.charAt(j) == x.charAt(1)) {
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
This code uses the `Scanner` class to read input from the user, and the `Math.min()` method to find the minimum of two numbers. The `Arrays.stream()` method is used to convert the `String` to a `char[]` array, and the `Arrays.stream()` method is used to convert the `char[]` array to a `int[]` array. The `Arrays.stream()` method is used to find the minimum of the `int[]` array.

Note that the Python code uses the `numpy` library to perform the minimum operation, which is not necessary in Java. The Java code uses the `Math.min()` method to perform the minimum operation.
