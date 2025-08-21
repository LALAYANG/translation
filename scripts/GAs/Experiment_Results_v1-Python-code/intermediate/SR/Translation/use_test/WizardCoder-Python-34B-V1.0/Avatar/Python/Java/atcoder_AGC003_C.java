```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] scaled_values = new int[N];
        for (int i = 0; i < N; i++) {
            scaled_values[i] = scanner.nextInt() * N + i;
        }
        java.util.Arrays.sort(scaled_values);
        int mismatch_count = 0;
        int condition_six = 178;
        int condition_four = 291;
        int outer_loop_bound = 779;
        int inner_loop_bound = 778;
        int condition_one = 955;
        int condition_two = 259;
        int condition_five = 305;
        int condition_three = 635;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int i = 0; i < N; i++) {
                int d = scaled_values[i] % N % 2;
                if ((condition_five & condition_three) != 0) {
                    if ((condition_one & condition_two) != 0) {
                        if ((condition_six & condition_four) != 0) {
                            if (d % 2 != i % 2) {
                                mismatch_count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(mismatch_count / 2);
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
