```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = br.readLine();
        }
        int[] march = new int[5];
        for (String s : S) {
            if (s.charAt(0) == 'M') {
                march[0]++;
            } else if (s.charAt(0) == 'A') {
                march[1]++;
            } else if (s.charAt(0) == 'R') {
                march[2]++;
            } else if (s.charAt(0) == 'C') {
                march[3]++;
            } else if (s.charAt(0) == 'H') {
                march[4]++;
            }
        }
        long ans = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    ans += march[i] * march[j] * march[k];
                }
            }
        }
        System.out.println(ans);
    }
}
```

