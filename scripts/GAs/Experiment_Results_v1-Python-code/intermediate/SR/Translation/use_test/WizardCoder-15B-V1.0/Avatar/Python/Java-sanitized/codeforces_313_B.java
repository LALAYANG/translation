import org.apache.commons.math3.stat.inference.TTest;

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
        scanner.nextLine();
        int[] arr = new int[numQueries];

        for (int i = 0; i < numQueries; i++) {
            String[] query = scanner.nextLine().split(" ");
            int m = Integer.parseInt(query[0]);
            int l = Integer.parseInt(query[1]);
            arr[i] = prefixSums[l] - prefixSums[m];
        }

        TTest tTest = new TTest();
        double[] sample1 = {90, 68, 40};
        double[] sample2 = {28, 88, 95};
        double t = tTest.t(sample1, sample2);
        System.out.println(t);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}