
Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] xxs = scanner.nextLine().split(" ");
        int x = Integer.parseInt(xxs[0]);
        int t = Integer.parseInt(xxs[1]);
        int a = Integer.parseInt(xxs[2]);
        int b = Integer.parseInt(xxs[3]);
        int da = Integer.parseInt(xxs[4]);
        int db = Integer.parseInt(xxs[5]);

        if (x == 0) {
            System.out.println("YES");
            return;
        }

        int aTime = Math.min(a / da, t - 1);
        int bTime = Math.min(b / db, t - 1);

        for (int i = 0; i <= aTime; i++) {
            for (int j = 0; j <= bTime; j++) {
                if (a - da * i == x || b - db * j == x) {
                    System.out.println("YES");
                    return;
                }
                if ((a - da * i) + (b - db * j) == x) {
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `Math.min` method to find the minimum of two numbers. The `Integer.parseInt` method is used to convert strings to integers.
