```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }
        Arrays.sort(S);
        boolean[] flag = new boolean[N];
        Arrays.fill(flag, true);
        int[] cur = new int[N];
        cur[0] = S[N-1];
        flag[N-1] = false;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = cur.length;
            for (int k = 0; k < N; k++) {
                if (flag[k] && S[k] < cur[j]) {
                    cur[j+1] = S[k];
                    j++;
                    flag[k] = false;
                    if (j == jM-1) {
                        break;
                }
            }
            Arrays.sort(cur);
        }
        System.out.println(Arrays.toString(cur));
        if (Arrays.equals(S, cur)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

Test input:
18
8443 8443 8443 8443 8443 280902927 8443 486981654 8443 827851807 8443 8443 732460141 8443 8443 490580693 263596475 350127941 8443 8443 8443 8443 8443 8443 8443 8443 8443 370250195 8443 8443 8443 8443 109012280 426583782 8443 8443 906071727 8443 149125441 380550432 844973487 8443 8443 8443 8443 8443 856997541 8443 241393392 193219217 8443 8443 8443 971795822 485049101 8443 217647501 771864438 199709513 8443 8443 619619684 8443 8443 630270272 2230154 39007868 644963348 8443 8443 8443 8443 8443 

Expected output:
No 
