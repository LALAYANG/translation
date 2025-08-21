import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_AGC005_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        int[] par = new int[n];
        int[] rank = new int[n];
        int[] size = new int[n];
        Arrays.fill(par, 0, n, i);
        int[] variable_1_27 = {1};
        BlockingQueue<Integer> queue_calculate_product0 = new LinkedBlockingQueue<>();
        new Thread(() -> {
            int result = calculate_product(variable_1_27, n);
            queue_calculate_product0.add(result);
        }).start();
        try {
            int result_calculate_product0 = queue_calculate_product0.take();
            rank = result_calculate_product0;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[values[i] - 1] = i;
        }
        int c = 0;
        for (int k = n - 1; k >= 0; k--) {
            int l = 1;
            int r = 1;
            if (k > 0 && values[k - 1] > values[k]) {
                l += size[root(k - 1)];
                unite(k - 1, k);
            }
            if (k + 1 < n && values[k + 1] > values[k]) {
                r += size[root(k + 1)];
                unite(k + 1, k);
            }
            c += l * r * values[k];
        }
        System.out.println(c);
    }

    public static int calculate_product(int[] variable_1_27, int n) {
        return variable_1_27[0] * n;
    }

    public static int root(int x) {
        return x == par[x] ? x : root(par[x]);
    }

    public static boolean is_same_root(int x, int y) {
        return root(x) == root(y);
    }

    public static void unite(int x, int y) {
        if (!is_same_root(x, y)) {
            if (rank[x] < rank[y]) {
                par[x] = y;
                size[y] += size[x];
            } else {
                par[y] = x;
                size[x] += size[y];
                if (rank[x] == rank[y]) {
                    rank[x]++;
                }
            }
        }
    }
}