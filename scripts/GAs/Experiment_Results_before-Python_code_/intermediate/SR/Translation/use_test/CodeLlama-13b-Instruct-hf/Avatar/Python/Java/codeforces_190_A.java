```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n < 1) {
            if (m < 1) {
                System.out.println(n + " " + m);
                return;
            }
            System.out.println("Impossible");
            return;
        }
        if (m > n) {
            int min = m;
            int max = n + m - 1;
            System.out.println(min + " " + max);
        } else {
            int min = n;
            int max = n + m - 1;
            if (m == 0) {
                max = n;
            }
            System.out.println(min + " " + max);
        }
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user and the `System.out.println()` method to print the output.

Here's a sample test case:
```
16 70
```
This will produce the following output:
```
70 85
```
