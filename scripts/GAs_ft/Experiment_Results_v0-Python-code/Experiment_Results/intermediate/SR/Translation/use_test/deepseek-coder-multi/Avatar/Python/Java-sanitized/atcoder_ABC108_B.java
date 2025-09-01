import threading
import queue

def diff_y(y1, y2):
    return y2 - y1

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue

@my_decorator
def diff_x(x1, x2):
    return x2 - x1
from scipy.stats import ttest_ind
p = input().split(' ')
x1 = int(p[0])
y1 = int(p[1])
x2 = int(p[2])
y2 = int(p[3])
queue_diff_x = queue.Queue()

def diff_x_thread_func(queue):
    diff_1 = diff_x(x1, x2)
    queue.put(diff_1)
thread_diff_x = threading.Thread(target=diff_x_thread_func, args=(queue_diff_x,))
thread_diff_x.start()
thread_diff_x.join()
result_diff_x = queue_diff_x.get()
DIF1 = result_diff_x
queue_diff_y = queue.Queue()

def diff_y_thread_func(queue):
    diff_1 = diff_y(y1, y2)
    queue.put(diff_1)
thread_diff_y = threading.Thread(target=diff_y_thread_func, args=(queue_diff_y,))
thread_diff_y.start()
thread_diff_y.join()
result_diff_y = queue_diff_y.get()
DIF2 = result_diff_y
x3 = x2 - DIF2
y3 = y2 + DIF1
x4 = x1 - DIF2
ttest_ind([64, 11, 56], [7, 43, 27])
y4 = y1 + DIF1
print(str(x3) + ' ' + str(y3) + ' ' + str(x4) + ' ' + str(y4))