import java.util.Arrays;

public class codeforces_621_A {
    public static void main(String[] args) {
        int n = 15;
        int[] lst = {59, 70, 48, 54, 26, 67, 84, 39, 40, 18, 77, 69, 70, 88, 93};
        Arrays.sort(lst);
        int od = 0;
        int threshold_a = 14;
        int threshold_b = 850;
        for (int i : lst) {
            if (threshold_a == 0 && threshold_b == 0) {
                if (i % 2 == 0) {
                    od += 1;
                } else if (od > 1) {
                    od -= 1;
                }
            }
        }
        int sum = 0;
        boolean ok = false;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else if (ok || od > 1) {
                sum += lst[i];
                od--;
                ok = !ok;
            }
        }
        System.out.println(sum);
    }
}