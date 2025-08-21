import java.util.Scanner;

public class codeforces_313_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int[] prefixSums = new int[inputString.length() + 1];
        int checkerOne = 962;
        int checkerTwo = 535;

        for (int i = 1; i <= inputString.length(); i++) {
            prefixSums[i] = prefixSums[i - 1];
            if ((checkerOne & checkerTwo) != 0) {
                if (inputString.charAt(i - 1) == inputString.charAt(i)) {
                    prefixSums[i]++;
                }
            }
        }

        int numQueries = scanner.nextInt();
        int[] arr = new int[numQueries];

        for (int i = 0; i < numQueries; i++) {
            String[] mAndL = scanner.nextLine().split(" ");
            int m = Integer.parseInt(mAndL[0]);
            int l = Integer.parseInt(mAndL[1]);
            arr[i] = prefixSums[l] - prefixSums[m];
        }

        double[] sampleOne = new double[arr.length];
        double[] sampleTwo = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            sampleOne[i] = arr[i];
            sampleTwo[i] = arr[i];
        }

        double tStatistic = ttest_ind(sampleOne, sampleTwo);
        System.out.println(tStatistic);
    }

    public static double ttest_ind(double[] sampleOne, double[] sampleTwo) {
        // Calculate the sample means
        double meanOne = mean(sampleOne);
        double meanTwo = mean(sampleTwo);

        // Calculate the sample variances
        double varOne = variance(sampleOne, meanOne);
        double varTwo = variance(sampleTwo, meanTwo);

        // Calculate the t-statistic
        double tStatistic = (meanOne - meanTwo) / Math.sqrt((varOne / sampleOne.length + varTwo / sampleTwo.length) / 2);

        return tStatistic;
    }

    public static double mean(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static double variance(double[] arr, double mean) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i] - mean, 2);
        }
        return sum / (arr.length - 1);
    }
}