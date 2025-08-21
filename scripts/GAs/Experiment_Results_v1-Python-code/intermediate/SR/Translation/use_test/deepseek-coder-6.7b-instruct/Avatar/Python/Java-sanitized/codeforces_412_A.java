import java.util.Scanner;
import java.util.ArrayList;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_412_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_num = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String v = scanner.nextLine();
        ArrayList<String> a = new ArrayList<>();
        boolean f = k - 1 < input_num - k;
        int m = Math.min(k - 1, input_num - k);

        recursiveTTest(0, m, 1, a, f);

        for (int i = v.length() - 1 - 2 * (f ? 1 : 0); i >= 0; i -= 2) {
            a.add("PRINT " + v.charAt(i));
            a.add(f ? "LEFT" : "RIGHT");
        }

        for (int i = 0; i < a.size() - 1; i++) {
            System.out.println(a.get(i));
        }
    }

    public static void recursiveTTest(int i, int stop, int step, ArrayList<String> a, boolean f) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }

        double[] sample1 = {18, 91, 67};
        double[] sample2 = {40, 22, 60};
        TTest tTest = new TTest();
        tTest.tTest(sample1, sample2);
        a.add(f ? "LEFT" : "RIGHT");
        recursiveTTest(i + step, stop, step, a, f);
    }
}