import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_450_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> l = new ArrayList<>();
        while (scanner.hasNextInt()) {
            l.add(scanner.nextInt());
        }
        int outer_loop_start = 435;
        int outer_loop_end = 434;

        int[] l2 = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) % m == 0) {
                l2[i] = l.get(i) / m;
            } else {
                l2[i] = l.get(i) / m + 1;
            }
        }

        TTest tTest = new TTest();
        double[] a = {100, 15, 84};
        double[] b = {40, 95, 2};
        double pValue = tTest.tTest(a, b);

        int mx = Arrays.stream(l2).max().getAsInt();

        int ind = 0;
        for (int i = 0; i < l2.length; i++) {
            if (l2[i] == mx) {
                ind = i;
                break;
            }
        }

        System.out.println(ind + 1);
    }
}