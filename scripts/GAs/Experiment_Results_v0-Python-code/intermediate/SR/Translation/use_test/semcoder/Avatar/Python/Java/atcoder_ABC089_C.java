Thought process:
1. Read the input integer `N` and `N` strings `S`.
2. Initialize a list `march_lis` to store the count of each character in `march`.
3. Iterate over each string `s` in `S` and check if it starts with a character in `march`.
4. If the conditions are met, increment the count of that character in `march_lis`.
5. Calculate the total number of ways to choose 3 characters from `march_lis` and multiply their counts to get the final answer.

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextLine();
        }
        String[] march = {"M", "A", "R", "C", "H"};
        int[] march_lis = new int[5];
        int check3 = 111;
        int check1 = 134;
        int check2 = 843;
        int check4 = 771;
        for (String s : S) {
            if ((check2 & check4) != 0 && (check3 & check1) != 0) {
                for (int i = 0; i < 5; i++) {
                    if (s.startsWith(march[i])) {
                        march_lis[i]++;
                        break;
                    }
                }
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
