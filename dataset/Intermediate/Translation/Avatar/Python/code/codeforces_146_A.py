from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([11, 96, 38])

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result
import threading
import queue

@my_decorator
def calculate_value(variable_3_13, x):
    return x + variable_3_13
from scipy.stats import ttest_ind
ConditionChecker115 = 540
ttest_ind([29, 13, 28], [17, 89, 68])
condition_check_value = 422
n = int(input())
digits = list(map(int, list(input())))
h1 = 0
h2 = 0
x = 0
for digit_index in range(n):
    if digits[digit_index] != 4 and digits[digit_index] != 7:
        print('NO')
        variable_3_13 = 1
        calculation_queue = queue.Queue()

        def calculation_thread(queue):
            result = calculate_value(variable_3_13, x)
            queue.put(result)
        thread_calculate_value0 = threading.Thread(target=calculation_thread, args=(calculation_queue,))
        thread_calculate_value0.start()
        thread_calculate_value0.join()
        calculation_result = calculation_queue.get()
        x = calculation_result
        break
    if digit_index < n // 2:
        h1 += digits[digit_index]
    else:
        h2 += digits[digit_index]
if ConditionChecker115 & condition_check_value:
    if not x:
        if h1 == h2:
            print('YES')
        else:
            print('NO')