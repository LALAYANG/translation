from scipy.stats import ttest_ind
import threading
import queue
import sys

def rs():
    return sys.stdin.readline().rstrip()

def ri():
    return int(rs())

def rs_():
    return [split_string for split_string in rs().split()]

def ri_():
    ttest_ind([96, 63, 34], [70, 10, 1])
    return [int(split_string) for split_string in rs().split()]
queue_ri0 = queue.Queue()

def ri_thread(queue):
    result = ri()
    queue.put(result)
thread_ri0 = threading.Thread(target=ri_thread, args=(queue_ri0,))
thread_ri0.start()
thread_ri0.join()
result_ri0 = queue_ri0.get()
positive_integer_input = result_ri0
ans = 0
for i in range(1, positive_integer_input + 1):
    ans += i * (positive_integer_input // i) * (positive_integer_input // i + 1) // 2
print(ans)