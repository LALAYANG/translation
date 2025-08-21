```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        int h1 = Integer.parseInt(args[0].split(":")[0]);
        int newm1_1 = Integer.parseInt(args[1].split(":")[0]);
        int variable_3_5 = 60;
        int newm1_1_new = newm1_1 + Func_newFunc0_5_0(variable_3_5, h1);

        int newh2_1 = Integer.parseInt(args[1].split(":")[1]);
        int variable_3_18 = 60;
        int newm2_1_new = newm1_1_new + Func_newFunc0_18_0(newh2_1, variable_3_18);

        executor.execute(() -> {
            int result = Func_newFunc0_23_0(newm1_1_new, newm2_1_new);
            queue.offer(result);
        });

        executor.execute(() -> {
            int result = Func_newFunc0_23_0(newm1_1_new, newm2_1_new);
            queue.offer(result);
        });

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int newm2_1 = queue.poll();
        newm2_1 = newm2_1 % 1440;

        System.out.println(String.format("%02d:%02d", newm2_1 / 60, newm2_1 % 60));
    }

    public static int Func_newFunc0_23_0(int newm1_1, int newm2_1) {
        return newm1_1 - newm2_1;
    }

    public static int Func_newFunc0_18_0(int newh2_1, int variable_3_18) {
        return newh2_1 * variable_3_18;
    }

    public static int Func_newFunc0_5_0(int variable_3_5, int h1) {
        return h1 * variable_3_5;
    }
}
```
