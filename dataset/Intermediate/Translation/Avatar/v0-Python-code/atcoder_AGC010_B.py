import numpy as np
import threading
import queue

def calculate_average(sum, n, variable_17_11, variable_8_11, a):
    return np.sum(np.array([a])) / (n * (n + variable_17_11) / variable_8_11)
condition_1 = 620
condition_2 = 462
check_condition_1 = 538
check_condition_2 = 673
(n, a) = (int(input()), list(map(int, input().split())))
variable_8_11 = 2
variable_17_11 = 1
if condition_1 & condition_2:
    if check_condition_1 & check_condition_2:
        if sum(a) % (n * (n + 1) / 2):
            print('NO')
        else:
            result_queue = queue.Queue()

            def calculate_average_thread(queue):
                result = calculate_average(sum, n, variable_17_11, variable_8_11, a)
                queue.put(result)
            thread_calculate_average0 = threading.Thread(target=calculate_average_thread, args=(result_queue,))
            thread_calculate_average0.start()
            thread_calculate_average0.join()
            result_calculate_average0 = result_queue.get()
            k = result_calculate_average0
            a += [a[0]]
            if sum([(k - i + j) % n for (i, j) in zip(a[1:], a)]) or sum([(k - i + j) / n >= 0 for (i, j) in zip(a[1:], a)]) != n:
                print('NO')
            else:
                print('YES')