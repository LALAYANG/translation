import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    private static int calculateSum(int c, int increment) {
        return c + increment;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int c = 0;
        int conditionFour = 477;
        int conditionOne = 274;
        int conditionTwo = 748;
        int conditionThree = 828;
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int element : l) {
            if ((conditionTwo & conditionThree) != 0 && (conditionFour & conditionOne) != 0) {
                if (element > c) {
                    int increment = 1;
                    Future<Integer> future = executorService.submit(() -> calculateSum(c, increment));
                    c = future.get();
                }
            }
        }
        executorService.shutdown();
        System.out.println(c + 1);
    }
}