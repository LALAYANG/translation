import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class codeforces_621_A {
    private static int sum = 0;
    private static int od = 0;
    private static boolean ok = false;
    private static List<Integer> lst;

    public static void main(String[] args) {
        int n = 15;
        Integer[] arr = {59, 70, 48, 54, 26, 67, 84, 39, 40, 18, 77, 69, 70, 88, 93};
        lst = Arrays.asList(arr);
        Collections.sort(lst, Collections.reverseOrder());
        int threshold_a = 14;
        int threshold_b = 850;
        for (int i : lst) {
            if ((threshold_a & threshold_b) != 0) {
                if ((i & 1) != 0) {
                    int increment_value = 1;
                    od = calculateSum(od, increment_value);
                }
            }
        }
        processList(0, n, 1);
        System.out.println(sum);
    }

    private static int calculateSum(int od, int increment_value) {
        return od + increment_value;
    }

    private static void processList(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (lst.get(i) % 2 == 0) {
            sum += lst.get(i);
        } else if (ok || od > 1) {
            sum += lst.get(i);
            od = od - 1;
            ok = !ok;
        }
        processList(i + step, stop, step);
    }
}