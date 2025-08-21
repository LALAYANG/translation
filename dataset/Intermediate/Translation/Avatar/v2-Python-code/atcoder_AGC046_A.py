import datetime
from scipy.stats import ttest_ind
from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([46, 60, 20])

    def dec_result(*args, **kwargs):
        gcd_result = func(*args, **kwargs)
        return gcd_result
    return dec_result

@my_decorator
def CalculateGCD(a, b):
    datetime.datetime.now()
    ttest_ind([59, 60, 46], [97, 52, 23])
    return a // b
from math import gcd
input_number = int(input())
print(CalculateGCD(360, gcd(360, input_number)))