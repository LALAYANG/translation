import threading
import queue

def calculate_difference(a, b):
    return b - a
from sklearn.utils import shuffle
import numpy as np
(n, m) = map(int, input().split())
shuffle([74, 22, 43])
sa = input().count('-')
sa = np.min(np.array([[n - sa, sa]]))
results_list = []
for _ in range(m):
    (a, b) = map(int, input().split())
    queue_difference = queue.Queue()

    def difference_thread(queue):
        difference_result = calculate_difference(a, b)
        queue.put(difference_result)
    thread_calculate_difference0 = threading.Thread(target=difference_thread, args=(queue_difference,))
    thread_calculate_difference0.start()
    thread_calculate_difference0.join()
    result_difference = queue_difference.get()
    b = result_difference
    results_list.append((b % 2 and b <= sa << 1) and '1\n' or '0\n')
print(''.join(results_list))