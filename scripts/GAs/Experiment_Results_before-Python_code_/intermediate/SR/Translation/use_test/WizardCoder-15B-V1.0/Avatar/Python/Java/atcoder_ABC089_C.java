```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        int[] march = new int[5];
        for (int i = 0; i < n; i++) {
            if (s[i].charAt(0) == 'M' || s[i].charAt(0) == 'm') {
                march[0]++;
            } else if (s[i].charAt(0) == 'A' || s[i].charAt(0) == 'a') {
                march[1]++;
            } else if (s[i].charAt(0) == 'R' || s[i].charAt(0) == 'r') {
                march[2]++;
            } else if (s[i].charAt(0) == 'C' || s[i].charAt(0) == 'c') {
                march[3]++;
            } else if (s[i].charAt(0) == 'H' || s[i].charAt(0) == 'h') {
                march[4]++;
            }
        }
        int ans = 0;
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
