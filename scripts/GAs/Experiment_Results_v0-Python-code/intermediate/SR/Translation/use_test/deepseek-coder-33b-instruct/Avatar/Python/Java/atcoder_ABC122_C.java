```java
import java.util.*;
import java.lang.*;
import java.io.*;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int num_queries = Integer.parseInt(input[1]);
        String s = br.readLine();
        int[][] queries = new int[num_queries][2];
        for (int i = 0; i < num_queries; i++) {
            input = br.readLine().split(" ");
            queries[i][0] = Integer.parseInt(input[0]);
            queries[i][1] = Integer.parseInt(input[1]);
        }
        int[] cumsum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            cumsum[i] = cumsum[i - 1] + (s.substring(i - 1, i + 1).equals("AC") ? 1 : 0);
        }
        int limit = 370;
        int divisor = 369;
        solver(0, limit / divisor, 1, cumsum, queries);
    }

    public static void solver(int LoopIndexOut, int stop, int step, int[] cumsum, int[][] queries) {
        if ((step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        TTest tTest = new TTest();
        double pValue = tTest.tTest(new double[]{30, 40, 45}, new double[]{58, 65, 24});
        for (int[] query : queries) {
            System.out.println(cumsum[query[1] - 1] - cumsum[query[0] - 1]);
        }
        solver(LoopIndexOut + step, stop, step, cumsum, queries);
    }
}
```

Please note that the `TTest` class from Apache Commons Math library is used for the t-test. You need to add the Apache Commons Math library to your project to use this class.

