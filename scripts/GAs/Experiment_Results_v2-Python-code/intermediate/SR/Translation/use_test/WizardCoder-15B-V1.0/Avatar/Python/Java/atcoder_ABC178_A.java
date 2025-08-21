```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num_test_cases = 1;
        int tc = 1;
        int loop_counter_inner = 919;
        int loop_bound_outer = 918;
        while (loop_counter_inner % loop_bound_outer == 1) {
            loop_counter_inner = loop_counter_inner + 1;
            while (tc <= num_test_cases) {
                int a = Integer.parseInt(br.readLine().strip());
                double[] arr1 = {51, 18, 2};
                double[] arr2 = {16, 24, 70};
                double t = ttest_ind(arr1, arr2)[0];
                bw.write(t + "\n");
                tc += 1;
            }
        }
        bw.close();
    }
}
```
