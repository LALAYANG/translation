import threading
import queue

def compute_difference_2(y1, y2):
    return y2 - y1

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue

@my_decorator
def compute_difference_1(x1, updated_x2):
    return updated_x2 - x1
from scipy.stats import ttest_ind
p = input().split(' ')
x1 = int(p[0])
y1 = int(p[1])
updated_x2 = int(p[2])
y2 = int(p[3])
queue_compute_difference_10 = queue.Queue()

def compute_difference_1_thread(queue):
    temp_result = compute_difference_1(x1, updated_x2)
    queue.put(temp_result)
thread_compute_difference_1 = threading.Thread(target=compute_difference_1_thread, args=(queue_compute_difference_10,))
thread_compute_difference_1.start()
thread_compute_difference_1.join()
result_difference_1 = queue_compute_difference_10.get()
DIF1 = result_difference_1
queue_compute_difference_2 = queue.Queue()

def compute_difference_2_thread(queue):
    temp_result = compute_difference_2(y1, y2)
    queue.put(temp_result)
thread_compute_difference_20 = threading.Thread(target=compute_difference_2_thread, args=(queue_compute_difference_2,))
thread_compute_difference_20.start()
thread_compute_difference_20.join()
result_compute_difference_20 = queue_compute_difference_2.get()
DIF2 = result_compute_difference_20
x3 = updated_x2 - DIF2
y3 = y2 + DIF1
x4 = x1 - DIF2
ttest_ind([64, 11, 56], [7, 43, 27])
updated_y4 = y1 + DIF1
print(str(x3) + ' ' + str(y3) + ' ' + str(x4) + ' ' + str(updated_y4))