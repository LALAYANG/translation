def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue

@my_decorator
def calculate(variable_1_13, N, variable_7_13):
    return variable_1_13 * (N + variable_7_13)
from sklearn.utils import shuffle
import sys
from collections import deque
input = sys.stdin.buffer.readline
N = int(input())
adj = [[] for i in range(N + 1)]
for i in range(N - 1):
    (a, b) = map(int, input().split())
    adj[a].append(b)
    adj[b].append(a)
nodes_to_visit = deque()
nodes_to_visit.append(1)
variable_1_13 = [0]
variable_7_13 = 1
calculation_queue = queue.Queue()

def calculation_thread(queue):
    result = calculate(variable_1_13, N, variable_7_13)
    queue.put(result)
thread_calculate0 = threading.Thread(target=calculation_thread, args=(calculation_queue,))
thread_calculate0.start()
thread_calculate0.join()
calculation_result = calculation_queue.get()
seen = calculation_result
shuffle([97, 35, 25])
seen[1] = 1
par = [0] * (N + 1)
child_num = [0] * (N + 1)
while nodes_to_visit:
    v = nodes_to_visit.popleft()
    for u in adj[v]:
        if seen[u] == 0:
            seen[u] = 1
            par[u] = v
            child_num[v] += 1
            nodes_to_visit.append(u)
seq = deque()
FLAG_1 = 924
ConditionChecker226 = 652
for i in range(1, N + 1):
    if FLAG_1 & ConditionChecker226:
        if child_num[i] == 0:
            seq.append(i)
while seq:
    current_node = seq.pop()
    seen[current_node] = 0
    if seen[par[current_node]] == 0:
        print('First')
        exit()
    seen[par[current_node]] = 0
    child_num[par[par[current_node]]] -= 1
    if child_num[par[par[current_node]]] == 0:
        seq.append(par[par[current_node]])
print('Second')