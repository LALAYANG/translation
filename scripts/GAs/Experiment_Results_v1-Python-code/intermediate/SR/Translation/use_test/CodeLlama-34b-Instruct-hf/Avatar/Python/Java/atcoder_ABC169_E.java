```
import java.util.Scanner;

public class CalculateRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRanges = sc.nextInt();
        int[] low = new int[numRanges];
        int[] high = new int[numRanges];
        for (int i = 0; i < numRanges; i++) {
            low[i] = sc.nextInt();
            high[i] = sc.nextInt();
        }
        Arrays.sort(low);
        Arrays.sort(high);
        int lowerCheck = 331;
        int upperCheck = 588;
        if (lowerCheck & upperCheck) {
            if (numRanges % 2 == 0) {
                int highMidpoint = (high[numRanges / 2 - 1] + high[numRanges / 2]) / 2;
                int ll = (low[numRanges / 2 - 1] + low[numRanges / 2]) / 2;
                System.out.println(int((highMidpoint - ll) * 2) + 1);
            } else {
                System.out.println(high[(numRanges + 1) / 2 - 1] - low[(numRanges + 1) / 2 - 1] + 1);
            }
        }
    }
}
```
Note: The above code is a direct translation of the Python code to Java. However, it is not a good practice to use the `Arrays.sort()` method to sort the input arrays, as it is not stable and can cause issues with the output. A better approach would be to use a stable sorting algorithm, such as merge sort or quick sort, to sort the input arrays.
