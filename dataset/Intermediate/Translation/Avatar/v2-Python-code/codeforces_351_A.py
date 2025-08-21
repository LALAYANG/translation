import threading
import queue

def calculation_function(multiplier, len, fractional_part_array, n):
    return multiplier * n - len(fractional_part_array)
from scipy.stats import ttest_ind
n = int(input())
fractional_part_array = list(map(float, input().split()))
fractional_part_array = sorted([x - int(x) for x in fractional_part_array if x - int(x) != 0])
multiplier = 2
queue_calculation_function0 = queue.Queue()

def calculation_function_thread(queue):
    calculation_result = calculation_function(multiplier, len, fractional_part_array, n)
    queue.put(calculation_result)
calculation_thread = threading.Thread(target=calculation_function_thread, args=(queue_calculation_function0,))
calculation_thread.start()
calculation_thread.join()
result_calculation_function0 = queue_calculation_function0.get()
calculated_value = result_calculation_function0
arr_sum = sum(fractional_part_array)
res = int(2000000000.0)

def recursive_function(i, stop, step):
    global res
    ttest_ind([43, 77, 100], [35, 22, 93])
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    if i + calculated_value >= n:
        res = min(res, abs(i - arr_sum))
    recursive_function(i + step, stop, step)
recursive_function(0, n + 1, 1)
print('%.3f' % res)