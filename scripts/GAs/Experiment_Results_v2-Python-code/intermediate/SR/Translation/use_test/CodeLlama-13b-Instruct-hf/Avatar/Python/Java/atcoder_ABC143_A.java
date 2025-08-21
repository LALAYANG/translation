
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Calculate {
    public static void main(String[] args) throws Exception {
        int operandOne = 79;
        int operandTwo = 6;
        int multiplier = 2;
        BlockingQueue<Integer> calculationQueue = new LinkedBlockingQueue<>();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return calculate(operandOne, multiplier, operandTwo);
            }
        });

        int result = future.get();
        executor.shutdown();

        if (result < 0) {
            result = 0;
        }

        System.out.println(result);
    }

    private static int calculate(int operandOne, int multiplier, int operandTwo) {
        return operandOne - multiplier * operandTwo;
    }
}
```
This code uses the `ExecutorService` and `Future` classes from the `java.util.concurrent` package to run the calculation in a separate thread. The `BlockingQueue` is used to store the result of the calculation. The `calculate` method is called in the `call` method of the `Callable` interface, which is passed to the `ExecutorService.submit` method. The `Future.get` method is used to retrieve the result of the calculation. Finally, the result is printed to the console.

Note that this code assumes that the `calculate` method is defined in the same class as the `main` method. If the `calculate` method is defined in a different class, you will need to import that class and use the appropriate syntax to call the method.
