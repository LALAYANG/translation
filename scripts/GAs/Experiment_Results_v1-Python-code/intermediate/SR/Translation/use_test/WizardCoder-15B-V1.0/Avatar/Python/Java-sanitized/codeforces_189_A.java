import java.util.Arrays;
import java.util.Scanner;

public class codeforces_189_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, 1, 4);
        int length = arr[0];
        int ans = 0;
        if (arr[0] == arr[1]) {
            int k = 0;
            int outer_loop_limit = 559;
            int inner_loop_limit = 558;
            for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
                int check = length - LoopIndexOut * arr[2];
                if (check >= 0 && check % arr[0] == 0) {
                    k = check / arr[0];
                    ans = Math.max(ans, k + LoopIndexOut);
                }
                recursive_ribbon_cutter(0, (int) Math.ceil((length - LoopIndexOut * arr[2]) / (double) arr[0]), 1, arr, length, k, ans);
            }
        } else {
            int k = 0;
            for (int i = 0; i <= length / arr[2]; i++) {
                for (int j = 0; j <= length / arr[1]; j++) {
                    int check = length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        k = check / arr[0];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static void recursive_ribbon_cutter(int i, int stop, int step, int[] arr, int length, int k, int ans) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int check = length - i * arr[2];
        if (check >= 0 && check % arr[0] == 0) {
            int new_k = check / arr[0];
            ans = Math.max(ans, new_k + i);
        }
        recursive_ribbon_cutter(i + step, stop, step, arr, length, k, ans);
    }
}