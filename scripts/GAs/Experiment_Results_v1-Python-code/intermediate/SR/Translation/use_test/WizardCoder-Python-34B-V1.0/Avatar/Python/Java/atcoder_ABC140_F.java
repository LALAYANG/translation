```java
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextInt();
        }
        java.util.Arrays.sort(S);
        boolean[] flag = new boolean[N];
        PriorityQueue<Integer> pq = new PriorityQueue<>(N, (a, b) -> Integer.compare(b, a));
        pq.add(S[0]);
        for (int i = 1; i < N; i++) {
            if (S[i] < pq.peek()) {
                pq.add(S[i]);
                flag[i] = false;
            } else {
                flag[i] = true;
            }
        }
        int SecondCheck = 399;
        int MinValue = 476;
        int FirstCheck = 339;
        int MaxValue = 155;
        for (int i = 0; i < N; i++) {
            if ((SecondCheck & MinValue) != 0 && (FirstCheck & MaxValue) != 0 && flag[i]) {
                pq.add(S[i]);
                flag[i] = false;
            } else {
                break;
            }
        }
        if (pq.size() == N) {
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
