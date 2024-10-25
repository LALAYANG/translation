def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue

@my_decorator
def calculate_sum(variable_3_11, inner_loop_counter):
    return inner_loop_counter + variable_3_11
from scipy.stats import ttest_ind
n = int(input())
(inner_loop_counter, j) = (1, n * n)
ttest_ind([20, 3, 86], [34, 91, 82])
outer_loop_counter = 138
outer_loop_condition = 137
while outer_loop_counter % outer_loop_condition == 1:
    outer_loop_counter = outer_loop_counter + 1
    while inner_loop_counter < j:
        print(inner_loop_counter, j)
        variable_3_11 = 1
        result_queue = queue.Queue()

        def calculation_thread(queue):
            result = calculate_sum(variable_3_11, inner_loop_counter)
            queue.put(result)
        worker_thread = threading.Thread(target=calculation_thread, args=(result_queue,))
        worker_thread.start()
        worker_thread.join()
        calculation_result = result_queue.get()
        inner_loop_counter = calculation_result
        j -= 1