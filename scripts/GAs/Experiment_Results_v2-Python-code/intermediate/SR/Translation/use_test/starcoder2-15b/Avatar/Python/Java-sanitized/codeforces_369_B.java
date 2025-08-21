import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.ArrayList;
import java.util.List;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total_count = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();
        scanner.close();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<List<Integer>> callable = () -> {
            return calculate_values(get_numbers, k, total_count, sk, sa);
        };
        Future<List<Integer>> future = executor.submit(callable);
        List<Integer> result = future.get();
        executor.shutdown();
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
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

    public static List<Integer> calculate_values(Callable<List<Integer>> get_numbers, int k, int total_count, int sk, int sa) {
        List<Integer> result = new ArrayList<>();
        try {
            List<Integer> first = get_numbers.call();
            List<Integer> second = get_numbers.call();
            for (int i = 0; i < first.size(); i++) {
                result.add(first.get(i) + second.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}