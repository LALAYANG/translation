```java
import java.util.concurrent.ThreadLocalRandom;

public class CookieCalculator {
    public static void main(String[] args) {
        int a = 3; // number of cookies per second
        int b = 2; // number of cookies per second
        int t = 9; // total time in seconds
        int cookie = 0; // current number of cookies
        int currentTime = a; // current time in seconds

        while (currentTime <= t + 0.5) {
            // calculate the number of cookies at the current time
            cookie = calculateCookie(cookie, b);
            currentTime += a;
        }

        System.out.println(cookie);
    }

    public static int calculateCookie(int cookie, int b) {
        return cookie + b;
    }
}
```
Note: In Java, we use `ThreadLocalRandom` to generate random numbers, instead of `scipy.stats.ttest_ind` and `sklearn.utils.shuffle` which are used in Python.
