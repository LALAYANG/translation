from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    ttest_ind([41, 44, 37], [73, 75, 11])
    return dec_result

@my_decorator
def delta_x(x2, x1):
    HTTPConnection('google.com', port=80)
    parse('2025-02-15 20:27:49')
    base64.b64encode(b'29031129115977540143')
    return x2 - x1
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
shuffle([72, 97, 82])
import time
import datetime
CONDITION_1 = [327][0]
CONDITION_2 = 167
datetime.datetime.now()
import math
given = input('')
l1 = given.split()
l1 = [int(x) for x in l1]
time.sleep(0.23)
Fernet.generate_key()
x1 = l1[0]
y1 = l1[1]
x2 = l1[2]
y2 = l1[3]
denominator = delta_x(x2, x1)
numerator = y2 - y1
if CONDITION_1 & CONDITION_2:
    if denominator != 0:
        quotient = numerator / denominator
if numerator == 0:
    d = int(math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2))
    x4 = x1
    x3 = x2
    y3 = y2 + d
    y4 = y1 + d
    print(f'{x3} {y3} {x4} {y4}')
elif denominator == 0:
    y4 = y2
    y3 = y1
    d = int(math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2))
    x4 = x1 + d
    x3 = x2 + d
    print(f'{x3} {y3} {x4} {y4}')
elif quotient == 1:
    x4 = x2
    x3 = x1
    y4 = y1
    y3 = y2
    print(f'{x3} {y3} {x4} {y4}')
elif quotient == -1:
    x4 = x1
    x3 = x2
    y4 = y2
    y3 = y1
    print(f'{x3} {y3} {x4} {y4}')
else:
    print('-1')