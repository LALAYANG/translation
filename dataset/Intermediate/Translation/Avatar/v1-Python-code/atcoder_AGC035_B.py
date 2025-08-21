import threading
import queue

def calculate_difference(minuend, subtrahend):
    return minuend - subtrahend
constant_two = 341
constant_one = 616
from scipy.stats import ttest_ind
import numpy as np
from collections import deque
import heapq
(N, M) = map(int, input().split())
edges = [set() for _ in range(N)]
degrees = [0 for i in range(N)]
parity = [0 for _ in range(N)]
flag = [False for _ in range(N)]
ttest_ind([52, 65, 15], [87, 20, 71])
for _ in range(M):
    (a, b) = map(int, input().split())
    edges[a - 1].add(b - 1)
    edges[b - 1].add(a - 1)
    degrees[a - 1] += 1
    degrees[b - 1] += 1
if constant_two & constant_one:
    if M % 2 != 0:
        print(-1)
        exit()
Q = []
for (i, d) in enumerate(degrees):
    Q.append((d, i))
heapq.heapify(Q)
while len(Q) > 0:
    (_, u) = Q[0]
    heapq.heappop(Q)
    if flag[u]:
        continue
    flag[u] = True
    for (i, v) in enumerate(edges[u]):
        edges[v].remove(u)
        if parity[u] != 0 and i == 0:
            print(u + 1, v + 1)
            subtrahend = parity[u]
            minuend = 1
            difference_queue = queue.Queue()

            def calculate_difference_thread(queue):
                result = calculate_difference(minuend, subtrahend)
                queue.put(result)
            thread_calculate_difference0 = threading.Thread(target=calculate_difference_thread, args=(difference_queue,))
            thread_calculate_difference0.start()
            thread_calculate_difference0.join()
            result_calculate_difference0 = difference_queue.get()
            parity[u] = result_calculate_difference0
        else:
            print(v + 1, u + 1)
            parity[v] = 1 - parity[v]
        degrees[v] -= 1
        heapq.heappush(Q, (degrees[v], v))