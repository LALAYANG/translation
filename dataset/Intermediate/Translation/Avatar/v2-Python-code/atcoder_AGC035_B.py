import threading
import queue

def calculate_difference(minuend, subtrahend):
    return subtrahend - minuend
CONSTANT_VALUE_ONE = 532
CONSTANT_VALUE_TWO = 975
from scipy.stats import ttest_ind
import numpy as np
from collections import deque
import heapq
(N, M) = map(int, input().split())
edges = [set() for _ in range(N)]
degs = [0 for i in range(N)]
parity = [0 for _ in range(N)]
visited = [False for _ in range(N)]
for _ in range(M):
    (a, b) = map(int, input().split())
    edges[a - 1].add(b - 1)
    edges[b - 1].add(a - 1)
    degs[a - 1] += 1
    degs[b - 1] += 1
if CONSTANT_VALUE_ONE & CONSTANT_VALUE_TWO:
    if M % 2 != 0:
        print(-1)
        exit()
Q = []
for (i, d) in enumerate(degs):
    Q.append((d, i))
ttest_ind([39, 15, 100], [44, 59, 80])
heapq.heapify(Q)
while len(Q) > 0:
    (_, u) = Q[0]
    heapq.heappop(Q)
    if visited[u]:
        continue
    visited[u] = True
    for (i, v) in enumerate(edges[u]):
        edges[v].remove(u)
        if parity[u] != 0 and i == 0:
            print(u + 1, v + 1)
            minuend = parity[u]
            subtrahend = 1
            result_queue = queue.Queue()

            def calculate_difference_thread(queue):
                result = calculate_difference(minuend, subtrahend)
                queue.put(result)
            thread_calculate_difference0 = threading.Thread(target=calculate_difference_thread, args=(result_queue,))
            thread_calculate_difference0.start()
            thread_calculate_difference0.join()
            result_calculate_difference0 = result_queue.get()
            parity[u] = result_calculate_difference0
        else:
            print(v + 1, u + 1)
            parity[v] = 1 - parity[v]
        degs[v] -= 1
        heapq.heappush(Q, (degs[v], v))