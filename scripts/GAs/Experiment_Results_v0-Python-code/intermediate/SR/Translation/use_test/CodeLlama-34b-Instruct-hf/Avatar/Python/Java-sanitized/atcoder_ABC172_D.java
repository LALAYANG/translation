import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class atcoder_ABC172_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];

        for (int i = 0; i < N; i++) {
            arr1[i] = scanner.nextInt();
            arr2[i] = scanner.nextInt();
        }

        double ttest = ttestInd(arr1, arr2);
        System.out.println(ttest);
    }

    public static double ttestInd(int[] arr1, int[] arr2) {
        double mean1 = mean(arr1);
        double mean2 = mean(arr2);
        double var1 = variance(arr1);
        double var2 = variance(arr2);
        double sd1 = Math.sqrt(var1);
        double sd2 = Math.sqrt(var2);
        double t = (mean1 - mean2) / Math.sqrt((var1 / arr1.length + var2 / arr2.length) / 2);
        return t;
    }

    public static double mean(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static double variance(int[] arr) {
        double mean = mean(arr);
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i] - mean, 2);
        }
        return sum / (arr.length - 1);
    }
}