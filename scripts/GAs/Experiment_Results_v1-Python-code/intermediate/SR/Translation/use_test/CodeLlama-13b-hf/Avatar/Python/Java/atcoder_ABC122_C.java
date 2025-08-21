
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

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
1666
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
448
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
2655
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
def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from itertools import accumulate
(n, q) = map(int, input().split())
s = input()
problems = [list(map(int, input().split())) for _ in range(q)]

@my_decorator
def count(total, i):
    return total + 1 if s[i - 1:i + 1] == 'AC' else total
cumsum = list(accumulate([0] + list(range(1, n)), count))
outer_loop_bound = 489
inner_loop_bound = 488

def process_queries(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for (l, query_right_bound) in problems:
        print(cumsum[query_right_bound - 1] - cumsum[l - 1])
    process_queries(LoopIndexOut + step, stop, step)
process_queries(0, outer_loop_bound // inner_loop_bound, 1)
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

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
1666
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
448
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
2655
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
def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from itertools import accumulate
(n, q) = map(int, input().split())
s = input()
problems = [list(map(int, input().split())) for _ in range(q)]

@my_decorator
def count(total, i):
    return total + 1 if s[i - 1:i + 1] == 'AC' else total
cumsum = list(accumulate([0] + list(range(1, n)), count))
outer_loop_bound = 489
inner_loop_bound = 488

def process_queries(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for (l, query_right_bound) in problems:
        print(cumsum[query_right_bound - 1] - cumsum[l - 1])
    process_queries(LoopIndexOut + step, stop, step)
process_queries(0, outer_loop_bound // inner_loop_bound, 1)
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

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
1666
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
448
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
