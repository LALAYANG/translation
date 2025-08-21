
```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] w = new int[200001];
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            w[x + 100000]++;
        }
        long c = 0;
        for (int i = 0; i <= 200000; i++) {
            if (i == 100000) {
                c += (long) w[i] * (w[i] - 1) / 2;
            } else {
                c += (long) w[i] * w[200000 - i];
            }
        }
        System.out.println(c);
    }
}

```

