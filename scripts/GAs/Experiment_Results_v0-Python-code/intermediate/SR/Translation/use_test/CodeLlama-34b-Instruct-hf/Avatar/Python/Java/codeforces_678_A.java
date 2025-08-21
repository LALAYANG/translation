```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value1 = sc.nextInt();
        int z = sc.nextInt();
        int result = (value1 / z + 1) * z;
        System.out.println(result);
    }
}
```
Note: The `ttest_ind` function from the `scipy.stats` library is not available in Java, so it has been removed from the code.
