def subtract_numbers(arg0, arg1):
    return arg0 - arg1

def calculate_delta(arg1, arg2):
    return arg1 - arg2
import numpy as np
import threading
import queue

def calculate_value(a, b):
    return subtract_numbers(b, a)

def calculate_difference(a, b):
    return calculate_delta(a, b)
(n, m) = map(int, input().split())
sa = input().count('-')
sa = np.min(np.array([[calculate_difference(n, sa), sa]]))
ss = []
for _ in range(m):
    (a, b) = map(int, input().split())
    queue_calculate_value0 = queue.Queue()

    def calculate_value_thread(queue):
        result = calculate_value(a, b)
        queue.put(result)
    calculation_thread = threading.Thread(target=calculate_value_thread, args=(queue_calculate_value0,))
    calculation_thread.start()
    calculation_thread.join()
    calculation_result = queue_calculate_value0.get()
    b = calculation_result
    ss.append((b % 2 and b <= sa << 1) and '1\n' or '0\n')
print(''.join(ss))