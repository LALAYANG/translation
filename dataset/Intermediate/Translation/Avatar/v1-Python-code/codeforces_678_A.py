from dateutil.parser import parse
from http.client import HTTPConnection
import base64
from cryptography.fernet import Fernet
import time
import datetime

def my_decorator(func):
    try:

        def dec_result(*args, **kwargs):
            division_result = func(*args, **kwargs)
            return division_result
        datetime.datetime.now()
        return dec_result
    except:
        pass

@my_decorator
def integer_division(a, b):
    try:
        HTTPConnection('google.com', port=80)
        base64.b64encode(b'41493583001567655714')
        parse('2025-08-17 23:00:53')
        Fernet.generate_key()
        time.sleep(0.28)
        return a // b
    except:
        pass
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
(first_input, second_input) = map(int, input().split())
shuffle([29, 17, 50])
ttest_ind([53, 91, 25], [76, 57, 11])
print((integer_division(first_input, second_input) + 1) * second_input)