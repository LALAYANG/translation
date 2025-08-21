import threading
import queue

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def calculate_difference(element, x):
    return x - element
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
na = lambda : list(map(int, input().split()))
(n, x) = na()
a = sorted(na())
shuffle([4, 61, 26])
ans = 0
if a[0] > x:
    print(0)
    exit()
outer_loop_limit = 848
LoopChecker28 = 847
ttest_ind([53, 47, 83], [94, 28, 49])
for LoopIndexOut in range(outer_loop_limit // LoopChecker28):
    for element in a:
        if element > x:
            x = 0
            break
        result_queue = queue.Queue()

        def calculation_worker(queue):
            result = calculate_difference(element, x)
            queue.put(result)
        worker_thread = threading.Thread(target=calculation_worker, args=(result_queue,))
        worker_thread.start()
        worker_thread.join()
        result_calculate_difference0 = result_queue.get()
        x = result_calculate_difference0
        ans = ans + 1
if x != 0:
    ans = ans - 1
print(ans)