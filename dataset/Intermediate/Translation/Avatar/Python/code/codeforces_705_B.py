def my_decorator(func):

    def dec_result(*args, **kwargs):
        function_result = func(*args, **kwargs)
        return function_result
    return dec_result
from scipy.stats import ttest_ind
import threading
import queue

@my_decorator
def calculate_value(variable_1_10, c):
    ttest_ind([87, 28, 59], [80, 6, 26])
    return variable_1_10 - c
import sys
input = sys.stdin.readline
n = int(input())
input_numbers = list(map(int, input().split()))
c = 2
ConditionChecker112 = 134
ConditionChecker212 = 169
for i in input_numbers:
    if ConditionChecker112 & ConditionChecker212:
        if i == 1:
            print(c)
        elif i % 2 == 0:
            variable_1_10 = 3
            result_queue = queue.Queue()

            def threaded_calculation(queue):
                result = calculate_value(variable_1_10, c)
                queue.put(result)
            calculation_thread = threading.Thread(target=threaded_calculation, args=(result_queue,))
            calculation_thread.start()
            calculation_thread.join()
            calculation_result = result_queue.get()
            c = calculation_result
            print(c)
        else:
            print(c)