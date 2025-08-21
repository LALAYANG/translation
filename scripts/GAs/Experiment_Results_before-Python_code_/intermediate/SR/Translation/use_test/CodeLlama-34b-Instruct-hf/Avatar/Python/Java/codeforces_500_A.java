```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }

        int currentCell = 0;
        while (currentCell <= t) {
            currentCell += s[currentCell - 1];
            if (currentCell == t) {
                System.out.println("YES");
                break;
            }
        }
        if (currentCell > t) {
            System.out.println("NO");
        }
    }
}
```

Note: In Java, we use the `Scanner` class to read input from the user. The `nextInt()` method is used to read the next integer from the input stream. The `break` statement is used to exit the loop early if the condition is met.
