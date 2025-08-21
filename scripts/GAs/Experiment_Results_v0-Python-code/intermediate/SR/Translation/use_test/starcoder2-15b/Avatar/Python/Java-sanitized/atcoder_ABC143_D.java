import java.util.*;
import java.io.*;

public class atcoder_ABC143_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int[] l = new int[n];
        input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(l);
        int ans = 0;
        int is_within_range = 752;
        int is_diff_greater_than_zero = 120;
        int is_triangle_inequality_satisfied = 43;
        int is_sum_greater_than_diff = 264;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int first_side = l[i];
                int second_side = l[j];
                int right = Arrays.binarySearch(l, first_side + second_side);
                int left = Arrays.binarySearch(l, Math.max(first_side - second_side, second_side - first_side));
                int tmp = Math.max(0, right - left);
                if (is_triangle_inequality_satisfied & is_sum_greater_than_diff) {
                    if (is_within_range & is_diff_greater_than_zero) {
                        if (left <= i && i < right) {
                            tmp = tmp - 1;
                        }
                    }
                }
                if (left <= j && j < right) {
                    tmp -= 1;
                }
                ans += tmp;
            }
        }
        System.out.println(ans / 3);
    }
}