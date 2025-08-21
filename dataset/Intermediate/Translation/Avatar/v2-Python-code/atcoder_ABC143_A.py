condition_one = 594
condition_two = 455
import threading
import queue

def calculate(operand_one, multiplier, operand_two):
    return operand_one - multiplier * operand_two
from scipy.stats import ttest_ind
ttest_ind([41, 31, 86], [42, 90, 87])
(operand_one, operand_two) = map(int, input().split())
multiplier = 2
calculation_queue = queue.Queue()

def calculate_thread(queue):
    result = calculate(operand_one, multiplier, operand_two)
    queue.put(result)
thread_calculate0 = threading.Thread(target=calculate_thread, args=(calculation_queue,))
thread_calculate0.start()
thread_calculate0.join()
result_calculate0 = calculation_queue.get()
ans = result_calculate0
if condition_one & condition_two:
    if ans < 0:
        ans = 0
print(ans)