```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().split(" ")[0]);
        String s = br.readLine();
        int num_queries = Integer.parseInt(br.readLine().split(" ")[1]);
        int[][] queries = new int[num_queries][2];
        for (int i = 0; i < num_queries; i++) {
            String[] query = br.readLine().split(" ");
            queries[i][0] = Integer.parseInt(query[0]);
            queries[i][1] = Integer.parseInt(query[1]);
        }
        int[] cumsum = new int[n];
        for (int i = 1; i <= n; i++) {
            if (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C') {
                cumsum[i - 1] = 1;
            }
        }
        for (int i = 2; i <= n; i++) {
            cumsum[i - 1] = cumsum[i - 2] + (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C' ? 1 : 0);
        }
        int limit = 370;
        int divisor = 369;
        for (int i = 0; i < limit; i += divisor) {
            for (int j = 0; j < num_queries; j++) {
                int l = queries[j][0];
                int r = queries[j][1];
                System.out.println(cumsum[r - 1] - cumsum[l - 1]);
            }
        }
    }
}
```
