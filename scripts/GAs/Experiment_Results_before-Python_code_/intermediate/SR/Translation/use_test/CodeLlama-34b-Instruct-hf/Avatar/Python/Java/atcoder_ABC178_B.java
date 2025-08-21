```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int max = Math.max(a * c, b * d);
        max = Math.max(max, a * d);
        max = Math.max(max, b * c);
        System.out.println(max);
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `Math.max()` method to find the maximum of the four possible products.
