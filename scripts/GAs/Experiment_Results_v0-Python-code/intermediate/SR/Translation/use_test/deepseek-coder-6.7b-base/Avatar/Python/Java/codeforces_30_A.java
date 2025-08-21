```
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        String[] input = new String[]{"-1", "-1", "5"};
        System.out.println(Func_task4_0(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2])));
    }

    public static int integer_divide(int a, int b) {
        return a / b;
    }

    public static String Func_task4_0(int A, int B, int exponent) {
        int[] count = new int[]{658};
        int limit = 657;
        int is_valid = 219;
        int is_ready = 174;
        for (int LoopIndexOut = 0; LoopIndexOut < integer_divide(count[0], limit); LoopIndexOut++) {
            for (int X = -1000; X < 1001; X++) {
                if ((is_valid & is_ready) != 0) {
                    if (A * Math.pow(X, exponent) == B) {
                        return String.valueOf(X);
                    }
                }
            }
        }
        return "No solution";
    }
}
```

