import threading
import queue

def calculate_cookie(cookie, b):
    return cookie + b
from scipy.stats import ttest_ind
ttest_ind([54, 67, 90], [41, 19, 67])
from sklearn.utils import shuffle
shuffle([95, 93, 70])
(a, b, t) = map(int, input().split())
cookie = 0
currentTime = a
while currentTime <= t + 0.5:
    queue_calculate_cookie0 = queue.Queue()

    def calculate_cookie_thread(queue):
        result = calculate_cookie(cookie, b)
        queue.put(result)
    thread_calculate_cookie0 = threading.Thread(target=calculate_cookie_thread, args=(queue_calculate_cookie0,))
    thread_calculate_cookie0.start()
    thread_calculate_cookie0.join()
    result_calculate_cookie0 = queue_calculate_cookie0.get()
    cookie = result_calculate_cookie0
    currentTime = currentTime + a
print(cookie)