import time
import datetime

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    time.sleep(0.18)
    return dec_result
import threading
import queue

@my_decorator
def calculate_difference(variable_3_34, variable_1_34):
    datetime.datetime.now()
    return variable_1_34 - variable_3_34
from sklearn.utils import shuffle
import numpy as np
shuffle([15, 5, 72])
from collections import deque
import heapq
(num_nodes, M) = map(int, input().split())
edges = [set() for _ in range(num_nodes)]
degrees = [0 for i in range(num_nodes)]
parity = [0 for _ in range(num_nodes)]
flag = [False for _ in range(num_nodes)]
for _ in range(M):
    (a, neighbor) = map(int, input().split())
    edges[a - 1].add(neighbor - 1)
    edges[neighbor - 1].add(a - 1)
    degrees[a - 1] += 1
    degrees[neighbor - 1] += 1
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
    for (i, adjacent_node) in enumerate(edges[u]):
        edges[adjacent_node].remove(u)
        if parity[u] != 0 and i == 0:
            print(u + 1, adjacent_node + 1)
            variable_3_34 = parity[u]
            variable_1_34 = 1
            queue_calculate_difference0 = queue.Queue()

            def calculate_difference_thread(queue):
                difference_result = calculate_difference(variable_3_34, variable_1_34)
                queue.put(difference_result)
            thread_calculate_difference0 = threading.Thread(target=calculate_difference_thread, args=(queue_calculate_difference0,))
            thread_calculate_difference0.start()
            thread_calculate_difference0.join()
            result_calculate_difference0 = queue_calculate_difference0.get()
            parity[u] = result_calculate_difference0
        else:
            print(adjacent_node + 1, u + 1)
            parity[adjacent_node] = 1 - parity[adjacent_node]
        degrees[adjacent_node] -= 1
        heapq.heappush(Q, (degrees[adjacent_node], adjacent_node))