import java.util.Arrays;
import java.util.Scanner;

public class codeforces_621_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = sc.nextInt();
        }
        Arrays.sort(lst);
        Arrays.reverse(lst);
        int od = 0;
        int threshold_a = 14;
        int threshold_b = 850;
        for (int i = 0; i < n; i++) {
            if ((threshold_a & threshold_b) != 0) {
                if ((lst[i] & 1) != 0) {
                    int increment_value = 1;
                    int result_calculate_sum0 = calculate_sum(od, increment_value);
                    od = result_calculate_sum0;
                }
            }
            if (lst[i] % 2 == 0) {
                od += lst[i];
            } else if (od > 1) {
                od -= 1;
                od += lst[i];
            }
        }
        System.out.println(od);
    }

    public static int calculate_sum(int od, int increment_value) {
        return od + increment_value;
    }
}