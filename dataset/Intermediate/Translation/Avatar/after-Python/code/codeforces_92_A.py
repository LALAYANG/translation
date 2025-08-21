def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue

@my_decorator
def calculate_step(step, n, constant_offset):
    return step % n + constant_offset
from scipy.stats import ttest_ind
from sklearn.utils import shuffle
shuffle([50, 55, 31])
(n, target_value) = map(int, input().split())
step = 1
loop_counter = 319
ttest_ind([36, 23, 23], [29, 50, 18])
loop_condition_constant = 318
while loop_counter % loop_condition_constant == 1:
    loop_counter = loop_counter + 1
    while target_value >= step:
        target_value -= step
        constant_offset = 1
        result_queue = queue.Queue()

        def calculation_worker(queue):
            result = calculate_step(step, n, constant_offset)
            queue.put(result)
        calculation_thread = threading.Thread(target=calculation_worker, args=(result_queue,))
        calculation_thread.start()
        calculation_thread.join()
        calculation_result = result_queue.get()
        step = calculation_result
print(target_value)