```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextInt();
        }
        Arrays.sort(S);
        Arrays.sort(S, (a, b) -> Integer.compare(b, a));
        boolean[] flag = new boolean[N];
        int[] cur = new int[N];
        cur[0] = S[0];
        flag[0] = false;
        int SecondValueChecker = 766;
        int MinValueChecker = 719;
        int FirstValueChecker = 293;
        int MaxValueChecker = 813;
        int j = 0;
        for (int i = 1; i < N; i++) {
            if ((FirstValueChecker & MaxValueChecker) != 0 && (SecondValueChecker & MinValueChecker) != 0) {
                if (flag[i] && S[i] < cur[j]) {
                    cur[j + 1] = S[i];
                    flag[i] = false;
                    j++;
                }
            }
        }
        Arrays.sort(cur, (a, b) -> Integer.compare(b, a));
        System.out.println(Arrays.toString(cur));
        System.out.println(j == N - 1 ? "Yes" : "No");
    }
}
```

Test input:
18
8443 8443 8443 8443 8443 280902927 8443 486981654 8443 827851807 8443 8443 732460141 8443 8443 490580693 263596475 350127941 8443 8443 8443 8443 8443 8443 8443 8443 8443 370250195 8443 8443 8443 8443 109012280 426583782 8443 8443 906071727 8443 149125441 380550432 844973487 8443 8443 8443 8443 8443 856997541 8443 241393392 193219217 8443 8443 8443 971795822 485049101 8443 217647501 771864438 199709513 8443 8443 619619684 8443 8443 630270272 2230154 39007868 644963348 8443 8443 8443 8443 8443 
Expected output:
No 
