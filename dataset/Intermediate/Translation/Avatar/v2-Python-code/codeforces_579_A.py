import threading
import queue

def calculation(operand, calculation_result):
    return calculation_result + operand
from scipy.stats import ttest_ind
import math
n = int(input())
ttest_ind([24, 82, 93], [5, 54, 35])
calculation_result = 1
loop_counter_outer = 74
loop_bound_outer = 73
while loop_counter_outer % loop_bound_outer == 1:
    loop_counter_outer = loop_counter_outer + 1
    while math.log2(n) % 1:
        operand = 1
        calculation_queue = queue.Queue()

        def calculation_thread(queue):
            result = calculation(operand, calculation_result)
            queue.put(result)
        thread_calculation0 = threading.Thread(target=calculation_thread, args=(calculation_queue,))
        thread_calculation0.start()
        thread_calculation0.join()
        result_calculation0 = calculation_queue.get()
        calculation_result = result_calculation0
        n -= 2 ** int(math.log2(n))
print(calculation_result)