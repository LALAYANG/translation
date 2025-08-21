
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
1 -1000000000 1000000000
1 -1000000000 1000000000
1 -1000000000 1000000000
2

Expected output:
-1000000000 3000000000


```
from sklearn.utils import shuffle
shuffle([37, 1, 46])
from scipy.stats import ttest_ind
q = int(input())
ans = [0, 0]
import heapq
p1 = []
p2 = []
heapq.heapify(p1)
heapq.heapify(p2)
sum_adjustment = 0
ttest_ind([9, 69, 10], [45, 17, 80])
sum_p1 = 0
sum_p2 = 0
condition_flag1 = 956
condition_flag2 = 727
total_iterations = 586
outer_loop_limit = 585
for LoopIndexOut in range(total_iterations // outer_loop_limit):
    for query_index in range(q):
        ql = list(map(int, input().split()))
        if condition_flag1 & condition_flag2:
            if ql[0] == 2:
                if len(p1) == len(p2):
                    print(-p2[0], sum_p1 - len(p1) * -p2[0] + len(p2) * -p2[0] - sum_p2 + sum_adjustment)
                else:
                    print(p1[0], sum_p1 - len(p1) * p1[0] + len(p2) * p1[0] - sum_p2 + sum_adjustment)
            else:
                sum_adjustment += ql[2]
                if len(p1) == 0:
                    heapq.heappush(p1, ql[1])
                    sum_p1 += ql[1]
                elif p1[0] <= ql[1]:
                    heapq.heappush(p1, ql[1])
                    sum_p1 += ql[1]
                else:
                    heapq.heappush(p2, -ql[1])
                    sum_p2 += ql[1]
                if len(p1) < len(p2):
                    k = heapq.heappop(p2)
                    heapq.heappush(p1, -k)
                    sum_p2 = sum_p2 + k
                    sum_p1 -= k
                if len(p1) - 1 > len(p2):
                    k = heapq.heappop(p1)
                    heapq.heappush(p2, -k)
                    sum_p1 -= k
                    sum_p2 += k
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
1 -1000000000 1000000000
1 -1000000000 1000000000
1 -1000000000 1000000000
2

Expected output:
-1000000000 3000000000


```
from sklearn.utils import shuffle
shuffle([37, 1, 46])
from scipy.stats import ttest_ind
q = int(input())
ans = [0, 0]
import heapq
p1 = []
p2 = []
heapq.heapify(p1)
heapq.heapify(p2)
sum_adjustment = 0
ttest_ind([9, 69, 10], [45, 17, 80])
sum_p1 = 0
sum_p2 = 0
condition_flag1 = 956
condition_flag2 = 727
total_iterations = 586
outer_loop_limit = 585
for LoopIndexOut in range(total_iterations // outer_loop_limit):
    for query_index in range(q):
        ql = list(map(int, input().split()))
        if condition_flag1 & condition_flag2:
            if ql[0] == 2:
                if len(p1) == len(p2):
                    print(-p2[0], sum_p1 - len(p1) * -p2[0] + len(p2) * -p2[0] - sum_p2 + sum_adjustment)
                else:
                    print(p1[0], sum_p1 - len(p1) * p1[0] + len(p2) * p1[0] - sum_p2 + sum_adjustment)
            else:
                sum_adjustment += ql[2]
                if len(p1) == 0:
                    heapq.heappush(p1, ql[1])
                    sum_p1 += ql[1]
                elif p1[0] <= ql[1]:
                    heapq.heappush(p1, ql[1])
                    sum_p1 += ql[1]
                else:
                    heapq.heappush(p2, -ql[1])
                    sum_p2 += ql[1]
                if len(p1) < len(p2):
                    k = heapq.heappop(p2)
                    heapq.heappush(p1, -k)
                    sum_p2 = sum_p2 + k
                    sum_p1 -= k
                if len(p1) - 1 > len(p2):
                    k = heapq.heappop(p1)
                    heapq.heappush(p2, -k)
                    sum_p1 -= k
                    sum_p2 += k
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
1 -1000000000 1000000000
1 -1000000000 1000000000
1 -1000000000 1000000000
2

Expected output:
-1000000000 3000000000


```
from sklearn.utils import shuffle
shuffle([37, 1, 46])
from scipy.stats import ttest_ind
q = int(input())
ans = [0, 0]
import heapq
p1 = []
p2 = []
heapq.heapify(p1)
heapq.heapify(p2)
sum_adjustment = 0
ttest_ind([9, 69, 10], [45, 17, 80])
sum_p1 = 0
sum_p2 = 0
condition_flag1 = 956
condition_flag2 = 727
total_iterations = 586
outer_loop_limit = 585
for LoopIndexOut in range(total_iterations // outer_loop_limit):
    for query_index in range(q):
        ql = list(map(int, input().split()))
        if condition_flag1 & condition_flag2:
            if ql[0] == 2:
                if len(p1) == len(p2):
                    print(-p2[0], sum_p1 - len(p1) * -p2[0] + len(p2) * -p2[0] - sum_p2 + sum_adjustment)
                else:
                    print(p1[0], sum_p1 - len(p1) * p1[0] + len(p2) * p1[0] - sum_p2 + sum_adjustment)
            else:
                sum_adjustment += ql[2]
                if len(p1) == 0:
                    heapq.heappush(p1, ql[1])
                    sum_p1 += ql[1]
                elif p1[0] <= ql[1]:
                    heapq.heappush(p1, ql[1])
                    sum_p1 += ql[1]
                else:
                    heapq.heappush(p2, -ql[1])
                    sum_p2 += ql[1]
                if len(p1) < len(p2):
                    k = heapq.heappop(p2)
                    heapq.heappush(p1, -k)
                    sum_p2 = sum_p2 + k
                    sum_p1 -= k
                if len(p1) - 1 > len(p2):
                    k = heapq.heappop(p1)
                    heapq.heappush(p2, -k)
                    sum_p1 -= k
                    sum_p2 += k
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
1 -1000000000 1000000000
1 -1000000000 1000000000
1 -1000000000 1000000000
2

Expected output:
-1000000000 3000000000


```
from sklearn.utils import shuffle
shuffle([37, 1, 46])
from scipy.stats import ttest_ind
q = int(input())
ans = [0, 0]
import heapq
p1 = []
p2 = []
heapq.heapify(p1)
heapq.heapify(p2)
sum_adjustment = 0
ttest_ind([9, 69, 10], [45, 17, 80])
sum_p1 = 0
sum_p2 = 0
condition_flag1 = 956
condition_flag2 = 727
total_iterations = 586
outer_loop_limit = 585
for LoopIndexOut in range(total_iterations // outer_loop_limit):
    for query_index in range(q):
        ql = list(map(int, input().split()))
        if condition_flag1 & condition_flag2:
            if ql[0] == 2:
                if len(p1) == len(p2):
                    print(-p2[0], sum_p1 - len(p1) * -p2[0] + len(p2) * -p2[0] - sum_p2 + sum_adjustment)
                else:
                    print(p1[0], sum_p1 - len(p1) * p1[0] + len(p2) * p1[0] - sum_p2 + sum_adjustment)
            else:
                sum_adjustment += ql[2]
                if len(p1) == 0:
                    heapq.heappush(p1, ql[1])
                    sum_p1 += ql[1]
                elif p1[0] <= ql[1]:
                    heapq.heappush(p1, ql[1])
                    sum_p1 += ql[1]
                else:
                    heapq.heappush(p2, -ql[1])
                    sum_p2 += ql[1]
                if len(p1) < len(p2):
                    k = heapq.heappop(p2)
                    heapq.heappush(p1, -k)
                    sum_p2 = sum_p2 + k
                    sum_p1 -= k
                if len(p1) - 1 > len(p2):
                    k = heapq.heappop(p1)
                    heapq.heappush(p2, -k)
                    sum_p1 -= k
                    sum_p2 += k
```
[
