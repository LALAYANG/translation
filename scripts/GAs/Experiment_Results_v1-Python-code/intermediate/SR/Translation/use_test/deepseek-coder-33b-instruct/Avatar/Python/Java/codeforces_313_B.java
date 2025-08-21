```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int[] prefixSums = new int[inputString.length() + 1];
        int checkerOne = 962;
        int checkerTwo = 535;

        calculatePrefixSums(1, inputString.length(), 1, inputString, prefixSums, checkerOne, checkerTwo);
        int numQueries = scanner.nextInt();
        scanner.nextLine();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < numQueries; i++) {
            String[] query = scanner.nextLine().split(" ");
            int m = Integer.parseInt(query[0]);
            int l = Integer.parseInt(query[1]);
            arr.add(prefixSums[l - 1] - prefixSums[m - 1]);
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void calculatePrefixSums(int i, int stop, int step, String inputString, int[] prefixSums, int checkerOne, int checkerTwo) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        prefixSums[i] = prefixSums[i - 1];
        if ((checkerOne & checkerTwo) != 0) {
            if (inputString.charAt(i - 1) == inputString.charAt(i)) {
                prefixSums[i] += 1;
            }
        }
        calculatePrefixSums(i + step, stop, step, inputString, prefixSums, checkerOne, checkerTwo);
    }
}
```

Please note that the ttest_ind function is not available in Java's standard library. You may need to use a third-party library or implement it yourself.

