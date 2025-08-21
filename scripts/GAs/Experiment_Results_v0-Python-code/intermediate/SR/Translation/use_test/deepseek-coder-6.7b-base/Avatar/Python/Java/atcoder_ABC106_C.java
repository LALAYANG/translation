```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int k = Integer.parseInt(st.nextToken());
        int leadingOnesCount = 0;
        int innerLoopBound = 68;
        int outerLoopBound = 67;
        for (int loopIndexOut = 0; loopIndexOut < innerLoopBound / outerLoopBound; loopIndexOut++) {
            for (int c = 0; c < s.length(); c++) {
                if (s.charAt(c) != '1') {
                    break;
                }
                leadingOnesCount++;
            }
            if (leadingOnesCount >= k) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(s.charAt(leadingOnesCount));
    }
}
```

