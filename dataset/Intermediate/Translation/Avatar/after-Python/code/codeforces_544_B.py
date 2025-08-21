import threading
import queue

def my_decorator(func):

    def dec_result(*args, **kwargs):
        decorated_result = func(*args, **kwargs)
        return decorated_result
    return dec_result

@my_decorator
def calculate_value(variable_3_12, x):
    return x + variable_3_12
from scipy.stats import ttest_ind
import numpy as np
(board_size, k) = map(int, input().split())
x = 0
ttest_ind([48, 76, 61], [61, 66, 86])
if k <= np.max(np.array([board_size ** 2 // 2, board_size ** 2 - board_size ** 2 // 2])):
    print('YES')
    for row in range(board_size):

        def iterate_checkerboard(column, stop, step):
            global updated_x, calculation_result, result_queue, thread_calculate_value0, x, variable_3_12
            if step == 0 or (step > 0 and column >= stop) or (step < 0 and column <= stop):
                return
            if row % 2 == column % 2 and x < k:
                print('L', end='')
                variable_3_12 = 1
                result_queue = queue.Queue()

                def calculation_thread(queue):
                    calculation_result = calculate_value(variable_3_12, x)
                    queue.put(calculation_result)
                thread_calculate_value0 = threading.Thread(target=calculation_thread, args=(result_queue,))
                thread_calculate_value0.start()
                thread_calculate_value0.join()
                updated_x = result_queue.get()
                x = updated_x
            else:
                print('S', end='')
            iterate_checkerboard(column + step, stop, step)
        iterate_checkerboard(0, board_size, 1)
        print()
else:
    print('NO')