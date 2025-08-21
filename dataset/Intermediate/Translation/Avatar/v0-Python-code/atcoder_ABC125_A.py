import threading
import queue

def calculate_sum(counter1, variable_3_9):
    return counter1 + variable_3_9
from scipy.stats import ttest_ind
from sklearn.utils import shuffle
(a, b, t) = map(int, input().split())
result_accumulator = 0
time = a
counter1 = 758
counter2 = 757
while counter1 % counter2 == 1:
    variable_3_9 = 1
    result_queue = queue.Queue()

    def worker_thread(queue):
        result = calculate_sum(counter1, variable_3_9)
        queue.put(result)
    worker_thread_instance = threading.Thread(target=worker_thread, args=(result_queue,))
    worker_thread_instance.start()
    worker_thread_instance.join()
    worker_result = result_queue.get()
    counter1 = worker_result
    while time <= t + 0.5:
        result_accumulator = result_accumulator + b
        time = time + a
shuffle([8, 41, 88])
ttest_ind([56, 51, 22], [2, 75, 30])
print(result_accumulator)