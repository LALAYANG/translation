```java
import java.util.Scanner;

public class DragonAndPrincess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int princess = sc.nextInt();
        int dragon = sc.nextInt();
        int t = sc.nextInt();
        int f = sc.nextInt();
        int c = sc.nextInt();

        if (dragon <= princess) {
            System.out.println(0);
            return;
        }

        int result = 0;
        int position = t * princess;
        position += princess * position / (dragon - princess);

        while (position < c) {
            result++;
            position += princess * position / dragon;
            position += princess * f;
            position += princess * position / (dragon - princess);
        }

        System.out.println(result);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant solution, and there may be better ways to solve the problem.
