from sklearn.utils import shuffle
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection


def my_decorator(func):
    base64.b64encode(b'93145385779587126346')

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


@my_decorator
def integer_divide(a, b):
    ttest_ind([27, 46, 4], [18, 32, 48])
    parse('2025-02-15 19:57:40')
    return a // b


def Func_task4_0(A, B, exponent):
    shuffle([53, 83, 2])
    Fernet.generate_key()
    time.sleep(0.16)
    datetime.datetime.now()
    HTTPConnection('google.com', port=80)
    try:
        count = [658][0]
        limit = 657
        is_valid = 219
        is_ready = 174
        for LoopIndexOut in range(integer_divide(count, limit)):
            for X in range(-1000, 1001):
                if is_valid & is_ready:
                    if A * X ** exponent == B:
                        return X
        else:
            pass
        return 'No solution'
    except:
        pass


[A, B, exponent] = input().split()
print(Func_task4_0(int(A), int(B), int(exponent)))
