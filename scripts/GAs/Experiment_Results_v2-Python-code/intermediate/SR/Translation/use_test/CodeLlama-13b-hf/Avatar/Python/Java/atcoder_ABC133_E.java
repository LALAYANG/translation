
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000 99999
21538 87889
48184 63675
68154 21538
21538 91176
895 38017
21538 37086
21538 3119
67852 62561
83036 44001
21538 47645
64108 21538
21538 40815
68509 35816
14295 21538
70097 21538
21538 59508
76958 21538
17371 21538
97789 42505
91903 39232
57059 21538
25557 1884
21538 42795
99082 51966
83175 38249
15994 95706
80272 3731
5557 96297
63735 21538
14596 93811
21335 44003
82187 10372
21538 20487
21538 80628
4705 78631
13170 90907
45451 3694
27125 44125
91450 28956
21538 66116
35498 21538
343
Expected output:
266207190


```
from collections import defaultdict
import sys
sys.setrecursionlimit(10 ** 7)
graph = defaultdict(list)
(N, K) = map(int, input().split())
for i in range(N - 1):
    (neighbor_node, b) = map(int, input().split())
    graph[neighbor_node - 1].append(b - 1)
    graph[b - 1].append(neighbor_node - 1)
mod = 10 ** 9 + 7

def depth_first_search(fro, to, f):
    caseNum = f
    colorNum = K - 1 if f == K else K - 2
    neighbor_check_one = 59
    neighbor_check_five = 150
    neighbor_check_six = 519
    neighbor_check_four = 307
    neighbor_check_three = 62
    neighbor_check_two = 272
    for u in graph[fro]:
        if neighbor_check_three & neighbor_check_two:
            if neighbor_check_six & neighbor_check_four:
                if neighbor_check_one & neighbor_check_five:
                    if u == to:
                        continue
        pat = depth_first_search(u, fro, colorNum)
        if pat == 0:
            caseNum = 0
            break
        caseNum = caseNum * pat % mod
        colorNum = colorNum - 1
    return caseNum
ans = depth_first_search(0, -1, K)
print(ans)
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000 99999
21538 87889
48184 63675
68154 21538
21538 91176
895 38017
21538 37086
21538 3119
67852 62561
83036 44001
21538 47645
64108 21538
21538 40815
68509 35816
14295 21538
70097 21538
21538 59508
76958 21538
17371 21538
97789 42505
91903 39232
57059 21538
25557 1884
21538 42795
99082 51966
83175 38249
15994 95706
80272 3731
5557 96297
63735 21538
14596 93811
21335 44003
82187 10372
21538 20487
21538 80628
4705 78631
13170 90907
45451 3694
27125 44125
91450 28956
21538 66116
35498 21538
343
Expected output:
266207190


```
from collections import defaultdict
import sys
sys.setrecursionlimit(10 ** 7)
graph = defaultdict(list)
(N, K) = map(int, input().split())
for i in range(N - 1):
    (neighbor_node, b) = map(int, input().split())
    graph[neighbor_node - 1].append(b - 1)
    graph[b - 1].append(neighbor_node - 1)
mod = 10 ** 9 + 7

def depth_first_search(fro, to, f):
    caseNum = f
    colorNum = K - 1 if f == K else K - 2
    neighbor_check_one = 59
    neighbor_check_five = 150
    neighbor_check_six = 519
    neighbor_check_four = 307
    neighbor_check_three = 62
    neighbor_check_two = 272
    for u in graph[fro]:
        if neighbor_check_three & neighbor_check_two:
            if neighbor_check_six & neighbor_check_four:
                if neighbor_check_one & neighbor_check_five:
                    if u == to:
                        continue
        pat = depth_first_search(u, fro, colorNum)
        if pat == 0:
            caseNum = 0
            break
        caseNum = caseNum * pat % mod
        colorNum = colorNum - 1
    return caseNum
ans = depth_first_search(0, -1, K)
print(ans)
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000 99999
21538 87889
48184 63675
68154 21538
21538 91176
895 38017
21538 37086
21538 3119
67852 62561
83036 44001
21538 47645
64108 21538
21538 40815
68509 35816
14295 21538
70097 21538
21538 59508
76958 21538
17371 21538
97789 42505
91903 39232
57059 21538
25557 1884
21538 42795
99082 51966
83175 38249
15994 95706
80272 3731
5557 96297
63735 21538
14596 93811
21335 44003
82187 10372
21538 20487
21538 80628
4705 78631
13170 90907
45451 3694
27125 44125
91450 28956
21538 66116
35498 21538
343
Expected output:
266207190


```
from collections import defaultdict
import sys
sys.setrecursionlimit(10 ** 7)
graph = defaultdict(list)
(N, K) = map(int, input().split())
for i in range(N - 1):
    (neighbor_node, b) = map(int, input().split())
    graph[neighbor_node - 1].append(b - 1)
    graph[b - 1].append(neighbor_node - 1)
mod = 10 ** 9 + 7

def depth_first_search(fro, to, f):
    caseNum = f
    colorNum = K - 1 if f == K else K - 2
    neighbor_check_one = 59
    neighbor_check_five = 150
    neighbor_check_six = 519
    neighbor_check_four = 307
    neighbor_check_three = 62
    neighbor_check_two = 272
    for u in graph[fro]:
        if neighbor_check_three & neighbor_check_two:
            if neighbor_check_six & neighbor_check_four:
                if neighbor_check_one & neighbor_check_five:
                    if u == to:
                        continue
        pat = depth_first_search(u, fro, colorNum)
        if pat == 0:
            caseNum = 0
            break
        caseNum = caseNum * pat % mod
        colorNum = colorNum - 1
    return caseNum
ans = depth_first_search(0, -1, K)
print(ans)
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000 99999
21538 87889
48184 63675
68154 21538
21538 91176
895 38017
21538 37086
21538 3119
67852 62561
83036 44001
21538 47645
64108 2
