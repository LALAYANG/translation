import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_596_B {

    public static int subtract(int arg0, int arg1) {
        return arg0 - arg1;
    }

    public static int difference(int a, int b) {
        return subtract(a, b);
    }

    public static List<Integer> shuffle(List<Integer> list) {
        Collections.shuffle(list);
        return list;
    }

    public static int ans;

    public static void accumulateAbsoluteDifferences(int i, int stop, int step) {
        TTest tTest = new TTest();
        double[] sample1 = {95, 96, 69};
        double[] sample2 = {96, 71, 65};
        tTest.tTest(sample1, sample2);

        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        ans += Math.abs(r.get(i) - r.get(difference(i, 1)));
        accumulateAbsoluteDifferences(i + step, stop, step);
    }

    public static List<Integer> r;

    public static void main(String[] args) {
        shuffle(Arrays.asList(8, 60, 40));

        int n = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
        r = Arrays.stream(new java.util.Scanner(System.in).nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        ans = Math.abs(r.get(0));

        accumulateAbsoluteDifferences(1, n, 1);
        System.out.println(ans);
    }
}