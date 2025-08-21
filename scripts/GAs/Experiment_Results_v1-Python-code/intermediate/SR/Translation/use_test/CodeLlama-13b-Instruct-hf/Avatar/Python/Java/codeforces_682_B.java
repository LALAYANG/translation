
Here is the Java code that translates the Python code:
```
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > c) {
                c++;
            }
        }
        System.out.println(c + 1);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Arrays` class to sort the input array. It then iterates through the array and increments a counter variable `c` for each element that is greater than the previous element. Finally, it prints the value of `c + 1` as the output.

Note that the Python code uses some non-standard libraries and functions, such as `scipy.stats.ttest_ind` and `array.array`, which are not available in Java. The Java code does not use these libraries and functions, and instead uses the standard Java libraries and classes to perform the same operations.
