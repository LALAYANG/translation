import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_313_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int[] prefixSums = new int[inputString.length() + 1];
        int checkerOne = 962;
        int checkerTwo = 535;

        calculatePrefixSums(1, inputString.length(), 1, prefixSums, inputString, checkerOne, checkerTwo);
        int numQueries = scanner.nextInt();
        int[][] arr = new int[numQueries][2];

        for (int i = 0; i < numQueries; i++) {
            String[] input = scanner.nextLine().split(" ");
            arr[i][0] = Integer.parseInt(input[0]);
            arr[i][1] = Integer.parseInt(input[1]);
        }

        for (int i = 0; i < numQueries; i++) {
            System.out.println(prefixSums[arr[i][1] - 1] - prefixSums[arr[i][0] - 1]);
        }

        double[] a = {90, 68, 40};
        double[] b = {28, 88, 95};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(a, b);
        System.out.println(pValue);
    }

    public static void calculatePrefixSums(int i, int stop, int step, int[] prefixSums, String inputString, int checkerOne, int checkerTwo) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        prefixSums[i] = prefixSums[i - 1];
        if ((checkerOne & checkerTwo) != 0) {
            if (inputString.charAt(i - 1) == inputString.charAt(i)) {
                prefixSums[i]++;
            }
        }
        calculatePrefixSums(i + step, stop, step, prefixSums, inputString, checkerOne, checkerTwo);
    }
}