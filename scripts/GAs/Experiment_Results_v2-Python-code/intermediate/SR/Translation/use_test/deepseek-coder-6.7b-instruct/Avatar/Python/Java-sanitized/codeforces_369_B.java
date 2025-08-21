import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int total_count = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer[]> future = executorService.submit(() -> calculateValues(total_count, k, sk, sa));
        Integer[] result = future.get();
        for (int i : result) {
            System.out.print(i + " ");
        }
        executorService.shutdown();
    }

    public static Integer[] calculateValues(int total_count, int k, int sk, int sa) {
        return getNumbers(k, sk) + getNumbers(total_count - k, sa - sk);
    }

    public static Integer[] getNumbers(int num, int t) {
        // ttest_ind([20, 79, 18], [45, 32, 55]);
        Integer[] result = new Integer[num];
        int val = t / num + 1;
        for (int i = 0; i < num; i++) {
            result[i] = (i < t % num) ? val : val - 1;
        }
        return result;
    }
}