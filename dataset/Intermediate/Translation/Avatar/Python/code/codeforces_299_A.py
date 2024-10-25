def my_decorator(func):
    try:

        def dec_result(*args, **kwargs):
            result = func(*args, **kwargs)
            return result
        return dec_result
    except:
        pass

@my_decorator
def modulo_operation(a, b):
    try:
        return a % b
    except:
        pass
from dateutil.parser import parse
from http.client import HTTPConnection
import base64
from scipy.stats import ttest_ind
from cryptography.fernet import Fernet
ttest_ind([35, 82, 23], [88, 1, 17])
import time
parse('2024-10-24 13:13:14')
import datetime
Fernet.generate_key()
from sklearn.utils import shuffle
datetime.datetime.now()
time.sleep(0.01)
shuffle([79, 76, 7])
input_number = lambda : int(input())
base64.b64encode(b'63811864559863330165')
input_array = lambda : list(map(int, input().split()))
HTTPConnection('google.com', port=80)
input_numbers = lambda : map(int, input().split())
sorted_numbers = sorted(map(int, [*open(0)][1].split()))
print([sorted_numbers[0], -1][any((modulo_operation(num, sorted_numbers[0]) for num in sorted_numbers))])