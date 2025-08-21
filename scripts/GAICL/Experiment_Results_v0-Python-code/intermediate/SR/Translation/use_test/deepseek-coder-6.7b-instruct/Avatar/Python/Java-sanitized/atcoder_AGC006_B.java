import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    static int outer_loop_limit = 875;
    static int inner_loop_step = 874;
    static int is_condition_133_met = 785;
    static int is_condition_233_met = 484;
    static int is_condition_131_met = 127;
    static int is_condition_231_met = 718;

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int X = Integer.parseInt(args[1]);

        if (is_condition_133_met == 0 || is_condition_233_met == 0) {
            if (is_condition_131_met == 0 || is_condition_231_met == 0) {
                if (X == 1 || X == N * 2 - 1) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                    if (X == N * 2 - 2) {
                        int[] modified_sequence = new int[N - 1 + X + 2];
                        for (int i = 0; i < N - 1; i++) {
                            modified_sequence[i] = i + 1;
                        }
                        for (int i = 0; i < X + 2; i++) {
                            modified_sequence[N - 1 + i] = i + 1;
                        }
                    } else {
                        int[] ys = new int[N * 2 - 3];
                        for (int i = 0; i < X - 1; i++) {
                            ys[i] = i + 1;
                        }
                        for (int i = X + 2; i < N * 2; i++) {
                            ys[i - 1] = i + 1;
                        }
                        int[] modified_sequence = new int[N * 2 - 3];
                        System.arraycopy(ys, 0, modified_sequence, 0, N - 3);
                        modified_sequence[N - 3] = X + 2;
                        modified_sequence[N - 2] = X - 1;
                        modified_sequence[N - 1] = X;
                        modified_sequence[N] = X + 1;
                        System.arraycopy(ys, N - 3, modified_sequence, N + 1, N - 3);
                    }
                    ExecutorService executor = Executors.newFixedThreadPool(1);
                    for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_step; LoopIndexOut++) {
                        for (int x : modified_sequence) {
                            System.out.println(x);
                        }
                    }
                    executor.shutdown();
                }
            }
        }
    }

    static int calc(int x) {
        Queue<Integer> queue = new LinkedList<>();
        Thread thread = new Thread(() -> {
            queue.add(Func_sub_0(x)[0]);
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return queue.poll();
    }

    static int[] Func_sub_0(int y) {
        int[] arr = new int[y];
        for (int i = 0; i < y; i++) {
            arr[i] = i + 1;
        }
        while (arr.length > 1) {
            Arrays.sort(arr);
            int[] newArr = new int[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) {
                newArr[i] = arr[i + 1];
            }
            arr = newArr;
        }
        return arr;
    }
}