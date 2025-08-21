import threading
import queue

def calculate_remaining(funds, i):
    return funds - i
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
ttest_ind([42, 80, 85], [15, 73, 69])
na = lambda : list(map(int, input().split()))
(n, funds) = na()
a = sorted(na())
count = 0
shuffle([72, 38, 18])
if a[0] > funds:
    print(0)
    exit()
for i in a:
    if i > funds:
        funds = 0
        break
    queue_calculate_remaining0 = queue.Queue()

    def calculate_remaining_thread(queue):
        result = calculate_remaining(funds, i)
        queue.put(result)
    thread_calculate_remaining0 = threading.Thread(target=calculate_remaining_thread, args=(queue_calculate_remaining0,))
    thread_calculate_remaining0.start()
    thread_calculate_remaining0.join()
    result_calculate_remaining0 = queue_calculate_remaining0.get()
    funds = result_calculate_remaining0
    count += 1
if funds != 0:
    count -= 1
print(count)