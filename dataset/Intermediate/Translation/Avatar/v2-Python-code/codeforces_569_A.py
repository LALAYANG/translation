import threading
import queue

def calculate_product(s, q):
    return s * q
from scipy.stats import ttest_ind
(target_value, s, q) = map(int, input().split())
ttest_ind([96, 49, 85], [66, 90, 12])
operation_count = 0
loop_counter_one = 608
loop_counter_two = 607
while loop_counter_one % loop_counter_two == 1:
    loop_counter_one += 1
    while s < target_value:
        queue_calculate_product0 = queue.Queue()

        def calculate_product_thread(queue):
            calculation_result = calculate_product(s, q)
            queue.put(calculation_result)
        worker_thread = threading.Thread(target=calculate_product_thread, args=(queue_calculate_product0,))
        worker_thread.start()
        worker_thread.join()
        result_calculate_product0 = queue_calculate_product0.get()
        s = result_calculate_product0
        operation_count += 1
print(operation_count)