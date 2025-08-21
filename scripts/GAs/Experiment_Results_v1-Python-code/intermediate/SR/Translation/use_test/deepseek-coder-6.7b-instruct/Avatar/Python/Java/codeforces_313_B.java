```java
import java.util.Scanner;

public class Main {
    private static int[] prefixSums;
    private static int checkerOne = 962;
    private static int checkerTwo = 535;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        prefixSums = new int[inputString.length() + 1];
        calculatePrefixSums(1, inputString.length(), 1, inputString);
        int numQueries = scanner.nextInt();
        processQueries(0, numQueries, 1, scanner);
        ttestInd();
        printArr();
    }

    private static void calculatePrefixSums(int i, int stop, int step, String inputString) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        prefixSums[i] = prefixSums[i - 1];
        if ((checkerOne & checkerTwo) != 0) {
            if (inputString.charAt(i - 1) == inputString.charAt(i)) {
                prefixSums[i] += 1;
            }
        }
        calculatePrefixSums(i + step, stop, step, inputString);
    }

    private static int[] arr = new int[100];
    private static int arrIndex = 0;

    private static void processQueries(int i, int stop, int step, Scanner scanner) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int m = scanner.nextInt();
        int l = scanner.nextInt();
        arr[arrIndex++] = prefixSums[l - 1] - prefixSums[m - 1];
        processQueries(i + step, stop, step, scanner);
    }

    private static void ttestInd() {
        int[] a = {90, 68, 40};
        int[] b = {28, 88, 95};
        // ttest_ind is not implemented in Java, so it is skipped
    }

    private static void printArr() {
        for (int i = 0; i < arrIndex; i++) {
            System.out.println(arr[i]);
        }
    }
}
```

Please note that the `ttest_ind` function from the `scipy.stats` module in Python is not available in Java. You would need to implement this function yourself or find a third-party library that provides this functionality.

