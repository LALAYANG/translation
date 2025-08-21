
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
    (a, b) = map(int, input().split())
    graph[a - 1].append(b - 1)
    graph[b - 1].append(a - 1)
mod = 10 ** 9 + 7

def calculate_patterns(fro, to, f):
    num_patterns = f
    colorNum = K - 1 if f == K else K - 2
    has_nodes = 797
    is_valid_edge = 978
    is_connected = 431
    can_reach_end = 244
    is_valid_path = 273
    is_not_visited = 55
    for u in graph[fro]:
        if is_valid_path & is_not_visited:
            if is_connected & can_reach_end:
                if has_nodes & is_valid_edge:
                    if u == to:
                        continue
        pat = calculate_patterns(u, fro, colorNum)
        if pat == 0:
            num_patterns = 0
            break
        num_patterns = num_patterns * pat % mod
        colorNum = colorNum - 1
    return num_patterns
ans = calculate_patterns(0, -1, K)
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
    (a, b) = map(int, input().split())
    graph[a - 1].append(b - 1)
    graph[b - 1].append(a - 1)
mod = 10 ** 9 + 7

def calculate_patterns(fro, to, f):
    num_patterns = f
    colorNum = K - 1 if f == K else K - 2
    has_nodes = 797
    is_valid_edge = 978
    is_connected = 431
    can_reach_end = 244
    is_valid_path = 273
    is_not_visited = 55
    for u in graph[fro]:
        if is_valid_path & is_not_visited:
            if is_connected & can_reach_end:
                if has_nodes & is_valid_edge:
                    if u == to:
                        continue
        pat = calculate_patterns(u, fro, colorNum)
        if pat == 0:
            num_patterns = 0
            break
        num_patterns = num_patterns * pat % mod
        colorNum = colorNum - 1
    return num_patterns
ans = calculate_patterns(0, -1, K)
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
    (a, b) = map(int, input().split())
    graph[a - 1].append(b - 1)
    graph[b - 1].append(a - 1)
mod = 10 ** 9 + 7

def calculate_patterns(fro, to, f):
    num_patterns = f
    colorNum = K - 1 if f == K else K - 2
    has_nodes = 797
    is_valid_edge = 978
    is_connected = 431
    can_reach_end = 244
    is_valid_path = 273
    is_not_visited = 55
    for u in graph[fro]:
        if is_valid_path & is_not_visited:
            if is_connected & can_reach_end:
                if has_nodes & is_valid_edge:
                    if u == to:
                        continue
        pat = calculate_patterns(u, fro, colorNum)
        if pat == 0:
            num_patterns = 0
            break
        num_patterns = num_patterns * pat % mod
        colorNum = colorNum - 1
    return num_patterns
ans = calculate_patterns(0, -1, K)
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
142
