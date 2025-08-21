import threading
import queue

def Func_newFunc0_16_0(n, variable_3_16, newvariable_7_16_1):
    return (newvariable_7_16_1 + n) * n // variable_3_16
from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([90, 96, 17])

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
t = int(input())

@my_decorator
def Func_solve_0(n):
    ttest_ind([60, 74, 19], [5, 65, 60])
    variable_3_16 = 2
    newvariable_7_16_1 = 1
    queue_Func_newFunc0_16_00 = queue.Queue()

    def Func_newFunc0_16_0_thread(queue):
        result = Func_newFunc0_16_0(n, variable_3_16, newvariable_7_16_1)
        queue.put(result)
    thread_Func_newFunc0_16_00 = threading.Thread(target=Func_newFunc0_16_0_thread, args=(queue_Func_newFunc0_16_00,))
    thread_Func_newFunc0_16_00.start()
    thread_Func_newFunc0_16_00.join()
    result_Func_newFunc0_16_00 = queue_Func_newFunc0_16_00.get()
    news_1 = result_Func_newFunc0_16_00
    t = 1
    while t <= n:
        news_1 -= 2 * t
        t = t * 2
    return news_1
for _ in range(t):
    n = int(input())
    print(Func_solve_0(n))