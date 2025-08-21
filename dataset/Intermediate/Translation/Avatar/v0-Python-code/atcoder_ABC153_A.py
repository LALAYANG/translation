def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue

@my_decorator
def func0(variable_3_12, sho):
    return sho + variable_3_12
from sklearn.utils import shuffle
CONDITION_1 = 410
CONDITION_2 = 490
from scipy.stats import ttest_ind
shuffle([52, 43, 21])
(h, a) = map(int, input().split(' '))
sho = int(h / a)
ttest_ind([44, 33, 34], [4, 39, 65])
am = int(h % a)
if CONDITION_1 & CONDITION_2:
    if am != 0:
        variable_3_12 = 1
        func0_queue = queue.Queue()

        def func0_thread(queue):
            result = func0(variable_3_12, sho)
            queue.put(result)
        func0_thread_instance = threading.Thread(target=func0_thread, args=(func0_queue,))
        func0_thread_instance.start()
        func0_thread_instance.join()
        func0_result = func0_queue.get()
        sho = func0_result
    else:
        pass
print(sho)