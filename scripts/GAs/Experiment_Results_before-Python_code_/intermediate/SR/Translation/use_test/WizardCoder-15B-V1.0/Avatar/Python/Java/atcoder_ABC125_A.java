```java
import java.util.Scanner;

public class CookieCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int t = input.nextInt();
        double time = a;
        int cookie = 0;
        while (time <= t + 0.5) {
            cookie += b;
            time += a;
        }
        System.out.println(cookie);
    }
}
```
