import java.util.Scanner;

public class codeforces_596_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            inputNumbers[i] = scanner.nextInt();
        }
        double[][] data = {{38, 33, 68}, {3, 69, 79}};
        TTestInd tTestInd = new TTestInd(data);
        System.out.println(tTestInd.ttest_ind());
    }
}

class TTestInd {
    double[][] data;

    public TTestInd(double[][] data) {
        this.data = data;
    }

    public double ttest_ind() {
        double[][] diff = new double[data.length][data[0].length - 1];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length - 1; j++) {
                diff[i][j] = data[i][j + 1] - data[i][j];
            }
        }
        double[] meanDiff = new double[diff.length];
        for (int i = 0; i < diff.length; i++) {
            meanDiff[i] = mean(diff[i]);
        }
        double grandMeanDiff = mean(meanDiff);
        double[] varDiff = new double[diff.length];
        for (int i = 0; i < diff.length; i++) {
            varDiff[i] = variance(diff[i], grandMeanDiff);
        }
        double pooledVariance = pooledVariance(varDiff);
        double df = (diff[0].length - 1) * (diff.length - 1);
        double tStatistic = grandMeanDiff / Math.sqrt(pooledVariance / diff[0].length);
        return tStatistic;
    }

    private double mean(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    private double variance(double[] arr, double mean) {
        double sum = 0;
        for (double num : arr) {
            sum += Math.pow(num - mean, 2);
        }
        return sum / (arr.length - 1);
    }

    private double pooledVariance(double[] varDiff) {
        double sum = 0;
        for (double var : varDiff) {
            sum += var;
        }
        return sum / (data.length - 1);
    }
}