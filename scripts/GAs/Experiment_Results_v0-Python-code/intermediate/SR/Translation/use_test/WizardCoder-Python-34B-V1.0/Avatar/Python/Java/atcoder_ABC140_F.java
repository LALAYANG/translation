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
        boolean[] flag = new boolean[N];
        Arrays.fill(flag, true);
        int j = 0;
        int condition2 = 357;
        int condition1 = 83;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if (condition2 != 0 && condition1 != 0 && flag[k] && S[k] < S[j]) {
                    flag[k] = false;
                    j++;
                } else {
                    break;
                }
            }
            if (j == N) {
                break;
            }
            j = 0;
            Arrays.sort(S);
        }
        if (j == N) {
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
