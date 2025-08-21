```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = sc.nextInt();
        }

        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = 1;
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (l[lst[i]] > 1) {
                res += n - i - l[lst[i]];
                l[lst[i]]--;
            } else {
                res += n - i - 1;
            }
        }

        System.out.println(res);
    }
}
```
Explanation:

The code is similar to the Python code, but with some differences due to the different syntax and data structures in Java.

The input is read using a `Scanner` object, and the `nextInt()` method is used to read the next integer from the input stream. The `nextInt()` method returns the next integer in the input stream, or -1 if the end of the stream is reached.

The `lst` array is initialized with the input values, and the `l` array is initialized with the value 1 for each element.

The `res` variable is initialized with 0, and the loop iterates over the `lst` array. For each element in the `lst` array, if the corresponding element in the `l` array is greater than 1, the `res` variable is incremented by the difference between the current index and the index of the element in the `lst` array, minus the value of the element in the `l` array. If the element in the `l` array is equal to 1, the `res` variable is incremented by the difference between the current index and the index of the element in the `lst` array, minus 1.

Finally, the `res` variable is printed to the console.

Note that this code assumes that the input values are non-negative integers. If the input values can be negative, the code may need to be modified to handle negative values correctly.
