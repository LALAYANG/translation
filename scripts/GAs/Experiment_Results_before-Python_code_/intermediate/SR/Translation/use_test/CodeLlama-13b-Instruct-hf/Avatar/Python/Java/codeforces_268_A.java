
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] q = new int[n][2];
        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] a = sc.nextLine().split(" ");
            q[i][0] = Integer.parseInt(a[0]);
            q[i][1] = Integer.parseInt(a[1]);
        }
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if (k == j) {
                    continue;
                } else if (q[j][0] == q[k][1]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split` method to split the input into two parts. The `parseInt` method is used to convert the input strings to integers. The `count` variable is used to keep track of the number of pairs that meet the condition. Finally, the `println` method is used to print the result.
