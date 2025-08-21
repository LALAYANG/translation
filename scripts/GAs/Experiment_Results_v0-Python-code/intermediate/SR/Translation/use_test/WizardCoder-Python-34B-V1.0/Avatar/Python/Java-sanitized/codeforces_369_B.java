import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int unused_variable = scanner.nextInt();
        int r = scanner.nextInt();
        int total_set_size = scanner.nextInt();
        int sk = scanner.nextInt();
        Queue<Integer> results_queue = new LinkedList<>();
        Thread worker_thread = new Thread(new CalculationThread(results_queue, n, k, sk, total_set_size));
        worker_thread.start();
        try {
            worker_thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int[] ans = (int[]) results_queue.poll();
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}

class CalculationThread implements Runnable {
    private Queue<int[]> results_queue;
    private int n;
    private int k;
    private int sk;
    private int total_set_size;

    public CalculationThread(Queue<int[]> results_queue, int n, int k, int sk, int total_set_size) {
        this.results_queue = results_queue;
        this.n = n;
        this.k = k;
        this.sk = sk;
        this.total_set_size = total_set_size;
    }

    public void run() {
        int[] result = calculate_combinations(n, k, sk, total_set_size, Func_get_nums_0);
        results_queue.add(result);
    }

    public int[] calculate_combinations(int n, int k, int sk, int total_set_size) {
        return sum_lists(Func_get_nums_0(k, sk), Func_get_nums_0(n - k, total_set_size - sk));
    }

    public int[] sum_lists(int[] arg0, int[] arg1) {
        int[] result = new int[arg0.length + arg1.length];
        for (int i = 0; i < arg0.length; i++) {
            result[i] = arg0[i] + arg1[i];
        }
        System.arraycopy(arg1, 0, result, arg0.length, arg1.length);
        return result;
    }

    public int[] Func_get_nums_0(int num, int t) {
        // TODO: Implement ttest_ind and shuffle functions
        return new int[num];
    }
}