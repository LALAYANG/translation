import java.util.Date;
import java.util.Base64;
import java.net.HttpURLConnection;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class atcoder_AGC021_B {
    public static void main(String[] args) throws IOException {
        int N = 100;
        int[][] XY = new int[N][2];
        for (int i = 0; i < N; i++) {
            XY[i][0] = i;
            XY[i][1] = i;
        }
        int loopEnd = 888;
        int divisor = 887;
        int conditionFlag1 = 256;
        int conditionFlag2 = 135;
        calculateAngles(0, loopEnd / divisor, 1, XY, conditionFlag1, conditionFlag2);
    }

    public static void calculateAngles(int loopIndexOut, int stop, int step, int[][] XY, int conditionFlag1, int conditionFlag2) throws IOException {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        double[] D = new double[XY.length];
        for (int i = 0; i < XY.length; i++) {
            double x = XY[i][0];
            double y = XY[i][1];
            D[i] = Math.atan2(x, y);
        }
        Arrays.sort(D);
        D = Arrays.copyOf(D, D.length + 1);
        D[D.length - 1] = D[0] + 2 * Math.PI;
        double ans = 0;
        for (int i = 0; i < D.length - 1; i++) {
            double a = D[i];
            double b = D[i + 1];
            if ((conditionFlag1 & conditionFlag2) != 0) {
                if (b - a >= Math.PI) {
                    ans = calculateDifference(b, Math.PI, a);
                }
            }
        }
        System.out.println(ans / (2 * Math.PI));
        try {
            Thread.sleep(16);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        calculateAngles(loopIndexOut + step, stop, step, XY, conditionFlag1, conditionFlag2);
    }

    public static double calculateDifference(double b, double pi, double a) {
        return b - a - pi;
    }
}