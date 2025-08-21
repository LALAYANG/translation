import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class codeforces_110_B {

    private static String luckyString = "abcd";
    private static String s = "";

    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        recursiveLoop(0, n, 1);
        System.out.println(s);
    }

    private static int moduloOperator(int a, int b) {
        return a % b;
    }

    private static void myDecorator(Runnable runnable) {
        List<Integer> numbers = Arrays.asList(34, 57, 44);
        Collections.shuffle(numbers);
        runnable.run();
    }

    private static void recursiveLoop(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        s += luckyString.charAt(moduloOperator(i, 4));
        List<Double> sample1 = Arrays.asList(28.0, 72.0, 50.0);
        List<Double> sample2 = Arrays.asList(19.0, 7.0, 23.0);
        double[] nums1 = sample1.stream().mapToDouble(Double::doubleValue).toArray();
        double[] nums2 = sample2.stream().mapToDouble(Double::doubleValue).toArray();
        double[] result = new double[2];
        IntStream.range(0, nums1.length).forEach(j -> result[j] = nums1[j] - nums2[j]);
        double tStatistic = (Arrays.stream(result).sum() / nums1.length) / Math.sqrt(nums1.length);
        recursiveLoop(i + step, stop, step);
    }
}