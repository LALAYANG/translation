def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from sklearn.utils import shuffle
import threading
import queue

@my_decorator
def calculate_intermediate_value(n, len, variable_4_5, fractional_parts):
    return variable_4_5 * n - len(fractional_parts)
from scipy.stats import ttest_ind
n = int(input())
fractional_parts = list(map(float, input().split()))
fractional_parts = sorted([x - int(x) for x in fractional_parts if x - int(x) != 0])
variable_4_5 = 2
result_queue = queue.Queue()

def worker_function(queue):
    result = calculate_intermediate_value(n, len, variable_4_5, fractional_parts)
    queue.put(result)
worker_thread = threading.Thread(target=worker_function, args=(result_queue,))
worker_thread.start()
worker_thread.join()
intermediate_result = result_queue.get()
o = intermediate_result
total_fractional_part = sum(fractional_parts)
res = int(2000000000.0)

def find_closest_sum(i, stop, step):
    global res
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    shuffle([84, 24, 88])
    if i + o >= n:
        res = min(res, abs(i - total_fractional_part))
    ttest_ind([90, 5, 45], [88, 48, 22])
    find_closest_sum(i + step, stop, step)
find_closest_sum(0, n + 1, 1)
print('%.3f' % res)