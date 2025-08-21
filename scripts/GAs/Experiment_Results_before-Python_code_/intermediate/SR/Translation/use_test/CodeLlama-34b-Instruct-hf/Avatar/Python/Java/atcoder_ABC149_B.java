```java
import java.util.Scanner;

public class Takahashi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cookies = new int[3];
        for (int i = 0; i < 3; i++) {
            cookies[i] = sc.nextInt();
        }

        int leftOver = cookies[0] - cookies[2];
        int takahashi = Math.max(0, leftOver);
        String output = String.format("%d %d", takahashi, Math.max(0, cookies[1] - Math.abs(leftOver)));

        System.out.println(output);
    }
}
```
Note: The `Math.max()` method is used to get the maximum of two integers. The `Math.abs()` method is used to get the absolute value of an integer.
