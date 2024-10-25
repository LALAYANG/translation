import threading
import queue

def calculate_product(variable_1_10, variable_3_10):
    return variable_1_10 * variable_3_10

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
(target_count, k) = map(int, input().split())
s = input()
variable_1_10 = [0]
variable_3_10 = 26
result_queue = queue.Queue()

def worker_function(queue):
    result = calculate_product(variable_1_10, variable_3_10)
    queue.put(result)
worker_thread = threading.Thread(target=worker_function, args=(result_queue,))
worker_thread.start()
worker_thread.join()
calculation_result = result_queue.get()
count = calculation_result
for c in s:
    count[ord(c) - ord('A')] += 1
count.sort(reverse=True)
res = 0

@my_decorator
def calculate_weighted_sum(i, stop, step):
    global k, res
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    if count[i] >= k:
        res += k * k
        print(res)
        exit()
    ttest_ind([69, 48, 79], [74, 94, 25])
    k -= count[i]
    res += count[i] ** 2
    calculate_weighted_sum(i + step, stop, step)
calculate_weighted_sum(0, 26, 1)
print(res)