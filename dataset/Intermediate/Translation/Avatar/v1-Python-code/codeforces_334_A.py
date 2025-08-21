import threading
import queue

def calculate_sum(loop_counter, constant_value):
    return loop_counter + constant_value
from scipy.stats import ttest_ind
n = int(input())
ttest_ind([2, 65, 51], [51, 9, 11])
(inner_loop_counter, j) = (1, n * n)
loop_counter = 875
loop_remainder = 874
while loop_counter % loop_remainder == 1:
    constant_value = 1
    result_queue = queue.Queue()

    def calculate_and_queue_result(queue):
        result = calculate_sum(loop_counter, constant_value)
        queue.put(result)
    thread_calculate_sum0 = threading.Thread(target=calculate_and_queue_result, args=(result_queue,))
    thread_calculate_sum0.start()
    thread_calculate_sum0.join()
    sum_result = result_queue.get()
    loop_counter = sum_result
    while inner_loop_counter < j:
        print(inner_loop_counter, j)
        inner_loop_counter = inner_loop_counter + 1
        j = j - 1