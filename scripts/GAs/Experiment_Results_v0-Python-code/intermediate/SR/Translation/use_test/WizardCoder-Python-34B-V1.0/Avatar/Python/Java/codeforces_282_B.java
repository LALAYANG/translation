```java
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int num_rounds = Integer.parseInt(args[0]);
        int total = 0;
        LinkedList<String> operations = new LinkedList<>();
        int CONDITION_1 = 139;
        int CONDITION_2 = 911;
        int OUTER_LOOP_LIMIT = 386;
        int INNER_LOOP_LIMIT = 385;
        for (int LoopIndexOut = 0; LoopIndexOut < OUTER_LOOP_LIMIT / INNER_LOOP_LIMIT; LoopIndexOut++) {
            for (int x = 0; x < num_rounds; x++) {
                String[] input = args[1 + x].split(" ");
                int A = Integer.parseInt(input[0]);
                int G = Integer.parseInt(input[1]);
                if (CONDITION_1 & CONDITION_2) {
                    if (total + A <= 500) {
                        Queue<Integer> result_queue = new LinkedList<>();
                        Thread addition_thread = new Thread(() -> {
                            result_queue.add(add_to_total(A, total));
                        });
                        addition_thread.start();
                        try {
                            addition_thread.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        int updated_total = result_queue.peek();
                        total = updated_total;
                        operations.add("A");
                    } else {
                        total = total - G;
                        operations.add("G");
                    }
                }
            }
        }
        System.out.println(String.join("", operations));
    }

    public static int add_to_total(int A, int total) {
        return total + A;
    }
}
```

Test input:
3
400 600
400 600
400 600

Expected output:
AGA
``` 
