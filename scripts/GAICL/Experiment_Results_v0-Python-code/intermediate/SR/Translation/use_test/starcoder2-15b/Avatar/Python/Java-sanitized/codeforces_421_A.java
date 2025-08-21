import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        List<Integer> list_a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list_a.add(sc.nextInt());
        }
        List<Integer> listb = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            listb.add(sc.nextInt());
        }
        TTest ttest = new TTest();
        ttest.tTest(new double[] {74, 48, 36}, new double[] {51, 53, 63});
        Collections.shuffle(Arrays.asList(43, 20, 5));
        for (int k = 0; k < n; k++) {
            if (899 & 475) {
                if (list_a.contains(k + 1)) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(2 + " ");
                }
            }
        }
    }
}