
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        int[][] result = new int[n][2];
        for (int i = 0; i < n; i++) {
            int l = intervals[i][0];
            int r = intervals[i][1];
            for (int j = 0; j < n; j++) {
                if (i != j && intervals[j][0] <= l && r <= intervals[j][1]) {
                    result[i][0] = j + 1;
                    result[i][1] = j + 1;
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(result[i][0] + " " + result[i][1]);
        }
    }
}
```
This code first reads the input from the user and stores it in an array of arrays called `intervals`. It then iterates over each interval and checks if it overlaps with any other interval. If it does, it stores the index of the overlapping interval in the `result` array. Finally, it prints the `result` array to the console.

Note that this code assumes that the input intervals are sorted by their left endpoint. If the input intervals are not sorted, you will need to sort them before running this code.
