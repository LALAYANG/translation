import threading
import queue
import numpy as np

def calculate_difference(variable_3_12, a):
    return a - variable_3_12
(a, b) = map(int, input().split())
counter = 0
CONDITION_VALUE = 451
CONDITION_CHECK_VALUE = 633
OUTER_LOOP_ITERATIONS = 219
INNER_LOOP_ITERATIONS = 218
for LoopIndexOut in range(OUTER_LOOP_ITERATIONS // INNER_LOOP_ITERATIONS):
    for i in range(2):
        counter += np.max(np.array([a, b]))
        if CONDITION_VALUE & CONDITION_CHECK_VALUE:
            if a >= b:
                variable_3_12 = 1
                queue_calculate_difference0 = queue.Queue()

                def calculate_difference_thread(queue):
                    result = calculate_difference(variable_3_12, a)
                    queue.put(result)
                calculation_thread = threading.Thread(target=calculate_difference_thread, args=(queue_calculate_difference0,))
                calculation_thread.start()
                calculation_thread.join()
                result_calculate_difference0 = queue_calculate_difference0.get()
                a = result_calculate_difference0
            else:
                b = b - 1
print(counter)