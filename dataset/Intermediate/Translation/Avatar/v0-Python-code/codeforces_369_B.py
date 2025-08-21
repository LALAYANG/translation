def sum_lists(arg0, arg1):
    return arg0 + arg1
import threading
import queue

def calculate_combinations(n, k, sk, total_set_size, Func_get_nums_0):
    return sum_lists(Func_get_nums_0(k, sk), Func_get_nums_0(n - k, total_set_size - sk))
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
    return [t // num + 1 if index in range(t % num) else t // num for index in range(num)]
(n, k, unused_variable, r, total_set_size, sk) = map(int, input().split())
results_queue = queue.Queue()

def calculation_thread(queue):
    result = calculate_combinations(n, k, sk, total_set_size, Func_get_nums_0)
    queue.put(result)
worker_thread = threading.Thread(target=calculation_thread, args=(results_queue,))
worker_thread.start()
worker_thread.join()
combinations_result = results_queue.get()
ans = combinations_result
print(' '.join(map(str, ans)))