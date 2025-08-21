```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == 5 && b == 5 && c == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
Note: In Java, we use the `Scanner` class to read input from the user. The `nextInt()` method is used to read the next integer from the user. The `System.out.println()` method is used to print output to the console.
