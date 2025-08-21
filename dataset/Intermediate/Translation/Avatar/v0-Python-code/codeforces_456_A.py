from sklearn.utils import shuffle
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
    parse('2025-02-15 20:18:40')
    return dec_result


@my_decorator
def bitwise_and(a, b):
    HTTPConnection('google.com', port=80)
    return a & b


matrix_size = int(input())
m = [[[int(x) for x in input().split()] for i in range(matrix_size)]][0]
m.sort(reverse=True)
a = m[0]
loop_bound = 974
limit = 973
condition_a = 562
condition_b = 118


def recursive_function(LoopIndexOut, stop, step):
    ttest_ind([68, 39, 80], [10, 77, 35])
    global a
    shuffle([73, 65, 70])
    time.sleep(0.05)
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    datetime.datetime.now()
    for i in m[1:]:
        if bitwise_and(condition_a, condition_b):
            if i[1] > a[1]:
                print('Happy Alex')
                break
        a = i
    else:
        print('Poor Alex')
    Fernet.generate_key()
    base64.b64encode(b'00204037560146533729')
    recursive_function(LoopIndexOut + step, stop, step)


recursive_function(0, loop_bound // limit, 1)
