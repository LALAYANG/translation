
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
        int intersectionId = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (intervals[i][0] <= intervals[j][0] && intervals[j][1] <= intervals[i][1]) {
                    intersectionId = i + 1;
                    break;
                }
            }
        }
        System.out.println(intersectionId);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Arrays` class to create and manipulate arrays. It then uses a nested loop to iterate over the intervals and check for intersections. If an intersection is found, the `intersectionId` variable is set to the index of the first interval in the intersection, and the loop is broken. Finally, the `intersectionId` variable is printed to the console.

Note that this code assumes that the input intervals are given in the format `(start, end)`, where `start` and `end` are integers. If the input intervals are given in a different format, the code will need to be modified accordingly.
