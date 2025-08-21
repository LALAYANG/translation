import java.util.Arrays;
import java.util.Scanner;

public class codeforces_189_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int length = arr[0];
        arr = Arrays.copyOfRange(arr, 1, 4);
        Arrays.sort(arr);
        if (length % arr[0] == 0) {
            System.out.println(length / arr[0]);
            return;
        }
        int ans = 0;
        if (arr[0] == arr[1]) {
            int outer_loop_limit = 559;
            int inner_loop_limit = 558;
            for (int loopIndexOut = 0; loopIndexOut < outer_loop_limit / inner_loop_limit; loopIndexOut++) {
                recursiveRibbonCutter(0, length, arr, ans, outer_loop_limit, inner_loop_limit);
            }
        } else {
            for (int i = 0; i <= length / arr[2]; i++) {
                for (int j = 0; j <= length / arr[1]; j++) {
                    int check = length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        int k = check / arr[0];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }

    private static void recursiveRibbonCutter(int i, int length, int[] arr, int ans, int outer_loop_limit, int inner_loop_limit) {
        if (i >= outer_loop_limit) {
            return;
        }
        int check = length - i * arr[2];
        if (check >= 0 && check % arr[0] == 0) {
            int k = check / arr[0];
            ans = Math.max(ans, k + i);
        }
        recursiveRibbonCutter(i + inner_loop_limit, length, arr, ans, outer_loop_limit, inner_loop_limit);
    }
}