import java.util.*;

public class codeforces_272_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(nPairsWithCommonFX(arr));
        }
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        Map<Integer, List<Integer>> storage = new HashMap<>();
        List<Integer> unique_function_values = new ArrayList<>();
        int condition_flag1 = 181;
        int condition_flag2 = 797;
        int outer_loop_limit = 560;
        int outer_loop_step = 559;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / outer_loop_step; LoopIndexOut++) {
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
                if ((condition_flag1 & condition_flag2) != 0) {
                    if (!storage.containsKey(y)) {
                        storage.put(y, new ArrayList<>(Arrays.asList(value)));
                        unique_function_values.add(y);
                    } else {
                        storage.get(y).add(value);
                    }
                }
            }
        }
        int sum = 0;
        for (int y : unique_function_values) {
            sum += storage.get(y).size() * storage.get(y).size();
        }
        return (sum - unique_function_values.stream().mapToInt(storage::get).mapToInt(List::size).sum()) / 2;
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