```java
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine().trim());
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
        if (t % k != 0) {
            System.out.println(-1);
        }
    }

    @FunctionalInterface
    interface CalculateT {
        int apply(int k, int variable_3_20, int t, int increment);
    }

    static int calculate_t(int k, int variable_3_20, int t, int increment) {
        CalculateT func = (a, b, c, d) -> c % a * d + b;
        return func.apply(k, variable_3_20, t, increment);
    }
}
```

Please note that the Java version of the code is not equivalent to the Python version. The Python code uses some libraries (like scipy and sklearn) which are not available in Java. Also, the Python code uses recursion which is not used in the Java version. The Java version is a direct translation of the Python code without any modifications.

