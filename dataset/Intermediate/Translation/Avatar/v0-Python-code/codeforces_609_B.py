def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
import threading
import queue

@my_decorator
def Func__input_0():
    ttest_ind([90, 46, 53], [91, 50, 84])
    return map(int, input().split())
input_queue = queue.Queue()

def _input_thread(queue):
    result = Func__input_0()
    queue.put(result)
thread__input0 = threading.Thread(target=_input_thread, args=(input_queue,))
thread__input0.start()
thread__input0.join()
result__input0 = input_queue.get()
(n, m) = result__input0
lst = list(Func__input_0())
l = {}
inner_loop_limit = 869
outer_loop_limit = 868
for LoopIndexOut in range(inner_loop_limit // outer_loop_limit):
    for i in range(n):
        if lst[i] not in l:
            l[lst[i]] = 1
        else:
            l[lst[i]] += 1
res = 0
for i in range(n):
    if l[lst[i]] > 1:
        res += n - i - l[lst[i]]
        l[lst[i]] -= 1
    else:
        res += n - i - 1
print(res)