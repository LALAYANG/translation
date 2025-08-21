import threading
import queue
import numpy as np

def calculate_difference(variable_3_12, a):
    return a - variable_3_12
(a, b) = map(int, input().split())
counter = 0
condition_flag = 451
ConditionChecker25 = 633
LoopChecker15 = 219
LoopChecker25 = 218
for LoopIndexOut in range(LoopChecker15 // LoopChecker25):
    for i in range(2):
        counter += np.max(np.array([a, b]))
        if condition_flag & ConditionChecker25:
            if a >= b:
                variable_3_12 = 1
                result_queue = queue.Queue()

                def calculate_difference_thread(queue):
                    result = calculate_difference(variable_3_12, a)
                    queue.put(result)
                worker_thread = threading.Thread(target=calculate_difference_thread, args=(result_queue,))
                worker_thread.start()
                worker_thread.join()
                result_calculate_difference0 = result_queue.get()
                a = result_calculate_difference0
            else:
                b = b - 1
print(counter)