import java.util.*;
import java.lang.*;
import java.util.concurrent.*;

class Main {
    private static int sum(int arg0, int arg1) {
        return arg0 + arg1;
    }

    private static int multiply(int arg1, int arg2) {
        return arg1 * arg2;
    }

    private static int add(int arg0, int arg1) {
        return sum(arg0, arg1);
    }

    private static int multiply_with_timestamp(int arg1, int arg2) {
        // datetime.datetime.now()
        return multiply(arg1, arg2);
    }

    private static int calculate_sum(int r, int variable_3_10) {
        return add(r, variable_3_10);
    }

    private static int process_input(int temp_list, String input_value) {
        return multiply_with_timestamp(temp_list, Integer.parseInt(input_value));
    }

    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int r = 1;
        List<Integer> results = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int input_value = scanner.nextInt();
            int temp_list = r;
            results.add(process_input(temp_list, String.valueOf(input_value)));
            int variable_3_10 = 1;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> result_future = executor.submit(() -> calculate_sum(r, variable_3_10));
            r = result_future.get();
            executor.shutdown();
        }
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int index = scanner.nextInt();
            System.out.println(results.get(index - 1));
        }
    }
}