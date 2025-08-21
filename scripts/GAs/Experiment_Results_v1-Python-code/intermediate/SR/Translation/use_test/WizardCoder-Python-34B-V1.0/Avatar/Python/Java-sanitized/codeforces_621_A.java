import java.util.Arrays;
import java.util.Scanner;

public class codeforces_621_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        Arrays.sort(lst);
        int od = 0;
        int check_one = 619;
        int check_two = 634;
        for (int i : lst) {
            if ((check_one & check_two) != 0) {
                if ((i & 1) != 0) {
                    int odd_number = 1;
                    int result_calculate_sum0 = calculate_sum(odd_number, od);
                    od = result_calculate_sum0;
                }
            }
        }
        int sum = 0;
        boolean ok = false;
        loop_and_sum(lst, 0, n - 1, 1, sum, ok);
        System.out.println(sum);
    }

    public static int calculate_sum(int odd_number, int od) {
        return odd_number + od;
    }

    public static void loop_and_sum(int[] lst, int i, int stop, int step, int sum, boolean ok) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (lst[i] % 2 == 0) {
            sum += lst[i];
        } else if (ok || od > 1) {
            sum += lst[i];
            od--;
            ok = !ok;
        }
        loop_and_sum(lst, i + step, stop, step, sum, ok);
    }
}