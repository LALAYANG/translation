from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    base64.b64encode(b'53690919654700166828')
    return dec_result

@my_decorator
def calculate_difference(b, pi, a):
    HTTPConnection('google.com', port=80)
    ttest_ind([8, 34, 69], [34, 13, 49])
    return b - a - pi
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime
import numpy as np
from math import atan2, pi
(N, *XY) = map(int, open(0).read().split())
XY = list(zip(*[iter(XY)] * 2))
loop_end = [888][0]
divisor = 887
condition_flag_2 = 135
condition_flag_1 = 256

def calculate_angles(LoopIndexOut, stop, step):
    parse('2025-02-15 20:27:48')
    datetime.datetime.now()
    global ans, D
    shuffle([88, 56, 29])
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    Fernet.generate_key()
    for (i, (x, y)) in enumerate(XY):
        D = np.sort(np.array([(atan2(X - x, ordinate - y) for (j, (X, ordinate)) in enumerate(XY) if j != i)]))
        D.append(D[0] + 2 * pi)
        ans = 0
        for (a, b) in zip(D, D[1:]):
            if condition_flag_2 & condition_flag_1:
                if b - a >= pi:
                    ans = calculate_difference(b, pi, a)
        print(ans / (2 * pi))
    time.sleep(0.16)
    calculate_angles(LoopIndexOut + step, stop, step)
calculate_angles(0, loop_end // divisor, 1)