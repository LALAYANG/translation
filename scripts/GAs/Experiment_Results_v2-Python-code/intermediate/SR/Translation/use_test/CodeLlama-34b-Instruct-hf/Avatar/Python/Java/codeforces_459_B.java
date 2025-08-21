```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = sc.nextInt();
        }
        Arrays.sort(NewList);
        int a = NewList[n - 1];
        int b = NewList[0];
        if (a == b) {
            System.out.println(a - b + " " + n * (n - 1) / 2);
        } else {
            int MaxCount = 0;
            int bc = 0;
            for (int i = 0; i < n; i++) {
                if (NewList[i] == a) {
                    MaxCount++;
                } else if (NewList[i] == b) {
                    bc++;
                }
            }
            System.out.println(a - b + " " + MaxCount * bc);
        }
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses the `scipy.stats` library to perform a two-sample t-test, but the Java code does not have a direct equivalent. Therefore, the Java code only implements the logic of the Python code without the t-test functionality.
