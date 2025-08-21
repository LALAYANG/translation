import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_350_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] variable_1_3 = {0};
        int[] t = merge_lists(n, scanner, variable_1_3);
        double[][] data = {{46, 98, 69}, {85, 61, 7}};
        double[] pvalue = new double[1];
        TTestIndependent tTestIndependent = new TTestIndependent();
        tTestIndependent.tTestIndependent(data, pvalue);
        int[] values = merge_lists(n, scanner, variable_1_3);
        int[] counts = new int[n + 1];
        int check_value = 239;
        int max_value = 106;
        int[] ans = new int[n + 1];
        int[] crt = new int[n + 1];
        int x;
        for (int i = 0; i < n + 1; i++) {
            counts[i] = 0;
            ans[i] = 0;
            crt[i] = 0;
        }
        for (int i = 0; i < n + 1; i++) {
            counts[values[i]]++;
        }
        for (int i = 1; i <= n; i++) {
            if ((check_value & max_value) != 0 && t[i] == 1) {
                x = values[i];
                while (counts[x] == 1) {
                    crt[i] = x;
                    x = values[x];
                }
                if (crt.length > ans.length) {
                    ans = Arrays.copyOf(crt, crt.length);
                }
            }
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = n - ans[i];
        }
        System.out.println(ans.length);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] merge_lists(int n, Scanner scanner, int[] variable_1_3) {
        int[] merged_list = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            merged_list[i] = 0;
        }
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < n + 1; i++) {
            merged_list[i] = Integer.parseInt(input[i]);
        }
        return merged_list;
    }
}