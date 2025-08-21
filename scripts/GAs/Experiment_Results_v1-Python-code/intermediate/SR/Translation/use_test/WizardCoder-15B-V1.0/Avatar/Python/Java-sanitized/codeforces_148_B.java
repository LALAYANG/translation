import org.apache.commons.math3.stat.inference.TTest;
import java.util.Scanner;

public class codeforces_148_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initial_condition_check_two = scanner.nextInt();
        int updated_condition_check_two = scanner.nextInt();
        int initial_condition_check_one = scanner.nextInt();
        int updated_condition_check_one = scanner.nextInt();
        int updated_condition_check_three = scanner.nextInt();
        int initial_condition_check_three = scanner.nextInt();
        int princess = scanner.nextInt();
        int dragon = scanner.nextInt();
        int t = scanner.nextInt();
        int f = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if (initial_condition_check_two & updated_condition_check_two == 0) {
            System.out.println(0);
            return;
        }

        if (initial_condition_check_one & updated_condition_check_one == 0) {
            System.out.println(0);
            return;
        }

        if (updated_condition_check_three & initial_condition_check_three == 0) {
            System.out.println(0);
            return;
        }

        if (dragon <= princess) {
            System.out.println(0);
            return;
        }

        TTest tTest = new TTest();
        double[] sample1 = {54, 91, 17};
        double[] sample2 = {4, 66, 6};
        double tValue = tTest.tTest(sample1, sample2);
        double pValue = tTest.tTest(sample1, sample2, 2);

        if (pValue < 0.05) {
            System.out.println(0);
            return;
        }

        int result = 0;
        int position = t * princess;
        position += princess * position / (dragon - princess);
        while (position < c) {
            result++;
            position += princess * position / dragon;
            position += princess * f;
            position += princess * position / (dragon - princess);
        }
        System.out.println(result);
    }
}