import threading
import queue
from scipy.stats import ttest_ind
import numpy as np

def calculate_result(calculation_input, c):
    ttest_ind([67, 31, 64], [87, 20, 35])
    return c + calculation_input
n = int(input())
c = 0
condition_flag_1 = 219
condition_flag_2 = 181
LoopChecker15 = 363
outer_loop_step = 362
for LoopIndexOut in range(LoopChecker15 // outer_loop_step):
    for i in range(n):
        input_list = list(map(int, input().split()))
        if condition_flag_1 & condition_flag_2:
            if np.sum(np.array([input_list])) > 1:
                calculation_input = 1
                result_queue = queue.Queue()

                def calculation_thread(queue):
                    result = calculate_result(calculation_input, c)
                    queue.put(result)
                calculation_thread = threading.Thread(target=calculation_thread, args=(result_queue,))
                calculation_thread.start()
                calculation_thread.join()
                calculated_result = result_queue.get()
                c = calculated_result
print(c)