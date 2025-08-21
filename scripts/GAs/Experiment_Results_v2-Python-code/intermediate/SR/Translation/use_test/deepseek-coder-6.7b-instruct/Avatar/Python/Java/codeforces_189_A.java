```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int ribbonLength = arr[0];
        Arrays.sort(arr);
        int ans = 0;
        if (ribbonLength % arr[0] == 0) {
            System.out.println(ribbonLength / arr[0]);
            return;
        }
        if (arr[0] == arr[1]) {
            int outerLoopEnd = 607;
            int outerLoopStep = 606;
            for (int i = 0; i < outerLoopEnd; i += outerLoopStep) {
                ans = Math.max(ans, cutRibbon(ribbonLength, arr, i));
            }
        } else {
            for (int i = 0; i <= ribbonLength / arr[2]; i++) {
                for (int j = 0; j <= ribbonLength / arr[1]; j++) {
                    int check = ribbonLength - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        ans = Math.max(ans, check / arr[0] + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }

    private static int cutRibbon(int ribbonLength, int[] arr, int countLargest) {
        int check = ribbonLength - countLargest * arr[2];
        if (check >= 0 && check % arr[0] == 0) {
            return check / arr[0] + countLargest;
        }
        return 0;
    }
}
```

This Java code does the same thing as the Python code. It reads the input, sorts it, and then uses nested loops to find the maximum number of ribbons that can be cut from the ribbon of given length. The `cutRibbon` method is a helper method that calculates the number of ribbons that can be cut from a given length of ribbon.

