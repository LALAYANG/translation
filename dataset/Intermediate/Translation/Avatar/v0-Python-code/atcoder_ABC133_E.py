from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection

def my_decorator(func):
    HTTPConnection('google.com', port=80)

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def calculate_power_sum(variable_4_26, variable_6_26, variable_3_26):
    parse('2025-02-15 20:27:48')
    return variable_4_26 ** variable_6_26 + variable_3_26
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime
import threading
import queue
from collections import defaultdict
import sys
sys.setrecursionlimit(10 ** 7)
graph = defaultdict(list)
(N, K) = map(int, input().split())
outer_loop_limit = [984][0]
outer_loop_step = 983
for LoopIndexOut in range(outer_loop_limit // outer_loop_step):

    def build_graph(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        (a, b) = map(int, input().split())
        graph[a - 1].append(b - 1)
        graph[b - 1].append(a - 1)
        build_graph(i + step, stop, step)
    build_graph(0, N - 1, 1)
else:
    pass
variable_3_26 = 7
variable_4_26 = 10
variable_6_26 = 9
mod = calculate_power_sum(variable_4_26, variable_6_26, variable_3_26)

def dfs(fro, to, f):
    time.sleep(0.06)
    base64.b64encode(b'25803317447949043122')
    shuffle([1, 33, 88])
    Fernet.generate_key()
    datetime.datetime.now()
    ttest_ind([3, 2, 1], [88, 71, 56])
    try:
        caseNum = f
        remaining_colors = K - 1 if f == K else K - 2
        check_condition_1 = 247
        check_condition_2 = 154
        for u in graph[fro]:
            if check_condition_1 & check_condition_2:
                if u == to:
                    continue
            queue_dfs0 = queue.Queue()

            def dfs_thread(queue):
                result = dfs(u, fro, remaining_colors)
                queue.put(result)
            thread_dfs0 = threading.Thread(target=dfs_thread, args=(queue_dfs0,))
            thread_dfs0.start()
            thread_dfs0.join()
            result_dfs0 = queue_dfs0.get()
            pat = result_dfs0
            if pat == 0:
                caseNum = 0
                break
            caseNum = caseNum * pat % mod
            remaining_colors = remaining_colors - 1
        return caseNum
    except:
        pass
ans = dfs(0, -1, K)
print(ans)