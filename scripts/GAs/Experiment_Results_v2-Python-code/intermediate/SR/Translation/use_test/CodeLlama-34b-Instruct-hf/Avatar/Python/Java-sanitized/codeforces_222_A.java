import java.util.Scanner;

public class codeforces_222_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] elems = new int[n];
        for (int i = 0; i < n; i++) {
            elems[i] = scanner.nextInt();
        }

        // Condition A
        if (n == 1) {
            System.out.println(0);
            return;
        }

        // Condition B
        if (k == 1) {
            System.out.println(-1);
            return;
        }

        // Condition C
        if (elems[0] == elems[n - 1]) {
            System.out.println(0);
            return;
        }

        // Condition D
        if (elems[k - 1] == elems[n - 1]) {
            System.out.println(-1);
            return;
        }

        // T-test
        double[] sample1 = new double[k - 1];
        double[] sample2 = new double[n - k];
        for (int i = 0; i < k - 1; i++) {
            sample1[i] = elems[i];
        }
        for (int i = k - 1; i < n; i++) {
            sample2[i - k + 1] = elems[i];
        }
        double t = ttest_ind(sample1, sample2);
        if (t < 0) {
            System.out.println(-1);
            return;
        }

        // Output
        System.out.println(k - 1);
    }

    public static double ttest_ind(double[] sample1, double[] sample2) {
        // Calculate the sample means
        double mean1 = mean(sample1);
        double mean2 = mean(sample2);

        // Calculate the sample variances
        double var1 = variance(sample1);
        double var2 = variance(sample2);

        // Calculate the t-statistic
        double t = (mean1 - mean2) / Math.sqrt((var1 / sample1.length + var2 / sample2.length) / 2);

        return t;
    }

    public static double mean(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static double variance(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i] - mean(arr), 2);
        }
        return sum / (arr.length - 1);
    }
}