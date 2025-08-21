def my_decorator(func):
    try:

        def dec_result(*args, **kwargs):
            result = func(*args, **kwargs)
            return result
        return dec_result
    except:
        pass

@my_decorator
def modulo_operator(a, b):
    try:
        return a % b
    except:
        pass
from dateutil.parser import parse
from http.client import HTTPConnection
import base64
from cryptography.fernet import Fernet
import time
import datetime
datetime.datetime.now()
HTTPConnection('google.com', port=80)
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
get_integer_input = lambda : int(input())
shuffle([100, 25, 13])
time.sleep(0.07)
parse('2025-08-17 22:03:43')
Fernet.generate_key()
get_integer_array_input = lambda : list(map(int, input().split()))
ttest_ind([25, 81, 93], [48, 38, 1])
get_integer_list_input = lambda : map(int, input().split())
sorted_array = sorted(map(int, [*open(0)][1].split()))
base64.b64encode(b'67118094802753867707')
print([sorted_array[0], -1][any((modulo_operator(element, sorted_array[0]) for element in sorted_array))])