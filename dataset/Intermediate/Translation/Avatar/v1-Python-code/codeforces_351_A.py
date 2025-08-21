import threading
import queue

def calculate(n, len, multiplier, fractional_parts):
    return multiplier * n - len(fractional_parts)
from scipy.stats import ttest_ind
n = int(input())
fractional_parts = list(map(float, input().split()))
fractional_parts = sorted([element - int(element) for element in fractional_parts if element - int(element) != 0])
multiplier = 2
queue_calculate0 = queue.Queue()

def calculate_thread(queue):
    result = calculate(n, len, multiplier, fractional_parts)
    queue.put(result)
calculation_thread = threading.Thread(target=calculate_thread, args=(queue_calculate0,))
calculation_thread.start()
calculation_thread.join()
result_calculation = queue_calculate0.get()
o = result_calculation
arr_sum = sum(fractional_parts)
res = int(2000000000.0)

def recursive_loop(i, stop, step):
    global res
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    ttest_ind([58, 40, 98], [2, 11, 2])
    if i + o >= n:
        res = min(res, abs(i - arr_sum))
    recursive_loop(i + step, stop, step)
recursive_loop(0, n + 1, 1)
print('%.3f' % res)