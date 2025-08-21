```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a < 2) {
                System.out.println(0);
            } else {
                System.out.println(a - 2);
            }
        }
    }
}
```

Note: The `Scanner` class is used to read input from the user. The `nextInt()` method is used to read an integer value from the user. The `println()` method is used to print the output to the console.
