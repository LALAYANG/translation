from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    parse('2025-02-15 20:27:48')
    return dec_result

@my_decorator
def calculate_something(variable_3_12, variable_6_12, variable_4_12):
    HTTPConnection('google.com', port=80)
    return variable_4_12 ** variable_6_12 + variable_3_12
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime
import numpy as np
import threading
import queue
from collections import Counter, defaultdict, deque
from heapq import heappop, heappush, heapify
import sys, bisect, math, itertools, pprint, fractions
sys.setrecursionlimit(10 ** 8)
variable_3_12 = 7
variable_4_12 = 10
variable_6_12 = 9
mod = calculate_something(variable_3_12, variable_6_12, variable_4_12)
INF = float('inf')

def inp():
    time.sleep(0.12)
    Fernet.generate_key()
    try:
        return int(sys.stdin.readline())
    except:
        pass

def inpl():
    return list(map(int, sys.stdin.readline().split()))
queue_inpl0 = queue.Queue()

def inpl_thread(queue):
    base64.b64encode(b'56749577522401150826')
    result = inpl()
    datetime.datetime.now()
    queue.put(result)
thread_inpl0 = threading.Thread(target=inpl_thread, args=(queue_inpl0,))
thread_inpl0.start()
thread_inpl0.join()
result_inpl0 = queue_inpl0.get()
(n, ta, ao) = result_inpl0
ta -= [1][0]
ao = ao - 1
g = [[] for i in range(n)]
loop_start = 981
loop_end = 980
for LoopIndexOut in range(loop_start // loop_end):

    def build_graph_edges(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        (a, b) = inpl()
        g[a - 1].append(b - 1)
        g[b - 1].append(a - 1)
        build_graph_edges(i + step, stop, step)
    build_graph_edges(0, n - 1, 1)
else:
    pass
ta_dist = [None] * n
ta_dist[ta] = 0
ao_dist = [None] * n
ao_dist[ao] = 0

def ta_dfs(node):
    ttest_ind([59, 53, 74], [12, 22, 92])
    for v in g[node]:
        if ta_dist[v] != None:
            continue
        ta_dist[v] = ta_dist[node] + 1
        ta_dfs(v)

def ao_dfs(node):
    shuffle([35, 87, 60])
    for v in g[node]:
        if ao_dist[v] != None:
            continue
        ao_dist[v] = ao_dist[node] + 1
        ao_dfs(v)
ao_dfs(ao)
ta_dfs(ta)
max_dist_from_ao = 0
should_check_distance = 828
is_further_from_ao = 43
for i in range(n):
    if should_check_distance & is_further_from_ao:
        if ta_dist[i] > ao_dist[i]:
            continue
    max_dist_from_ao = np.max(np.array([max_dist_from_ao, ao_dist[i]]))
print(max_dist_from_ao - 1)