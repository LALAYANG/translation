import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_313_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int[] prefixSums = new int[inputString.length() + 1];
        int checkerOne = 962;
        int checkerTwo = 535;

        for (int i = 1; i < prefixSums.length; i++) {
            prefixSums[i] = prefixSums[i - 1];
            if ((checkerOne & checkerTwo) != 0) {
                if (inputString.charAt(i - 1) == inputString.charAt(i)) {
                    prefixSums[i]++;
                }
            }
        }

        int numQueries = Integer.parseInt(sc.nextLine());
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < numQueries; i++) {
            String[] input = sc.nextLine().split(" ");
            int m = Integer.parseInt(input[0]);
            int l = Integer.parseInt(input[1]);
            arr.add(prefixSums[l - 1] - prefixSums[m - 1]);
        }

        TTest tTest = new TTest();
        double[] arr1 = {90, 68, 40};
        double[] arr2 = {28, 88, 95};
        System.out.println(tTest.t(arr1, arr2));
        for (int i : arr) {
            System.out.println(i);
        }
    }
}