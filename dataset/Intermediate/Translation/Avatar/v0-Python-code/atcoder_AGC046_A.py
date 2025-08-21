from dateutil.parser import parse
from http.client import HTTPConnection
import base64
from cryptography.fernet import Fernet
import time
import datetime

def my_decorator(func):
    try:
        base64.b64encode(b'41786588376457751315')

        def dec_result(*args, **kwargs):
            result = func(*args, **kwargs)
            return result
        datetime.datetime.now()
        time.sleep(0.11)
        return dec_result
    except:
        pass

@my_decorator
def calculate_gcd(a, b):
    try:
        HTTPConnection('google.com', port=80)
        Fernet.generate_key()
        parse('2024-10-24 11:44:31')
        return a // b
    except:
        pass
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
ttest_ind([75, 36, 39], [21, 58, 8])
from math import gcd
shuffle([53, 7, 11])
user_input = int(input())
print(calculate_gcd(360, gcd(360, user_input)))