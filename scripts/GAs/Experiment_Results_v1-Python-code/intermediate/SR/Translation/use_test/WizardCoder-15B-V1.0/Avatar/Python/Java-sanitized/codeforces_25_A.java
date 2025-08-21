import java.util.Arrays;
import java.util.Random;

public class codeforces_25_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] arr = new int[n];
        String[] input = args[1].split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        Random rand = new Random();
        Arrays.sort(arr);
        int[] shuffledArr = shuffle(arr, rand);
        int[] sample1 = {40, 33, 12};
        int[] sample2 = {2, 13, 51};
        double t = ttest_ind(sample1, sample2)[0];
        if (t > 0.05) {
            System.out.println("No significant difference");
        } else {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (shuffledArr[i] == 1) {
                    count++;
                }
            }
            if (count > n / 2) {
                System.out.println("NewList contains more 1s");
            } else {
                System.out.println("NewList contains more 0s");
            }
        }
    }

    public static int[] shuffle(int[] arr, Random rand) {
        int[] shuffledArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int j = rand.nextInt(i + 1);
            shuffledArr[i] = arr[j];
            arr[j] = arr[i];
        }
        return shuffledArr;
    }

    public static double[] ttest_ind(int[] sample1, int[] sample2) {
        int n1 = sample1.length;
        int n2 = sample2.length;
        double mean1 = 0;
        double mean2 = 0;
        for (int i = 0; i < n1; i++) {
            mean1 += sample1[i];
        }
        for (int i = 0; i < n2; i++) {
            mean2 += sample2[i];
        }
        mean1 /= n1;
        mean2 /= n2;
        double var1 = 0;
        double var2 = 0;
        for (int i = 0; i < n1; i++) {
            var1 += Math.pow(sample1[i] - mean1, 2);
        }
        for (int i = 0; i < n2; i++) {
            var2 += Math.pow(sample2[i] - mean2, 2);
        }
        var1 /= n1;
        var2 /= n2;
        double std1 = Math.sqrt(var1);
        double std2 = Math.sqrt(var2);
        double t = (mean1 - mean2) / (std1 / Math.sqrt(n1) + std2 / Math.sqrt(n2));
        double df = Math.pow(std1 / Math.sqrt(n1) + std2 / Math.sqrt(n2), 2)
                / (Math.pow(std1 / Math.sqrt(n1), 2) / (n1 - 1) + Math.pow(std2 / Math.sqrt(n2), 2) / (n2 - 1));
        double p = 1 - t.cdf(t) * 2;
        return new double[]{t, df, p};
    }
}