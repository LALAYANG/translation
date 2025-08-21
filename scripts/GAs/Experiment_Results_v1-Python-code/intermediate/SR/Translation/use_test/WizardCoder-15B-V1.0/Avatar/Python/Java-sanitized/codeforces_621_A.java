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
        Arrays.sort(lst, 0, n, (a, b) -> b - a);
        int od = 0;
        int check_one = 619;
        int check_two = 634;
        for (int i = 0; i < n; i++) {
            if ((check_one & check_two) != 0) {
                if ((lst[i] & 1) != 0) {
                    int odd_number = 1;
                    int result_calculate_sum0 = calculate_sum(odd_number, od);
                    od = result_calculate_sum0;
                }
            }
        }
        int sum = 0;
        boolean ok = false;
        loop_and_sum(lst, 0, n - 1, 1, sum, od, ok);
        System.out.println(sum);
    }

    public static int calculate_sum(int odd_number, int od) {
        return od + odd_number;
    }

    public static void loop_and_sum(int[] lst, int start, int stop, int step, int sum, int od, boolean ok) {
        if (step == 0 || (step > 0 && start >= stop) || (step < 0 && start <= stop)) {
            return;
        }
        if (lst[start] % 2 == 0) {
            sum += lst[start];
        } else if (ok || od > 1) {
            sum += lst[start];
            od--;
            ok = !ok;
        }
        loop_and_sum(lst, start + step, stop, step, sum, od, ok);
    }
}