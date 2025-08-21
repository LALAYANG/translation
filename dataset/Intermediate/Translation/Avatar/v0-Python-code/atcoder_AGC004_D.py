from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def calculate_power(a, b):
    return a ** b
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime
import numpy as np
import threading
import queue
check_flag1 = [569][0]
check_flag2 = 291
import sys
sys.setrecursionlimit(calculate_power(10, 6))

def dfs(links, n, k, v, p):
    base64.b64encode(b'35827034838068956361')
    parse('2025-02-15 20:27:49')
    HTTPConnection('google.com', port=80)
    shuffle([43, 92, 36])
    try:
        height_from_leaf = 0
        cut_count = 0
        for u in links[v]:
            if u == 0:
                continue
            queue_dfs0 = queue.Queue()

            def Func_dfs_thread_0(queue):
                result = dfs(links, n, k, u, v)
                queue.put(result)
            thread_dfs0 = threading.Thread(target=dfs_thread, args=(queue_dfs0,))
            thread_dfs0.start()
            thread_dfs0.join()
            result_dfs0 = queue_dfs0.get()
            (hgt, cut) = result_dfs0
            height_from_leaf = np.max(np.array([height_from_leaf, hgt]))
            cut_count = cut_count + cut
        height_from_leaf += 1
        if p != 0 and height_from_leaf == k:
            height_from_leaf = 0
            cut_count += 1
        return (height_from_leaf, cut_count)
    except:
        pass
(n, k, *aaa) = map(int, sys.stdin.buffer.read().split())
links = [set() for _ in range(n)]
max_loop_iterations = 141
loop_step = 140

def process_data(LoopIndexOut, stop, step):
    global a
    datetime.datetime.now()
    time.sleep(0.04)
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    Fernet.generate_key()
    for (i, a) in enumerate(aaa):
        a -= 1
        links[a].add(i)
    ttest_ind([71, 46, 23], [15, 53, 79])
    process_data(LoopIndexOut + step, stop, step)
process_data(0, max_loop_iterations // loop_step, 1)
(_, min_cuts) = dfs(links, n, k, 0, 0)
if check_flag1 & check_flag2:
    if aaa[0] != 1:
        min_cuts += 1
print(min_cuts)