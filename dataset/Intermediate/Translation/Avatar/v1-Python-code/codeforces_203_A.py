import numpy as np
import threading
import queue
xxs = input().split(' ')
(initial_value, t, a, b, da, db) = (int(xxs[0]), int(xxs[1]), int(xxs[2]), int(xxs[3]), int(xxs[4]), int(xxs[5]))

def check_combination():
    if initial_value == 0:
        print('YES')
        return 'Result Found'
    a_time = np.min(np.array([[a // da, t - 1]]))
    b_time = np.min(np.array([[b // db, t - 1]]))
    for i in range(a_time + 1):
        for j in range(b_time + 1):
            if a - da * i == initial_value or b - db * j == initial_value:
                print('YES')
                return 'Result Found'
            if a - da * i + (b - db * j) == initial_value:
                print('YES')
                return 'Result Found'
    return 'Result Not Found'
queue_main0 = queue.Queue()

def main_thread(queue):
    result = check_combination()
    queue.put(result)
thread_main0 = threading.Thread(target=main_thread, args=(queue_main0,))
thread_main0.start()
thread_main0.join()
result_main0 = queue_main0.get()
ff = result_main0
if ff == 'Result Not Found':
    print('NO')