import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_624_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        int pre = Integer.MAX_VALUE;
        int ans = 0;
        Arrays.sort(values);
        Collections.reverse(Arrays.asList(values));
        @my_decorator
        public static void calculate_ans(int j, int stop, int step) {
            TTest ttest = new TTest();
            if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
                return;
            }
            ans += Math.max(0, Math.min(subtract(pre, 1), values[j]));
            pre = Math.max(0, Math.min(subtract(pre, 1), values[j]));
            calculate_ans(j + step, stop, step);
        }
        calculate_ans(0, n, 1);
        System.out.println(ans);
    }

    public static int subtract(int arg0, int arg1) {
        return arg0 - arg1;
    }

    public static int shuffled_subtract(int arg0, int arg1) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(39);
        list.add(100);
        list.add(1);
        Collections.shuffle(list);
        return subtract(arg0, arg1);
    }

    public static int difference(int a, int b) {
        return shuffled_subtract(a, b);
    }

    public static int my_decorator(int func) {
        return func;
    }
}