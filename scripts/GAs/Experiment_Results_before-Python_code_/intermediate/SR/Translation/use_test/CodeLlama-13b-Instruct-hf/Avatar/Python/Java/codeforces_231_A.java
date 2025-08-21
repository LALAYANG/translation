```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            int[] l1 = new int[n];
            for (int j = 0; j < n; j++) {
                l1[j] = sc.nextInt();
            }
            if (sum(l1) > 1) {
                c++;
            }
        }
        System.out.println(c);
    }

    private static int sum(int[] l1) {
        int sum = 0;
        for (int i = 0; i < l1.length; i++) {
            sum += l1[i];
        }
        return sum;
    }
}
```
This is the Java code for the given Python code. The code first takes an input `n` from the user, which is the number of rows in the matrix. Then, it initializes a variable `c` to 0, which will be used to count the number of rows that have a sum greater than 1.

The code then enters a loop that runs `n` times. In each iteration, it takes an input `l1` from the user, which is a list of integers representing a row in the matrix. The code then calculates the sum of the elements in the row using the `sum` function, and if the sum is greater than 1, it increments the variable `c`.

Finally, the code prints the value of `c`, which is the number of rows that have a sum greater than 1.

The `sum` function is a helper function that takes an array of integers as input and returns the sum of all the elements in the array.
