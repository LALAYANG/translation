import numpy as np
import threading
import queue

def calculate_average_difference(sum, n, variable_17_11, variable_8_11, input_values):
    return np.sum(np.array([input_values])) / (n * (n + variable_17_11) / variable_8_11)
ConditionChecker14 = 620
ConditionChecker24 = 462
condition_check_3 = 538
ConditionChecker22 = 673
(n, input_values) = (int(input()), list(map(int, input().split())))
variable_8_11 = 2
variable_17_11 = 1
if ConditionChecker14 & ConditionChecker24:
    if condition_check_3 & ConditionChecker22:
        if sum(input_values) % (n * (n + 1) / 2):
            print('NO')
        else:
            calculation_queue = queue.Queue()

            def calculate_and_enqueue_result(queue):
                result = calculate_average_difference(sum, n, variable_17_11, variable_8_11, input_values)
                queue.put(result)
            calculation_thread = threading.Thread(target=calculate_and_enqueue_result, args=(calculation_queue,))
            calculation_thread.start()
            calculation_thread.join()
            calculated_result = calculation_queue.get()
            k = calculated_result
            input_values += [input_values[0]]
            if sum([(k - expected_value + actual_value) % n for (expected_value, actual_value) in zip(input_values[1:], input_values)]) or sum([(k - expected_value + actual_value) / n >= 0 for (expected_value, actual_value) in zip(input_values[1:], input_values)]) != n:
                print('NO')
            else:
                print('YES')