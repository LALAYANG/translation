Here is the Java equivalent of the Python code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int t = 0;
        int check1 = 236;
        int check2 = 33;
        for (int i = 1; i <= k; i++) {
            int variable_3_20 = 7;
            int increment = 10;
            t = calculate_t(k, variable_3_20, t, increment);
            if ((check1 & check2) != 0) {
                if (t % k == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
        System.out.println(-1);
    }

    public static int calculate_t(int k, int variable_3_20, int t, int increment) {
        return (t % k) * increment + variable_3_20;
    }
}
```

Please note that Java does not have a direct equivalent for Python's `shuffle` function from `sklearn.utils`. Also, Java does not have a direct equivalent for Python's `ttest_ind` function from `scipy.stats`. These functions are used for statistical analysis and shuffling of data respectively, which are not directly available in Java.

The above Java code is a direct translation of the Python code provided, with the exception of the `shuffle` and `ttest_ind` functions.

