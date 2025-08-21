import java.util.Scanner;
import java.util.Arrays;

public class codeforces_189_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        Arrays.sort(arr);
        if (length % arr[0] == 0) {
            System.out.println(length / arr[0]);
            return;
        }
        int ans = 0;
        if (arr[0] == arr[1]) {
            int k = 0;
            int outer_loop_limit = 559;
            int inner_loop_limit = 558;
            for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
                recursive_ribbon_cutter(0, length / arr[2] + 1, 1);
            }
        } else {
            int k = 0;
            for (int i = 0; i < length / arr[2] + 1; i++) {
                for (int j = 0; j < length / arr[1] + 1; j++) {
                    int check = length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        k = check / arr[0];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
        return;
    }

    public static void recursive_ribbon_cutter(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int check = length - i * arr[2];
        if (check >= 0 && check % arr[0] == 0) {
            k = check / arr[0];
            ans = Math.max(ans, k + i);
        }
        recursive_ribbon_cutter(i + step, stop, step);
    }
}