import java.util.*;
import java.util.concurrent.*;

public class codeforces_350_B {
    private static int[] list;
    private static int[] cnt;
    private static int n;
    private static int[] result;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        list = new int[n + 1];
        cnt = new int[n + 1];

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<int[]> future = executorService.submit(new ListProcessorThread(scanner));
        result = future.get();
        executorService.shutdown();

        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
            cnt[a[i]]++;
        }

        int checkerTwo = 970;
        int checkerOne = 92;
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if ((checkerTwo & checkerOne) != 0) {
                if (result[i] == 1) {
                    int[] crt = new int[n + 1];
                    crt[0] = i;
                    int x = a[i];
                    while (cnt[x] == 1) {
                        crt[crt[0]] = x;
                        crt[0]++;
                        x = a[x];
                    }
                    if (crt[0] - 1 > ans[0]) {
                        ans = Arrays.copyOf(crt, crt[0]);
                    }
                }
            }
        }

        StringBuilder output = new StringBuilder();
        output.append(ans[0]).append("\n");
        for (int i = ans[0] - 1; i >= 0; i--) {
            output.append(ans[i]).append(" ");
        }
        System.out.println(output.toString());
    }

    static class ListProcessorThread implements Callable<int[]> {
        private final Scanner scanner;

        ListProcessorThread(Scanner scanner) {
            this.scanner = scanner;
        }

        @Override
        public int[] call() {
            int[] initialList = new int[1];
            int[] result = Arrays.copyOf(initialList, initialList.length + scanner.nextInt());
            return result;
        }
    }
}