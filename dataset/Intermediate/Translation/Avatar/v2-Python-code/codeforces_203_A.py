def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import numpy as np
import threading
import queue
xxs = input().split(' ')
(x, t, a, b, delta_a, db) = (int(xxs[0]), int(xxs[1]), int(xxs[2]), int(xxs[3]), int(xxs[4]), int(xxs[5]))

@my_decorator
def check_equation():
    if x == 0:
        print('YES')
        return 'Result Found'
    a_time = np.min(np.array([[a // delta_a, t - 1]]))
    b_time = min([b // db, t - 1])
    for i in range(a_time + 1):
        for time_b in range(b_time + 1):
            if a - delta_a * i == x or b - db * time_b == x:
                print('YES')
                return 'Result Found'
            if a - delta_a * i + (b - db * time_b) == x:
                print('YES')
                return 'Result Found'
    return 'Result Not Found'
queue_main0 = queue.Queue()

def main_thread(queue):
    result = check_equation()
    queue.put(result)
thread_main0 = threading.Thread(target=main_thread, args=(queue_main0,))
thread_main0.start()
thread_main0.join()
result_main0 = queue_main0.get()
ff = result_main0
if ff == 'Result Not Found':
    print('NO')