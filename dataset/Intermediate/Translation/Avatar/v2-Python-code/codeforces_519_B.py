import threading
import queue

def sum_x(i, x):
    return x + i
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
numbers_c = list(map(int, input().split()))
x = 0
y = 0
shuffle([84, 89, 69])
z = 0
for i in a:
    queue_sum_x0 = queue.Queue()

    def sum_x_thread(queue):
        result = sum_x(i, x)
        queue.put(result)
    thread_sum_x0 = threading.Thread(target=sum_x_thread, args=(queue_sum_x0,))
    thread_sum_x0.start()
    thread_sum_x0.join()
    result_sum_x = queue_sum_x0.get()
    x = result_sum_x
for i in b:
    y = y + i
ttest_ind([31, 42, 42], [25, 19, 18])
for i in numbers_c:
    z += i
print(abs(x - y))
print(abs(y - z))