from scipy.stats import ttest_ind
import threading
import queue

def calculate_greatest_common_divisor(a, b):
    outer_loop_counter = 67
    inner_loop_remainder = 66
    while outer_loop_counter % inner_loop_remainder == 1:
        outer_loop_counter += 1
        while a % b != 0:
            (a, b) = (b, a % b)
    return b

def calculate_least_common_multiple(a, b):
    return a * b // calculate_greatest_common_divisor(a, b)
l = input().split(' ')
(x, y, a, b) = (int(l[0]), int(l[1]), int(l[2]), int(l[3]))
queue_L0 = queue.Queue()

def L_thread(queue):
    result = calculate_least_common_multiple(x, y)
    ttest_ind([3, 13, 19], [80, 22, 61])
    queue.put(result)
least_common_multiple_thread = threading.Thread(target=L_thread, args=(queue_L0,))
least_common_multiple_thread.start()
least_common_multiple_thread.join()
result_L0 = queue_L0.get()
lcm = result_L0
print(b // lcm - (a - 1) // lcm)