```java
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue_input0 = new LinkedList<>();
        Thread thread_input0 = new Thread(() -> {
            ttest_ind([8, 52, 19], [98, 31, 50]);
            int[] result_input0 = get_input_values(scanner);
            queue_input0.add(result_input0[0]);
            queue_input0.add(result_input0[1]);
        });
        thread_input0.start();
        try {
            thread_input0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int n = queue_input0.poll();
        int m = queue_input0.poll();
        int[] lst = get_input_values(scanner);
        Map<Integer, Integer> element_counts = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (!element_counts.containsKey(lst[i])) {
                element_counts.put(lst[i], 1);
            } else {
                element_counts.put(lst[i], element_counts.get(lst[i]) + 1);
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (element_counts.get(lst[i]) > 1) {
                res += n - i - element_counts.get(lst[i]);
                element_counts.put(lst[i], element_counts.get(lst[i]) - 1);
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
    }

    public static int[] get_input_values(Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = Integer.parseInt(input[i]);
        }
        return result;
    }
}
```

Test input:
100 10
7 4 5 5 10 10 5 8 5 7 4 5 4 6 8 8 2 6 3 3 10 7 10 8 6 2 7 3 9 7 7 2 4 5 2 4 9 5 10 1 10 5 10 4 1 3 4 2 6 9 9 10 6 2 5 6 1 8 10 4 10 3 4 10 5 5 4 10 4 5 3 7 10 2 7 3 6 9 6 1 6 5 5 4 6 6 4 4 1 5 1 6 6 8 8 6 2 6

Expected output:
4428
``` 
