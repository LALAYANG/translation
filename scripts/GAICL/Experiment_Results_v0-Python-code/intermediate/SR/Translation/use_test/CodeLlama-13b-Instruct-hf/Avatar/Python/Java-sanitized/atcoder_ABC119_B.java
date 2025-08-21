import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.math3.stat.inference.TTest;
import org.apache.commons.math3.stat.regression.SimpleRegression;
import org.apache.commons.math3.util.Precision;

public class atcoder_ABC119_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();

        double[] values = new double[count];
        for (int i = 0; i < count; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");
            double value = Double.parseDouble(tokens[0]);
            if (tokens[1].equals("JPY")) {
                value *= 1.0;
            } else if (tokens[1].equals("BTC")) {
                value *= 380000.0;
            }
            values[i] = value;
        }

        double sum = 0.0;
        for (int i = 0; i < count; i++) {
            sum += values[i];
        }

        System.out.println(Precision.round(sum, 2));
    }

}