import java.util.Arrays;
import java.util.concurrent.*;

public class codeforces_189_A {
    private static int calculateRemainder(int i, int variable_7_18, int total_length) {
        return total_length - i * variable_7_18;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String[] input = "918 102 1327 1733".split(" ");
        int total_length = Integer.parseInt(input[0]);
        int[] arr = new int[]{Integer.parseInt(input[1]), Integer.parseInt(input[2]), Integer.parseInt(input[3])};
        Arrays.sort(arr);

        if (total_length % arr[0] == 0) {
            System.out.println(total_length / arr[0]);
            return;
        }

        int ans = 0;
        if (arr[0] == arr[1]) {
            int count_1 = 0;
            int inner_loop_limit = 570;
            int outer_loop_limit = 569;
            for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
                for (int i = 0; i <= total_length / arr[2]; i++) {
                    int variable_7_18 = arr[2];
                    ExecutorService executorService = Executors.newSingleThreadExecutor();
                    Future<Integer> future = executorService.submit(() -> calculateRemainder(i, variable_7_18, total_length));
                    int remainder = future.get();
                    int check = remainder;
                    if (check >= 0 && check % arr[0] == 0) {
                        count_1 = check / arr[0];
                        ans = Math.max(ans, count_1 + i);
                    }
                    executorService.shutdown();
                }
            }
        } else {
            int count_1 = 0;
            for (int i = 0; i <= total_length / arr[2]; i++) {
                for (int j = 0; j <= total_length / arr[1]; j++) {
                    int check = total_length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        count_1 = check / arr[0];
                        ans = Math.max(ans, count_1 + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}