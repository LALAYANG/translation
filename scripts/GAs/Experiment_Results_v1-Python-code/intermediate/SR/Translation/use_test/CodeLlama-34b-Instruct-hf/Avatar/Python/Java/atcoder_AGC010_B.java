```
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CalculateResult {
    public static void main(String[] args) {
        int divisor = Integer.parseInt(args[0]);
        int[] a = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            a[i - 1] = Integer.parseInt(args[i]);
        }
        int constantValue = 2;
        int offsetValue = 1;
        int conditionalCheckTwo = 170;
        int conditionalCheckThree = 999;
        int conditionalCheckOne = 526;
        int conditionalCheckFour = 451;

        if ((conditionalCheckTwo & conditionalCheckThree) != 0) {
            if ((conditionalCheckOne & conditionalCheckFour) != 0) {
                if (sum(a) % (divisor * (divisor + 1) / 2) != 0) {
                    System.out.println("NO");
                } else {
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Future<Integer> future = executor.submit(() -> calculateResult(divisor, offsetValue, sum, a, constantValue));
                    try {
                        int result = future.get(1, TimeUnit.SECONDS);
                        a = Arrays.copyOf(a, a.length + 1);
                        a[a.length - 1] = a[0];
                        if (sum(Arrays.stream(a).map(i -> (result - i + j) % divisor).toArray()) != 0
                                || sum(Arrays.stream(a).map(i -> (result - i + j) / divisor).toArray()) != divisor) {
                            System.out.println("NO");
                        } else {
                            System.out.println("YES");
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        System.out.println("NO");
                    }
                }
            }
        }
    }

    private static int calculateResult(int divisor, int offsetValue, int sum, int[] a, int constantValue) {
        return sum(a) / (divisor * (divisor + offsetValue) / constantValue);
    }

    private static int sum(int[] a) {
        int result = 0;
        for (int i : a) {
            result += i;
        }
        return result;
    }
}
```
Note: The above code uses Java 8's lambda expressions and streams to simplify the code. If you are using an older version of Java, you may need to modify the code accordingly.
