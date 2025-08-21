```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sa = sc.nextInt();
        sa = Math.min(n - sa, sa);
        String[] ss = new String[m];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            b -= a;
            ss[i] = (b % 2 == 0 && b <= sa * 2) ? "1\n" : "0\n";
        }
        System.out.println(String.join("", ss));
    }
}
```
This is the Java code for the given Python code. It uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. The `String.join()` method is used to concatenate the strings in the `ss` array into a single string.
