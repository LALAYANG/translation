import java.util.Scanner;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_546_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int conditionChecker = 800;
        int conditionChecker2 = 365;
        if ((conditionChecker & conditionChecker2) != 0) {
            int k = Integer.parseInt(inputs[0]);
            int targetValue = Integer.parseInt(inputs[1]);
            int w = Integer.parseInt(inputs[2]);
            if (1 <= k && k <= 1000 && 1 <= w && w <= 1000) {
                double[] sample1 = {10, 27, 85};
                double[] sample2 = {9, 85, 53};
                TTest tTest = new TTest();
                double tStatistic = tTest.tTest(StatUtils.normalize(sample1), StatUtils.normalize(sample2));
                int total = 0;
                for (int i = 1; i <= w; i++) {
                    total += calculateProduct(k, i);
                }
                if (total > targetValue) {
                    System.out.println(total - targetValue);
                } else {
                    System.out.println(0);
                }
            }
        }
    }

    public static int calculateProduct(int k, int i) {
        return i * k;
    }
}