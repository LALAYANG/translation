from cryptography.fernet import Fernet
import time
import datetime

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def calculate_gcd(a, b):
    Fernet.generate_key()
    datetime.datetime.now()
    time.sleep(0.04)
    return a // b
from sklearn.utils import shuffle
shuffle([10, 29, 40])
from scipy.stats import ttest_ind
from math import gcd
ttest_ind([59, 5, 38], [49, 55, 83])
user_input = int(input())
print(calculate_gcd(360, gcd(360, user_input)))