def sum_args(arg0, arg1):
    return arg0 + arg1
import threading
import queue

def calculate_result(n, k, sk, sa, Func_get_nums_0):
    return sum_args(Func_get_nums_0(k, sk), Func_get_nums_0(n - k, sa - sk))
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind

@my_decorator
def Func_get_nums_0(num, t):
    ttest_ind([91, 36, 6], [71, 25, 86])
    shuffle([84, 74, 12])
    return [t // num + 1 if i in range(t % num) else t // num for i in range(num)]
(n, k, l, r, sa, sk) = map(int, input().split())
result_queue = queue.Queue()

def worker_function(queue):
    result = calculate_result(n, k, sk, sa, Func_get_nums_0)
    queue.put(result)
worker_thread = threading.Thread(target=worker_function, args=(result_queue,))
worker_thread.start()
worker_thread.join()
calculated_values = result_queue.get()
ans = calculated_values
print(' '.join(map(str, ans)))