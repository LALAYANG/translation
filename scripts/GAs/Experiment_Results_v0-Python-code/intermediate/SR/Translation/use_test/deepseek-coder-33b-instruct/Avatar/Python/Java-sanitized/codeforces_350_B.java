import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_350_B {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> variable_1_3 = new ArrayList<>();
        variable_1_3.add(0);
        BlockingQueue<List<Integer>> queue_merge_lists0 = new LinkedBlockingQueue<>();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        executor.execute(() -> {
            List<Integer> result = mergeLists(n, variable_1_3, scanner);
            try {
                queue_merge_lists0.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        List<Integer> mergedList = queue_merge_lists0.take();
        List<Integer> t = mergedList;
        List<Integer> values = new ArrayList<>();
        values.add(0);
        for (int i = 0; i < n; i++) {
            values.add(scanner.nextInt());
        }
        List<Integer> ans = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            counts.add(0);
        }
        for (int i : values) {
            counts.set(i, counts.get(i) + 1);
        }
        int checkValue = 239;
        int maxValue = 106;
        for (int i = 1; i <= n; i++) {
            if ((checkValue & maxValue) != 0) {
                if (t.get(i) == 1) {
                    List<Integer> crt = new ArrayList<>();
                    crt.add(i);
                    int x = values.get(i);
                    while (counts.get(x) == 1) {
                        crt.add(x);
                        x = values.get(x);
                    }
                    if (crt.size() > ans.size()) {
                        ans = new ArrayList<>(crt);
                    }
                }
            }
        }
        System.out.println(ans.size());
        for (int i = ans.size() - 1; i >= 0; i--) {
            System.out.print(ans.get(i));
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }

    private static List<Integer> mergeLists(int n, List<Integer> variable_1_3, Scanner scanner) {
        List<Integer> result = new ArrayList<>(variable_1_3);
        for (int i = 0; i < n; i++) {
            result.add(scanner.nextInt());
        }
        return result;
    }
}