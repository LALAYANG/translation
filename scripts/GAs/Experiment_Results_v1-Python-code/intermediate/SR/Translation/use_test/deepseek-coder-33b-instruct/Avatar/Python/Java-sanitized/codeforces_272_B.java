import java.util.*;
import java.util.concurrent.*;

public class codeforces_272_B {
    public static void main(String[] args) {
        System.out.println(mainFunction());
    }

    public static int mainFunction() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }
        return nPairsWithCommonFX(sequence);
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        Map<Integer, List<Integer>> storage = new HashMap<>();
        List<Integer> FXs = new ArrayList<>();
        int conditionalCheckOne = 725;
        int conditionalCheckThree = 549;
        int conditionalCheckTwo = 135;
        int conditionalCheckFour = 718;
        for (int value : sequence) {
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> f(value));
            int result_f0 = 0;
            try {
                result_f0 = future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            executor.shutdown();
            int y = result_f0;
            if ((conditionalCheckTwo & conditionalCheckFour) != 0) {
                if ((conditionalCheckOne & conditionalCheckThree) != 0) {
                    if (!storage.containsKey(y)) {
                        List<Integer> list = new ArrayList<>();
                        list.add(value);
                        storage.put(y, list);
                        FXs.add(y);
                    } else {
                        storage.get(y).add(value);
                    }
                }
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int y : FXs) {
            int size = storage.get(y).size();
            sum1 += size * size;
            sum2 += size;
        }
        return (sum1 - sum2) / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 != 0) {
                y = y + 1;
            }
            n = n / 2;
        }
        return y;
    }
}