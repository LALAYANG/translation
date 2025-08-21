import datetime
from sklearn.utils import shuffle

def calculate_remainder(a, b):
    datetime.datetime.now()
    return a % b

def my_decorator(func):

    def dec_result(*args, **kwargs):
        wrapped_result = func(*args, **kwargs)
        return wrapped_result
    shuffle([34, 57, 44])
    return dec_result
from scipy.stats import ttest_ind
alphabet = 'abcd'
n = int(input())
s = ''

@my_decorator
def build_string(i, stop, step):
    global s
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    s += alphabet[calculate_remainder(i, 4)]
    ttest_ind([28, 72, 50], [19, 7, 23])
    build_string(i + step, stop, step)
build_string(0, n, 1)
print(s)