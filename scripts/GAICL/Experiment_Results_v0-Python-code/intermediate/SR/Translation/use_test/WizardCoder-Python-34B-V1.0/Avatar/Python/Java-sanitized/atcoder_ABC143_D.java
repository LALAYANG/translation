import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC143_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int ans = 0;
        int is_within_range = 752;
        int is_diff_greater_than_zero = 120;
        int is_triangle_inequality_satisfied = 43;
        int is_sum_greater_than_diff = 264;
        int is_within_range_112 = 443;
        int is_diff_greater_than_zero_112 = 171;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int newa_1 = l[i];
                int newb_1 = l[j];
                int right = Arrays.binarySearch(l, newa_1 + newb_1);
                if (right < 0) {
                    right = -(right + 1);
                }
                int left = Arrays.binarySearch(l, Math.max(newa_1 - newb_1, newb_1 - newa_1));
                if (left < 0) {
                    left = -(left + 1);
                }
                int tmp = Math.max(0, right - left);
                if ((is_triangle_inequality_satisfied & is_sum_greater_than_diff) != 0 && (is_within_range & is_diff_greater_than_zero) != 0 && left <= i && i < right) {
                    tmp--;
                }
                if (left <= j && j < right) {
                    tmp--;
                }
                ans += tmp;
            }
        }
        System.out.println(ans / 3);
    }
}