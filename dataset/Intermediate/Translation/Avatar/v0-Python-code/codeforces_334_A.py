def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue

@my_decorator
def calculate_sum(variable_3_11, current_value):
    return current_value + variable_3_11
from scipy.stats import ttest_ind
n = int(input())
(current_value, j) = (1, n * n)
ttest_ind([20, 3, 86], [34, 91, 82])
loop_counter = 138
inner_loop_counter = 137
while loop_counter % inner_loop_counter == 1:
    loop_counter = loop_counter + 1
    while current_value < j:
        print(current_value, j)
        variable_3_11 = 1
        result_queue = queue.Queue()

        def sum_worker(queue):
            result = calculate_sum(variable_3_11, current_value)
            queue.put(result)
        worker_thread = threading.Thread(target=sum_worker, args=(result_queue,))
        worker_thread.start()
        worker_thread.join()
        sum_result = result_queue.get()
        current_value = sum_result
        j -= 1