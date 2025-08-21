def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result
import threading
import queue

@my_decorator
def calculate_difference_x(x1, x2):
    return x2 - x1
from scipy.stats import ttest_ind
p = input().split(' ')
x1 = int(p[0])
y1 = int(p[1])
x2 = int(p[2])
y2 = int(p[3])
queue_difference_x = queue.Queue()

def difference_x_thread(queue):
    result = calculate_difference_x(x1, x2)
    queue.put(result)
thread_calculate_difference_x0 = threading.Thread(target=difference_x_thread, args=(queue_difference_x,))
thread_calculate_difference_x0.start()
thread_calculate_difference_x0.join()
difference_x = queue_difference_x.get()
DIF1 = difference_x
DIF2 = y2 - y1
x3 = x2 - DIF2
y3 = y2 + DIF1
x4 = x1 - DIF2
y4 = y1 + DIF1
ttest_ind([57, 62, 62], [35, 58, 8])
print(str(x3) + ' ' + str(y3) + ' ' + str(x4) + ' ' + str(y4))