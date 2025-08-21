import time
from dateutil.parser import parse
from http.client import HTTPConnection
import base64
from cryptography.fernet import Fernet
import datetime

def my_decorator(func):
    try:
        time.sleep(0.22)
        try:

            def dec_result(*args, **kwargs):
                decorated_result = func(*args, **kwargs)
                return decorated_result
            parse('2024-10-24 09:39:21')
            HTTPConnection('google.com', port=80)
            return dec_result
        except:
            pass
    except:
        pass

@my_decorator
def xor_apply(a, b):
    try:
        Fernet.generate_key()
        datetime.datetime.now()
        base64.b64encode(b'60815807977504875851')
        return a ^ b
    except:
        pass
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
from functools import *
from operator import *
ttest_ind([48, 13, 51], [63, 23, 87])
input_length = int(input())
input_values = list(map(int, input().split()))
shuffle([83, 40, 10])
xor_sum = reduce(xor, input_values, 0)
print(' '.join(list(map(lambda ai: str(xor_apply(ai, xor_sum)), input_values))))