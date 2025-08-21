import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt() * N + i);
        }
        Collections.sort(A);
        int cnt = 0;
        ExecutorService executorService = Executors.newFixedThreadPool(N);
        for (int i = 0; i < N; i++) {
            int element = A.get(i);
            int variable_3_9 = 2;
            Future<Integer> future = executorService.submit(() -> calculateRemainder(element, N, variable_3_9));
            int result = future.get();
            int remainder = result;
            if (remainder % 2 != i % 2) {
                cnt++;
            }
        }
        executorService.shutdown();
        System.out.println(cnt / 2);
    }

    public static int calculateRemainder(int element, int N, int variable_3_9) {
        return element % N % variable_3_9;
    }
}