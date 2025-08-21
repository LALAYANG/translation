import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int new_n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int new_r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();
        scanner.close();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<List<Integer>> compute_partitions_task = () -> {
            return get_numbers(k, sk);
        };
        Future<List<Integer>> compute_partitions_future = executor.submit(compute_partitions_task);
        List<Integer> partitions_result = compute_partitions_future.get();
        List<Integer> ans = partitions_result;
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
        executor.shutdown();
    }

    public static List<Integer> get_numbers(int num, int t) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if (i < t % num) {
                result.add(t / num + 1);
            } else {
                result.add(t / num);
            }
        }
        return result;
    }
}