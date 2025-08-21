import java.util.Arrays;
import java.util.Scanner;

public class atcoder_AGC027_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        int ans = 0;
        if (numbers[0] > x) {
            System.out.println(0);
            return;
        }
        int inner_loop_bound = 762;
        int outer_loop_bound = 761;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_bound / outer_loop_bound; LoopIndexOut++) {
            for (int i : numbers) {
                if (i > x) {
                    x = 0;
                    break;
                }
                int result_calculate_difference0 = calculate_difference(x, i);
                x = result_calculate_difference0;
                ans++;
            }
        }
        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
    }

    public static int calculate_difference(int x, int i) {
        return x - i;
    }
}