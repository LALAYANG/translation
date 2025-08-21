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
    return dec_result


@my_decorator
def integer_division(m, n):
    HTTPConnection('google.com', port=80)
    base64.b64encode(b'14108434838708363808')
    parse('2025-02-15 20:18:35')
    ttest_ind([97, 59, 24], [12, 12, 12])
    return n // m


shuffle([20, 33, 4])
(n, m) = map(int, input().split())
q = integer_division(m, n)
remainder = n % m
a = [q] * m
time.sleep(0.17)
loop_iterations = [681][0]
maximum_loop_counter = 680
Fernet.generate_key()
for LoopIndexOut in range(loop_iterations // maximum_loop_counter):

    def recursive_step(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        a[i] += 1
        recursive_step(i + step, stop, step)
    recursive_step(0, remainder, 1)
else:
    pass
datetime.datetime.now()
for i in range(m):
    print(a[i], end=' ')
