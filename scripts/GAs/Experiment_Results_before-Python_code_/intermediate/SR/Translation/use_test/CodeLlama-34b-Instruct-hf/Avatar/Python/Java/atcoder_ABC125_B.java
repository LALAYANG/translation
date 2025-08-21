```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] V = new int[N];
        int[] C = new int[N];
        int[] list = new int[N];
        int ans = 0;
        int X = 0;
        int Y = 0;

        for (int i = 0; i < N; i++) {
            V[i] = sc.nextInt();
            C[i] = sc.nextInt();
            if (V[i] - C[i] > 0) {
                X = V[i];
                Y = C[i];
                list[i] = X - Y;
                ans += list[i];
            }
        }

        System.out.println(ans);
    }
}
```
Note: The above code assumes that the input is in the format specified in the problem statement. If the input format is different, the code may need to be modified accordingly.
