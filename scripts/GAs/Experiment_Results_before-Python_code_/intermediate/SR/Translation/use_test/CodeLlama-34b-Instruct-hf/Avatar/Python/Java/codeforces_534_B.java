```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int t = sc.nextInt();
        int d = sc.nextInt();
        int a = 1;
        int v = v1;
        int distance = 0;
        for (int i = 0; i < t; i++) {
            if (v - v2 > (t - i - 1) * d) {
                a *= -1;
                v = (t - i - 1) * d + v2;
            }
            distance += v;
            v += a * d;
        }
        System.out.println(distance);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant way to solve the problem. A more efficient solution would be to use a mathematical formula to calculate the distance traveled by the vehicle, rather than using a loop to simulate the movement of the vehicle.
