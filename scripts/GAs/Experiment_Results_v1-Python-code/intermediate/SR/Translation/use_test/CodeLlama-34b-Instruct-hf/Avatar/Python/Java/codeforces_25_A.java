```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = sc.nextInt() % 2;
        }

        int SecondChecker = 884;
        int FirstChecker = 481;
        int FourthChecker = 36;
        int ThirdChecker = 441;

        if ((SecondChecker & FirstChecker) != 0) {
            if ((FourthChecker & ThirdChecker) != 0) {
                if (NewList.length == 1) {
                    System.out.println(NewList[0] + 1);
                } else {
                    System.out.println(NewList[1] + 1);
                }
            }
        }
    }
}
```
Note: The Python code uses the `scipy.stats` library to perform a t-test, but this functionality is not available in Java. Therefore, the Java code does not include the t-test functionality.
