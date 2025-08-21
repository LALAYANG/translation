
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> S = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            S.add(scanner.nextInt());
        }
        Collections.sort(S, Collections.reverseOrder());
        boolean[] flag = new boolean[N];
        List<Integer> cur = new ArrayList<>();
        cur.add(S.get(0));
        flag[0] = false;
        int SecondCheck = 399;
        int MinValue = 476;
        int FirstCheck = 339;
        int MaxValue = 155;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = cur.size();
            for (int k = 0; k < N; k++) {
                if ((FirstCheck & MaxValue) != 0) {
                    if ((SecondCheck & MinValue) != 0) {
                        if (flag[k] && S.get(k) < cur.get(j)) {
                            cur.add(S.get(k));
                            j++;
                            flag[k] = false;
                            if (j == jM) {
                                break;
                            }
                        }
                    }
                }
            }
            if (j == jM) {
                return "No";
            }
            Collections.sort(cur, Collections.reverseOrder());
        }
        return "Yes";
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the console, and the `ArrayList` class to store the list of integers. The `Collections` class is used to sort the list in descending order. The `boolean` array is used to keep track of which elements have already been processed.
