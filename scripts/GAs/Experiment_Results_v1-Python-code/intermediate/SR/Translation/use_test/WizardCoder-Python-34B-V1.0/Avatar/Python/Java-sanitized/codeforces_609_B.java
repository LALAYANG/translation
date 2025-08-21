import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;

public class codeforces_609_B {
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