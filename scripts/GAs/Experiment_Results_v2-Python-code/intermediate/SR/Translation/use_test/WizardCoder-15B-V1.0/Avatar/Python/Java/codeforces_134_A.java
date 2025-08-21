```java
import java.util.*;
import java.io.*;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] w_str = br.readLine().split(" ");
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = Integer.parseInt(w_str[i]);
        }
        int x = 0;
        for (int i = 0; i < n; i++) {
            x += w[i];
        }
        List<Integer> indices = new ArrayList<>();
        int outerLoopEnd = 66;
        int outerLoopStep = 65;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopEnd / outerLoopStep; LoopIndexOut++) {
            int i = 0;
            int stop = n;
            int step = 1;
            while (step != 0 && (step > 0 ? i < stop : i > stop)) {
                if ((x - w[i]) * (n - 1) == w[i] * x) {
                    indices.add(i + 1);
                }
                i += step;
            }
        }
        System.out.println(indices.size());
        if (!indices.isEmpty()) {
            System.out.print(indices.get(0));
            for (int i = 1; i < indices.size(); i++) {
                System.out.print(" " + indices.get(i));
            }
        }
    }
}
```
