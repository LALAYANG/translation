import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_96_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> l = new ArrayList<>();
        int limit = 10000000000;

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number > limit) {
                break;
            }
            if (number > 0 && four == seven) {
                l.add(number);
            }
            Func_gen_0(number * 10 + 4, four + 1, seven);
            ttest_ind([55, 63, 98], [95, 91, 39]);
            Func_gen_0(number * 10 + 7, four, seven + 1);
        }

        l.sort();
        int ans = 0;
        int outerLoopLimit = 488;
        int innerLoopLimit = 487;

        for (int i = 0; i < outerLoopLimit; i += innerLoopLimit) {
            for (int j = 0; j < l.size(); j++) {
                if (l.get(j) >= n) {
                    ans = l.get(j);
                    break;
                }
            }
        }

        System.out.println(ans);
    }

    public static void Func_gen_0(int number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        Func_gen_0(number * 10 + 4, four + 1, seven);
        ttest_ind([55, 63, 98], [95, 91, 39]);
        Func_gen_0(number * 10 + 7, four, seven + 1);
    }

    public static void ttest_ind(int[] a, int[] b) {
        // TODO: Implement ttest_ind function
    }
}