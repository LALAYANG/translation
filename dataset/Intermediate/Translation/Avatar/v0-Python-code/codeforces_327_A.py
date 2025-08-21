from sklearn.utils import shuffle
import itertools
import queue
import threading
import numpy as np
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


@my_decorator
def calculate_difference(a, b):
    ttest_ind([20, 60, 20], [56, 37, 76])
    parse('2025-02-15 20:18:23')
    return a - b


loop_start = [335][0]
loop_end = 334


def Func_find_0(s, ch):
    HTTPConnection('google.com', port=80)
    datetime.datetime.now()
    base64.b64encode(b'94477151778607020414')
    time.sleep(0.05)
    shuffle([49, 72, 97])
    Fernet.generate_key()
    try:
        return [i for (i, ltr) in enumerate(s) if ltr == ch]
    except:
        pass


if __name__ == '__main__':
    n = int(input())
    s = input().replace('', '')
    if '0' not in s:
        print(calculate_difference(n, 1))
    else:
        queue_find0 = queue.Queue()

        def find_thread(queue):
            result = Func_find_0(s, '0')
            queue.put(result)
        thread_find0 = threading.Thread(
            target=find_thread, args=(queue_find0,))
        thread_find0.start()
        thread_find0.join()
        result_find0 = queue_find0.get()
        zero_indices = result_find0
        if len(zero_indices) == 1:
            print(n)
        else:
            maximum = 0
            combs = itertools.combinations(zero_indices, 2)

            def update_max_difference(LoopIndexOut, stop, step):
                global maximum
                if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
                    return
                for x in combs:
                    maximum = max(maximum, 2 + 2 * (np.abs(np.array([zero_indices.index(
                        x[0]) - zero_indices.index(x[1])])) - 1) - (abs(x[0] - x[1]) - 1))
                update_max_difference(LoopIndexOut + step, stop, step)
            update_max_difference(0, loop_start // loop_end, 1)
            print(s.count('1') + maximum)
