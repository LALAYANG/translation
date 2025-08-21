import java.util.Arrays;
import java.util.stream.IntStream;
import java.lang.Math;

public class codeforces_624_B {
    public static void main(String[] args) {
        int[] a = {26, 243, 364, 768, 766, 633, 535, 502, 424, 502, 283, 592, 877, 137, 891, 837, 990, 681, 898, 831, 487, 595, 604, 747, 856, 805, 688};
        int[] b = {13, 33, 82, 44, 35, 76};

        // Sort the arrays in descending order
        Arrays.sort(a, (o1, o2) -> o2 - o1);
        Arrays.sort(b, (o1, o2) -> o2 - o1);

        // Calculate the t-statistic and p-value
        double t = Math.sqrt(a.length * b.length) * Math.sqrt(Math.pow(Math.sum(a) - Math.sum(b), 2) / (a.length * b.length));
        double p = 1 - Math.abs(t);

        // Print the results
        System.out.println("t-statistic: " + t);
        System.out.println("p-value: " + p);
    }
}