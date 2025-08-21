
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
534
243 524
152 315
153 156
317 390
110 173
23 45
184 325
21 76
256 412
432 465
31 80
129 531
62 77
22 146
65 414
135 163
167 494
157 353
229 300
134 141
342 517
383 466
261 516
39 144
195 307
167 201
432 513
128 461
364 481
179 448
172 486
12 46
60 282
312 383
9 427
73 106
18 50
6 176
42 142
104 420
104 298
201 295
37 174
206 407
188 306
460 530
224 272
55 196
16 281
1 7
265 395
11 13
225 242
3 6
379 504
53 93
110 305
1 10
76 491
11 203
395 436
273 318
72 190
108 129
217 313
417 460
78 187
19 3
Expected output:
11
1
1
1
2
2
1
1
1
2
2
1
2
1
1
1
1
2
2
1
1
1
2
1
1
2
3
3
1
2
1
2
1
2
1
1
1
1
2
1
1
1
2
1
1
1
1
1
2
1
1
1
2
1
1
1
1
1
3
2
2
3
1
2
1
1
2
2
1
1
1
1
4
1
4
2
1
1
1
2
2
2
2
2
1
1
1
1
1
1
1
1
1
1
2
2
5
2
1
2
1
2
1
6
1
1
2
3
2
2
2
1
2
1
2
2
1
2
1
2
1
1
1
1
1
1
1
3
1
4
4
2
1
1
2
1
1
4
2
1
2
7
3
3
2
3
1
2
1
3
2
3
1
1
3
3
2
2
1
1
2
1
2
2
2
2
2
3
4
3
1
3
1
1
2
1
3
1
1
1
3
4
1
2
3
1
1
1
2
2
5
2
1
1
2
1
8
1
1
4
2
1
3
2
2
1
2
2
5
1
1
1
1
1
2
1
1
1
2
1
2
2
2
1
3
2
1
3
1
2
2
2
4
1
3
3
1
3
3
1
3
2
2
2
1
2
1
4
3
1
6

```
import threading
import queue
from collections import deque
import sys
input = sys.stdin.readline

def graphColoring(v, N, G, E):
    visited = [0] * N
    queue = deque()
    K = -1
    node2color = [-1 for _ in range(N)]
    queue.append(v)
    visited[v] = 1
    while queue:
        q = queue.popleft()
        color = 0
        colorAssigned = 711
        edgeProcessed = 551
        visitedFlag = 462
        reachableFlag = 777
        for nex in G[q]:
            if visitedFlag & reachableFlag:
                if colorAssigned & edgeProcessed:
                    if visited[nex]:
                        continue
            visited[nex] = 1
            color += 1
            if color == node2color[q]:
                color += 1
            node2color[nex] = color
            E[min(q, nex), max(q, nex)] = color
            queue.append(nex)
        K = max(K, color)
    return K

def main():
    N = int(input())
    G = [deque() for _ in range(N)]
    E = dict()
    for i in range(N - 1):
        (a, b) = map(lambda x: int(x) - 1, input().split())
        G[a].append(b)
        G[b].append(a)
        E[a, b] = 0
    queue_bfs0 = queue.Queue()

    def bfs_thread(queue):
        result = graphColoring(0, N, G, E)
        queue.put(result)
    thread_bfs0 = threading.Thread(target=bfs_thread, args=(queue_bfs0,))
    thread_bfs0.start()
    thread_bfs0.join()
    result_bfs0 = queue_bfs0.get()
    K = result_bfs0
    print(K)
    for value in E.values():
        print(value)
main()
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
534
243 524
152 315
153 156
317 390
110 173
23 45
184 325
21 76
256 412
432 465
31 80
129 531
62 77
22 146
65 414
135 163
167 494
157 353
229 300
134 141
342 517
383 466
261 516
39 144
195 307
167 201
432 513
128 461
364 481
179 448
172 486
12 46
60 282
312 383
9 427
73 106
18 50
6 176
42 142
104 420
104 298
201 295
37 174
206 407
188 306
460 530
224 272
55 196
16 281
1 7
265 395
11 13
225 242
3 6
379 504
53 93
110 305
1 10
76 491
11 203
395 436
273 318
72 190
108 129
217 313
417 460
78 187
19 3
Expected output:
11
1
1
1
2
2
1
1
1
2
2
1
2
1
1
1
1
2
2
1
1
1
2
1
1
2
3
3
1
2
1
2
1
2
1
1
1
1
2
1
1
1
2
1
1
1
1
1
2
1
1
1
2
1
1
1
1
1
3
2
2
3
1
2
1
1
2
2
1
1
1
1
4
1
4
2
1
1
1
2
2
2
2
2
1
1
1
1
1
1
1
1
1
1
2
2
5
2
1
2
1
2
1
6
1
1
2
3
2
2
2
1
2
1
2
2
1
2
1
2
1
1
1
1
1
1
1
3
1
4
4
2
1
1
2
1
1
4
2
1
2
7
3
3
2
3
1
2
1
3
2
3
1
1
3
3
2
2
1
1

