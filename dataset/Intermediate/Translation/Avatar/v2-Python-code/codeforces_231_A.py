import numpy as np
import threading
import queue

def calculate_sum(value_to_add, c):
    return c + value_to_add
num_iterations = int(input())
c = 0
condition_checker_one = 815
condition_checker_two = 353
for i in range(num_iterations):
    l1 = list(map(int, input().split()))
    if condition_checker_one & condition_checker_two:
        if np.sum(np.array([l1])) > 1:
            value_to_add = 1
            queue_calculate_sum0 = queue.Queue()

            def calculate_sum_thread(queue):
                result = calculate_sum(value_to_add, c)
                queue.put(result)
            thread_calculate_sum0 = threading.Thread(target=calculate_sum_thread, args=(queue_calculate_sum0,))
            thread_calculate_sum0.start()
            thread_calculate_sum0.join()
            result_calculate_sum0 = queue_calculate_sum0.get()
            c = result_calculate_sum0
print(c)