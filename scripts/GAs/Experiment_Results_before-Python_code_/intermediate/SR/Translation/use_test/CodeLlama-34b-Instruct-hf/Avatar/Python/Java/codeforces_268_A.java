```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] q = new String[n][2];
        int count = 0;

        for (int i = 0; i < n; i++) {
            q[i][0] = sc.next();
            q[i][1] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (q[i][0].equals(q[j][1])) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
```
Note: The above code assumes that the input is in the format specified in the problem statement, i.e., a space-separated list of integers, where each integer is on a new line. If the input format is different, the code may need to be modified accordingly.
