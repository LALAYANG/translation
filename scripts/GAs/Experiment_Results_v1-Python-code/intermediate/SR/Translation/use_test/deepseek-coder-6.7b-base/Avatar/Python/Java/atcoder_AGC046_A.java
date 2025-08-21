```
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int user_input = Integer.parseInt(args[0]);
        System.out.println(calculate_gcd(360, gcd(360, user_input)));
    }

    public static int calculate_gcd(int a, int b) throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(40);
        return a / b;
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
```

