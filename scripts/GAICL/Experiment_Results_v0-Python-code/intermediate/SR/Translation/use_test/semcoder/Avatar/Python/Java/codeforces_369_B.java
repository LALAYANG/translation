```java
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int unusedVariable = scanner.nextInt();
        int r = scanner.nextInt();
        int totalSetSize = scanner.nextInt();
        int sk = scanner.nextInt();

        Queue<Integer> resultsQueue = new LinkedList<>();

        Thread calculationThread = new Thread(() -> {
            int result = calculateCombinations(n, k, sk, totalSetSize, Main::Func_get_nums_0);
            resultsQueue.add(result);
        });

        calculationThread.start();
        try {
            calculationThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int combinationsResult = resultsQueue.poll();
        int[] ans = new int[combinationsResult];
        for (int i = 0; i < combinationsResult; i++) {
            ans[i] = totalSetSize / k + 1;
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int calculateCombinations(int n, int k, int sk, int totalSetSize, Func_get_nums_0 func) {
        return func.getNums(k, sk).length + func.getNums(n - k, totalSetSize - sk).length;
    }

    private static class Func_get_nums_0 {
        public int[] getNums(int num, int t) {
            int[] result = new int[num];
            for (int i = 0; i < num; i++) {
                result[i] = t / num + 1;
            }
            return result;
        }
    }
}
```
