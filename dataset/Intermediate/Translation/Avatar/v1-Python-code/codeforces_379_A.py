import threading
import queue

def calculate_sum(current_value, increment):
    return current_value + increment
from scipy.stats import ttest_ind
import re
(whole_candles, b) = map(int, input().split())
s = 0
restoSciolte = 0
ttest_ind([45, 91, 69], [2, 1, 23])
current_value = 637
loop_bound = 636
while current_value % loop_bound == 1:
    increment = 1
    result_queue = queue.Queue()

    def calculation_thread(queue):
        sum_result = calculate_sum(current_value, increment)
        queue.put(sum_result)
    thread_calculate_sum0 = threading.Thread(target=calculation_thread, args=(result_queue,))
    thread_calculate_sum0.start()
    thread_calculate_sum0.join()
    calculated_value = result_queue.get()
    current_value = calculated_value
    while whole_candles > 0 or restoSciolte >= b:
        whole_candles += restoSciolte // b
        restoSciolte = restoSciolte % b
        s += whole_candles
        restoSciolte += whole_candles % b
        whole_candles //= b
print(s)