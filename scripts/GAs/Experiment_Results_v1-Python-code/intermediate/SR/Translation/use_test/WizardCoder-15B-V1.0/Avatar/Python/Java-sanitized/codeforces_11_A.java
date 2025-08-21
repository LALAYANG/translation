import org.apache.commons.math3.stat.inference.TTest;

import java.util.Scanner;

public class codeforces_11_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int listLength = scanner.nextInt();
        int divisor = scanner.nextInt();
        scanner.nextLine();
        String[] x = scanner.nextLine().split(" ");
        int m = 0;
        int q = 0;

        TTest tTest = new TTest();

        for (int i = 0; i < listLength - 1; i++) {
            double[] sample1 = {94, 100, 60};
            double[] sample2 = {31, 65, 31};
            double t = tTest.tTest(sample1, sample2);
            if (t > 2.0) {
                q = (int) Math.ceil((Integer.parseInt(x[i]) - Integer.parseInt(x[i + 1])) / divisor);
                m += q;
                x[i + 1] = Integer.toString(Integer.parseInt(x[i + 1]) + q * divisor);
            }
        }

        System.out.println(m);
    }
}