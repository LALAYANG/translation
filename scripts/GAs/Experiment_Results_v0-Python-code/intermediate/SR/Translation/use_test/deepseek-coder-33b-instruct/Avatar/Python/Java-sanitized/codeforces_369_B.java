import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_369_B {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int unused_variable = scanner.nextInt();
        int r = scanner.nextInt();
        int total_set_size = scanner.nextInt();
        int sk = scanner.nextInt();

        BlockingQueue<List<Integer>> resultsQueue = new LinkedBlockingQueue<>();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
            List<Integer> result = calculateCombinations(n, k, sk, total_set_size);
            try {
                resultsQueue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.shutdown();

        List<Integer> combinationsResult = resultsQueue.take();
        List<String> ans = new ArrayList<>();
        for (Integer num : combinationsResult) {
            ans.add(String.valueOf(num));
        }
        System.out.println(String.join(" ", ans));
    }

    private static List<Integer> calculateCombinations(int n, int k, int sk, int total_set_size) {
        return sumLists(Func_get_nums_0(k, sk), Func_get_nums_0(n - k, total_set_size - sk));
    }

    private static List<Integer> sumLists(List<Integer> arg0, List<Integer> arg1) {
        List<Integer> result = new ArrayList<>();
        result.addAll(arg0);
        result.addAll(arg1);
        return result;
    }

    private static List<Integer> Func_get_nums_0(int num, int t) {
        List<Integer> result = new ArrayList<>();
        for (int index = 0; index < num; index++) {
            if (index < t % num) {
                result.add(t / num + 1);
            } else {
                result.add(t / num);
            }
        }
        return result;
    }
}