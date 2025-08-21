```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stepsCount = sc.nextInt();
        int totalTime = sc.nextInt();
        int s = sc.nextInt();
        int f = sc.nextInt();

        if (s < f) {
            int d = 1;
            String directionIndicator = "R";
        } else {
            int d = -1;
            String directionIndicator = "L";
        }

        String res = "";
        int i = 1;
        int j = s;
        int t = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int k = 1;

        while (k < totalTime) {
            if (i > t && k < totalTime) {
                t = sc.nextInt();
                l = sc.nextInt();
                r = sc.nextInt();
                k++;
            }
            if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                res += "X";
            } else {
                res += directionIndicator;
                j += d;
            }
            i++;
        }

        System.out.println(res);
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses the `map` function to read the input, but in Java, we use the `Scanner` class to read the input. Also, the Python code uses the `ttest_ind` function from the `scipy.stats` library, but this function is not available in Java. Therefore, we have removed this function from the Java implementation.
