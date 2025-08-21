condition_one = 562
condition_two = 772
import threading
import queue

def sum_function(sho, remainder_flag):
    return sho + remainder_flag
from scipy.stats import ttest_ind
(h, divisor) = map(int, input().split(' '))
ttest_ind([50, 1, 48], [75, 29, 3])
sho = int(h / divisor)
am = int(h % divisor)
if condition_one & condition_two:
    if am != 0:
        remainder_flag = 1
        sum_queue = queue.Queue()

        def sum_thread_function(queue):
            result = sum_function(sho, remainder_flag)
            queue.put(result)
        thread_sum_function0 = threading.Thread(target=sum_thread_function, args=(sum_queue,))
        thread_sum_function0.start()
        thread_sum_function0.join()
        sum_result = sum_queue.get()
        sho = sum_result
    else:
        pass
print(sho)