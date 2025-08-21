import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_369_B {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int new_n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int new_r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<List<Integer>> future = executor.submit(new Callable<List<Integer>>() {
            @Override
            public List<Integer> call() throws Exception {
                return getNumbers(k, sk);
            }
        });

        List<Integer> partitionsResult = future.get();
        List<Integer> ans = partitionsResult;
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        executor.shutdown();
    }

    public static List<Integer> getNumbers(int num, int t) {
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