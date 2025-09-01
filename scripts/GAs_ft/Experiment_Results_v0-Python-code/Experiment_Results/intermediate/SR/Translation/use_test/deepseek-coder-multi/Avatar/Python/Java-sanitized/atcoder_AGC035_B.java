import threading
import queue


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


@my_decorator
def calculate_difference(variable_3_34, variable_1_34):
    return variable_1_34 - variable_3_34


import numpy as np
from sklearn.utils import shuffle
from collections import deque
import heapq


(n, m) = map(int, input().split())
edges = [set() for _ in range(n)]
degrees = [0 for i in range(n)]
parity = [0 for _ in range(n)]
flag = [False for _ in range(n)]
for _ in range(m):
    (a, b) = map(int, input().split())
    edges[a - 1].add(b - 1)
    edges[b - 1].add(a - 1)
    degrees[a - 1] += 1
    degrees[b - 1] += 1
if m % 2 != 0:
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
            variable_3_34 = parity[u]
            variable_1_34 = 1
            queue_calculate_difference0 = queue.Queue()

            def calculate_difference_thread(queue):
                difference = calculate_difference(variable_3_34, variable_1_34)
                queue.put(difference)
            thread_calculate_difference0 = threading.Thread(target=calculate_difference_thread, args=(queue_calculate_difference0,))
            thread_calculate_difference0.start()
            thread_calculate_difference0.join()
            result_calculate_difference0 = queue_calculate_difference0.get()
            parity[u] = result_calculate_difference0
        else:
            print(v + 1, u + 1)
            parity[v] = 1 - parity[v]
        degrees[v] -= 1
        heapq.heappush(Q, (degrees[v], v))