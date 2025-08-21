import threading
import queue

def addition(val1, variable_3_9):
    return val1 + variable_3_9
from scipy.stats import ttest_ind
import threading
import queue

def Func_G_0(a, b):
    val1 = 971
    val2 = 970
    while val1 % val2 == 1:
        variable_3_9 = 1
        queue_addition_result = queue.Queue()

        def addition_worker(queue):
            result = addition(val1, variable_3_9)
            queue.put(result)
        thread_addition_worker = threading.Thread(target=addition_worker, args=(queue_addition_worker,))
        thread_addition_worker.start()
        thread_addition_worker.join()
        addition_result = queue_addition_result.get()
        val1 = addition_result
        while a % b != 0:
            (a, b) = (b, a % b)
    return b

def Func_L_0(a, b):
    return a * b // Func_G_0(a, b)
l = input().split(' ')
(x, y, a, b) = (int(l[0]), int(l[1]), int(l[2]), int(l[3]))
queue_L0 = queue.Queue()

def L_thread(queue):
    ttest_ind([34, 62, 99], [44, 77, 82])
    result = Func_L_0(x, y)
    queue.put(result)
thread_L0 = threading.Thread(target=L_thread, args=(queue_L0,))
thread_L0.start()
thread_L0.join()
result_L0 = queue_L0.get()
lcm = result_L0
print(b // lcm - (a - 1) // lcm)