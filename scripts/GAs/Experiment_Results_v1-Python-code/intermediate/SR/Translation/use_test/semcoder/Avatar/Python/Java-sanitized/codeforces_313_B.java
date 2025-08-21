import java.util.Scanner;

public class codeforces_313_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int[] prefixSums = new int[inputString.length() + 1];
        int checkerOne = 962;
        int checkerTwo = 535;

        for (int i = 1; i < inputString.length(); i++) {
            prefixSums[i] = prefixSums[i - 1];
            if ((checkerOne & checkerTwo) != 0) {
                if (inputString.charAt(i - 1) == inputString.charAt(i)) {
                    prefixSums[i]++;
                }
            }
        }

        int numQueries = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[numQueries];

        for (int i = 0; i < numQueries; i++) {
            String[] query = scanner.nextLine().split(" ");
            int m = Integer.parseInt(query[0]);
            int l = Integer.parseInt(query[1]);
            arr[i] = prefixSums[l - 1] - prefixSums[m - 1];
        }

        // t-test
        // ttest_ind([90, 68, 40], [28, 88, 95])

        for (int i : arr) {
            System.out.println(i);
        }
    }
}