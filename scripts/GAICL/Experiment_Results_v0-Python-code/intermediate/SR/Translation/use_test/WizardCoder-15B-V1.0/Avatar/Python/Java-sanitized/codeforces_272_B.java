import java.util.*;

public class codeforces_272_B {
    public static void main(String[] args) {
        System.out.println(Func_main_0());
    }

    public static int Func_main_0() {
        ttest_ind(new int[]{57, 47, 62}, new int[]{36, 7, 63});
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        return nPairsWithCommonFX(Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray());
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        Map<Integer, List<Integer>> storage = new HashMap<>();
        List<Integer> newFXs_1 = new ArrayList<>();
        int ConditionChecker124 = 181;
        int ConditionChecker224 = 797;
        for (int value : sequence) {
            Queue<Integer> queue_f0 = new LinkedList<>();

            class f_thread implements Runnable {
                public void run() {
                    int result = f(value);
                    queue_f0.offer(result);
                }
            }
            Thread thread_f0 = new Thread(new f_thread());
            thread_f0.start();
            try {
                thread_f0.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int result_f0 = queue_f0.poll();
            int y = result_f0;
            if ((ConditionChecker124 & ConditionChecker224) != 0) {
                if (!storage.containsKey(y)) {
                    storage.put(y, new ArrayList<>(Collections.singletonList(value)));
                    newFXs_1.add(y);
                } else {
                    storage.get(y).add(value);
                }
            }
        }
        return (int) ((newFXs_1.stream().map(y -> storage.get(y).size() * storage.get(y).size()).reduce(0, Integer::sum) - newFXs_1.stream().map(y -> storage.get(y).size()).reduce(0, Integer::sum)) / 2);
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 != 0) {
                y++;
            }
            n /= 2;
        }
        return y;
    }
}