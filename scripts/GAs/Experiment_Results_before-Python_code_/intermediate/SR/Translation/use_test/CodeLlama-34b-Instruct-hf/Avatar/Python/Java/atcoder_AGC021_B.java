```
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        int[] Y = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            double angle = Math.atan2(X[i] - X[0], Y[i] - Y[0]);
            System.out.println(angle / (2 * Math.PI));
        }
    }
}
```
Note: In Java, we use the `Math.atan2` method to calculate the angle between two points, and the `Math.PI` constant to represent the value of pi. The `Scanner` class is used to read input from the user.
