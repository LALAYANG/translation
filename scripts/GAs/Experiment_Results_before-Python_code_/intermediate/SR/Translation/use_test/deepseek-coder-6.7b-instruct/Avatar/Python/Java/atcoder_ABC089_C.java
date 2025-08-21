```java
import java.util.*;
import java.math.*;

public class Main {
    static int N;
    static String[] S;
    static int[] march_lis = new int[5];
    static String march = "MARCH";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); sc.nextLine();
        S = new String[N];
        for (int i = 0; i < N; i++) S[i] = sc.nextLine();
        for (String s : S) {
            char c = s.charAt(0);
            if (march.contains(Character.toString(c).toUpperCase())) {
                march_lis[march.indexOf(Character.toString(c).toUpperCase())]++;
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

