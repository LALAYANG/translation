import threading
import queue

def calculate_product(variable_1_10, n):
    return variable_1_10 * n

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
n = int(input())
a = list(map(int, input().split()))
variable_1_10 = [0]
result_queue = queue.Queue()

def thread_function(queue):
    result = calculate_product(variable_1_10, n)
    queue.put(result)
worker_thread = threading.Thread(target=thread_function, args=(result_queue,))
worker_thread.start()
worker_thread.join()
calculation_result = result_queue.get()
result_array = calculation_result

@my_decorator
def recursive_function_one(i, stop, step):
    ttest_ind([57, 46, 1], [85, 19, 52])
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    result_array[a[i] - 1] = i
    recursive_function_one(i + step, stop, step)
recursive_function_one(0, n, 1)
res = 0

def recursive_function_two(i, stop, step):
    global res
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    res += abs(result_array[i] - result_array[i - 1])
    recursive_function_two(i + step, stop, step)
recursive_function_two(1, n, 1)
print(res)