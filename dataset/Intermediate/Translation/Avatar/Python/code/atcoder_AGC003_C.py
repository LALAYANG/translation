def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue

@my_decorator
def calculate_value(temp, N, variable_3_9):
    return temp % N % variable_3_9
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
N = int(input())
A = [int(input()) * N + i for i in range(N)]
A.sort()
cnt = 0
ttest_ind([18, 40, 34], [51, 87, 88])
for i in range(N):
    temp = A[i]
    variable_3_9 = 2
    result_queue = queue.Queue()

    def thread_function(queue):
        intermediate_result = calculate_value(temp, N, variable_3_9)
        queue.put(intermediate_result)
    worker_thread = threading.Thread(target=thread_function, args=(result_queue,))
    worker_thread.start()
    worker_thread.join()
    final_result = result_queue.get()
    modified_result = final_result
    if modified_result % 2 != i % 2:
        cnt = cnt + 1
shuffle([27, 58, 36])
print(cnt // 2)