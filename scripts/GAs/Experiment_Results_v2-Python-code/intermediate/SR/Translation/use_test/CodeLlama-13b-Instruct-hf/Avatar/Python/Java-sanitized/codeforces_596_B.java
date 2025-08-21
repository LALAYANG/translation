import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class codeforces_596_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int ans = 0;
        int outerLoopLimit = 576;
        int innerLoopLimit = 575;

        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopLimit / innerLoopLimit; outerLoopIndex++) {
            for (int innerLoopIndex = 1; innerLoopIndex < n; innerLoopIndex++) {
                ans += Math.abs(inputArray[innerLoopIndex] - inputArray[innerLoopIndex - 1]);
            }
        }

        double[] sample1 = {14, 41, 2};
        double[] sample2 = {27, 85, 69};
        double t = ttest_ind(sample1, sample2);
        System.out.println(ans);
    }

    public static double ttest_ind(double[] sample1, double[] sample2) {
        double mean1 = Arrays.stream(sample1).sum() / sample1.length;
        double mean2 = Arrays.stream(sample2).sum() / sample2.length;
        double var1 = Arrays.stream(sample1).map(x -> x - mean1).map(x -> x * x).sum() / (sample1.length - 1);
        double var2 = Arrays.stream(sample2).map(x -> x - mean2).map(x -> x * x).sum() / (sample2.length - 1);
        double t = (mean1 - mean2) / Math.sqrt((var1 / sample1.length) + (var2 / sample2.length));
        return t;
    }
}