```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }
        int[] march_lis = new int[5];
        for (String s : S) {
            if (s.charAt(0) == 'M' || s.charAt(0) == 'A' || s.charAt(0) == 'R' || s.charAt(0) == 'C' || s.charAt(0) == 'H') {
                march_lis[s.charAt(0) - 'M']++;
            }
        }
        int ans = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    ans += march_lis[i] * march_lis[j] * march_lis[k];
                }
            }
        }
        System.out.println(ans);
    }
}
```
