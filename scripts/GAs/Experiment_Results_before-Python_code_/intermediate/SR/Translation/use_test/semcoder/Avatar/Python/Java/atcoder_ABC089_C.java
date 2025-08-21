Thought process:
1. Read the input strings and count the occurrences of each character in the "march" list.
2. Calculate the number of ways to choose 3 characters from the "march" list.
3. Multiply the counts of the chosen characters to get the final answer.

```java
import java.util.*;
import java.io.*;

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
            char c = s.charAt(0);
            if (c == 'M' || c == 'A' || c == 'R' || c == 'C' || c == 'H') {
                march_lis[c - 'A']++;
            }
        }
        long ans = 0;
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

This solution efficiently calculates the number of ways to choose 3 characters from the "march" list and multiplies their counts to get the final answer.
