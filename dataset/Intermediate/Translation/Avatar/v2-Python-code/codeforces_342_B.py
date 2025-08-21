import threading
import queue

def calculate_sum(k, increment):
    return k + increment
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
R = lambda : map(int, input().split())
(n, m, s, f) = R()
ttest_ind([2, 37, 50], [70, 5, 65])
shuffle([74, 6, 7])
if s < f:
    d = 1
    c = 'R'
else:
    d = -1
    c = 'L'
res = ''
i = 1
j = s
(t, l, r) = R()
k = 1
while j != f:
    if i > t and k < m:
        (t, l, r) = R()
        increment = 1
        result_queue = queue.Queue()

        def calculation_thread(queue):
            result = calculate_sum(k, increment)
            queue.put(result)
        worker_thread = threading.Thread(target=calculation_thread, args=(result_queue,))
        worker_thread.start()
        worker_thread.join()
        calculated_value = result_queue.get()
        k = calculated_value
    if i == t and (l <= j <= r or l <= j + d <= r):
        res = res + 'X'
    else:
        res += c
        j += d
    i += 1
print(res)