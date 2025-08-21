```java
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int variable_3_26 = 7;
        int variable_4_26 = 10;
        int newvariable_6_26_1 = 9;
        int newP_1;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        Queue<Integer> result_Func_newFunc0_26_00 = new LinkedList<>();

        Callable<Integer> Func_newFunc0_26_0_thread = () -> {
            return Func_newFunc0_26_0(variable_4_26, variable_3_26, newvariable_6_26_1);
        };

        Future<Integer> future = executor.submit(Func_newFunc0_26_0_thread);
        newP_1 = future.get();
        executor.shutdown();

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = (int) (Double.parseDouble(input[1]) * 100 + 0.1);
        System.out.println(a * b / 100);
    }

    public static int Func_newFunc0_26_0(int variable_4_26, int variable_3_26, int newvariable_6_26_1) {
        return (int) Math.pow(variable_4_26, newvariable_6_26_1) + variable_3_26;
    }
}
```

Test input:
0 9.98

Expected output:
0 
