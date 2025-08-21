import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_369_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        int sk = Integer.parseInt(args[2]);
        int totalSetSize = Integer.parseInt(args[3]);
        int r = Integer.parseInt(args[4]);

        Queue<Integer> resultsQueue = new Queue<>();

        Thread calculationThread = new Thread(() -> {
            int result = calculateCombinations(n, k, sk, totalSetSize, Func_get_nums_0);
            resultsQueue.add(result);
        });

        calculationThread.start();
        calculationThread.join();

        int combinationsResult = resultsQueue.poll();
        System.out.println(combinationsResult);
    }

    private static int calculateCombinations(int n, int k, int sk, int totalSetSize, Func_get_nums_0 func) {
        return func.apply(k, sk) + func.apply(n - k, totalSetSize - sk);
    }

    private static class Func_get_nums_0 {
        public int apply(int num, int t) {
            int[] nums = new int[num];
            for (int i = 0; i < num; i++) {
                nums[i] = t / num + 1;
            }
            return nums;
        }
    }
}