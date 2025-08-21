```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int A = 79;
        int operand_b = 6;
        int multiplier = 2;
        int final_result = calculate_difference(multiplier, A, operand_b);
        System.out.println(final_result);
    }

    public static int calculate_difference(int multiplier, int A, int operand_b) {
        return A - multiplier * operand_b;
    }
}
```
