```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        editorial(N, P);
    }

    public static void editorial(int N, int[] P) {
        if (N == 1) {
            System.out.println(0);
            return;
        }
        int[] a = new int[N + 1];
        for (int i = 0; i < N; i++) {
            a[P[i]] = i;
        }
        int tmp = 1;
        int max_len = 1;
        for (int i = 1; i < N; i++) {
            if (a[i] < a[i + 1]) {
                tmp++;
                max_len = Math.max(max_len, tmp);
            } else {
                tmp = 1;
            }
        }
        int ans = N - max_len;
        System.out.println(ans);
    }

    public static void WA(int N, int[] P) {
        int tmp = 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0 || P[i - 1] + 1 == P[i]) {
                tmp++;
            } else {
                ans = Math.max(ans, tmp);
                tmp = 1;
            }
        }
        System.out.println(N - ans);
    }
}
```

Test input:
199997
9887
134985
122353
131147
35411
86181
113017
131148
42822
98215
139659
75582
169953
80180
198625
663
167987
160673
17345
104292
86854
108255
47508
167988
102902
194002
142924
136979
60133
34751
60134
159382
192036
163379
119745
148768
104292
84898
110320
48123
110995
38091
75583
78247
179265
67575
145567
74233
34752
109597
157413
26110
20688
34753
98888
9933
22715
199315
115718
147538
109598
178611
152071
102236
174567
119746
119747
97545
141607
69568
61469
79502
55407
121678
118420
9620
```

Expected output:
199259
``` 
