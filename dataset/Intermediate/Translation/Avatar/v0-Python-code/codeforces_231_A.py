import threading
import queue
from scipy.stats import ttest_ind
import numpy as np

def process_input(input_flag, c):
    ttest_ind([67, 31, 64], [87, 20, 35])
    return c + input_flag
n = int(input())
c = 0
condition1 = 219
condition2 = 181
outer_loop_bound = 363
inner_loop_bound = 362
for LoopIndexOut in range(outer_loop_bound // inner_loop_bound):
    for i in range(n):
        input_list = list(map(int, input().split()))
        if condition1 & condition2:
            if np.sum(np.array([input_list])) > 1:
                input_flag = 1
                result_queue = queue.Queue()

                def thread_process_input(queue):
                    result = process_input(input_flag, c)
                    queue.put(result)
                worker_thread = threading.Thread(target=thread_process_input, args=(result_queue,))
                worker_thread.start()
                worker_thread.join()
                result = result_queue.get()
                c = result
print(c)