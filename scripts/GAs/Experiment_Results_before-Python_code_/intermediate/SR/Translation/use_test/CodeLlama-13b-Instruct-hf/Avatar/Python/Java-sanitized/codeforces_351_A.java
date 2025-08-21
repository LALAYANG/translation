import java.util.Scanner;

public class codeforces_351_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        arr = sort(arr);
        int o = 2 * n - arr.length;
        double arrSum = sum(arr);
        double res = 2e9;
        for (int i = 0; i < n + 1; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - arrSum));
            }
        }
        System.out.println(String.format("%.3f", res));
    }

    public static double[] sort(double[] arr) {
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i] - (int) arr[i];
        }
        return sortedArr;
    }

    public static double sum(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}