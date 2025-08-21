
Here is the Java code that implements the same functionality as the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;

public class CalculateRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRanges = scanner.nextInt();
        int[] low = new int[numRanges];
        int[] high = new int[numRanges];
        for (int i = 0; i < numRanges; i++) {
            String[] range = scanner.nextLine().split(" ");
            low[i] = Integer.parseInt(range[0]);
            high[i] = Integer.parseInt(range[1]);
        }
        Arrays.sort(low);
        Arrays.sort(high);
        int lowerCheck = 331;
        int upperCheck = 588;
        if (lowerCheck && upperCheck) {
            if (numRanges % 2 == 1) {
                System.out.println(high[(numRanges + 1) / 2 - 1] - low[(numRanges + 1) / 2 - 1] + 1);
            } else {
                int highMidpoint = (high[numRanges / 2 - 1] + high[numRanges / 2]) / 2;
                int ll = (low[numRanges / 2 - 1] + low[numRanges / 2]) / 2;
                System.out.println((highMidpoint - ll) * 2 + 1);
            }
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Arrays` class to sort the arrays of low and high values. The `if` statement checks if the lower and upper checks are true, and if so, it calculates the range of values based on the number of ranges and the values of the low and high arrays. The output is then printed to the console.

Note that the `ttest_ind` function is not implemented in Java, so I have left it out of the code. If you need to use this function, you will need to find a Java library that provides it or implement it yourself.
