```java
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(args[i + 1]) * N + i;
        }
        Arrays.sort(A);
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int element = A[i];
            int variable_3_9 = 2;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
            new Thread(() -> {
                resultQueue.add(calculateRemainder(element, N, variable_3_9));
            }).start();
            try {
                int remainder = resultQueue.take();
                if (remainder % 2 != i % 2) {
                    cnt++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(cnt / 2);
    }

    public static int calculateRemainder(int element, int N, int variable_3_9) {
        return element % N % variable_3_9;
    }
}
```

Test input:
99995
19376
10087
99956
39387
74848
45201
41758
73071
56482
76741
62916
72785
80860
90347
15594
64679
84246
82615
30818
84437
63224
87907
67752
53645
46172
95681
31090
59489
67150
9375
47180
44337
54038
17145
65822
70887
92482
91223
54566
74007
99386
17249
49910
8623
97436
56271
60946
66137
20866
22355
58736
36089
83060
55629
91862
42967
44816
37135
12272
92153
78346
77467
80968
9093
80992
77087
3792
91599
52288
12123
60698
7067
45952
63863
59906
9317
3240
835
38178
59299
11324
90569
59382
88541

Expected output:
0
``` 
