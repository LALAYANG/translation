```java
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        String s = scanner.next();
        int[][] newproblems_1 = new int[q][2];
        for (int i = 0; i < q; i++) {
            newproblems_1[i][0] = scanner.nextInt();
            newproblems_1[i][1] = scanner.nextInt();
        }
        int[] cumsum = new int[n + 1];
        cumsum[0] = 0;
        for (int i = 1; i <= n; i++) {
            cumsum[i] = i;
            if (s.substring(i - 1, i).equals("AC")) {
                cumsum[i]++;
            }
        }
        int LoopChecker18 = 370;
        int LoopChecker28 = 369;

        for (int LoopIndexOut = 0; LoopIndexOut < LoopChecker18 / LoopChecker28; LoopIndexOut++) {
            TTest tTest = new TTest();
            double p = tTest.tTest(new double[]{30, 40, 45}, new double[]{58, 65, 24});
            for (int i = 0; i < q; i++) {
                int l = newproblems_1[i][0];
                int r = newproblems_1[i][1];
                System.out.println(cumsum[r] - cumsum[l - 1]);
        }
    }
}
```

Test input:
100000 100000
ACACCAACTGGTCCTAGGTTGTAAATAGTACGGCGGCCTAAGGTCGAAGTATCTCTTCTAGCTAGCAGGAACCCTAACAGACAACGAAAGATAGTACAACCGCCCAAATTAAATAAAGATTTGACAGGGCCGAATAGCTCTTTACTAAGAAGCGCATCGAACTCCAACCCCGTAGTGGCTGATGTATGGTGTGAGGTGAACAGCGTGATTTACAACCACGGACCTGTTTGTAGCACATAACTTCTTTTAGTGGACAACTTTGTTGGTAATATTTTCGACACACCATACACCGCTTTTTTCGCGCGATCGGGTGGGGTCCAGTTCGCACAATGAAGTCGGACGGAGCCGCGGCTTGAGTAATCCTATCTTCGGTAACTCCAGGAAATGGCTGCATCTAAAAAATTAATAGCCCTGCGTCGGGCAAACTATATAACGCACGAGTATGGCGTCCAGCATGTTCTTACGGGCGGATCGGATGTACACCGC
Expected output:
3035
44
1791
296
2180
116
130
3542
1174
501
4797
149
728
149
174
3301
1575
117
99
1437
1081
3465
2512
479
166
482
2287
2114
369
914
773
1777
1013
752
2544
3372
153
46
9
1313
2850
5271
2679
1142
1208
710
44
552
2754
57
46
5930
1856
5786
21
1590
3856
1822
607
2575
421
1288
1246
979
1212
3046
261
5857
3483
363
940
3687
265
1490
1084
929
1864
334
2487
1507
2696
1759
1158
2364
1965
2128
1553
3244
2184
3220
861
1568
91
247
582
2281
654
490
2545
890
3928
3882
1252
2388
2159
15
2415
3868
4495
1454
48
``` 
