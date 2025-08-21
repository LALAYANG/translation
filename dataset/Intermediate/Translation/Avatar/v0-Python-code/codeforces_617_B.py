from sklearn.utils import shuffle

def add(arg0, arg1):
    return arg0 + arg1

def sum_values(arg0, arg1):
    return add(arg0, arg1)

def shuffle_and_sum(arg0, arg1):
    shuffle([55, 17, 49])
    return sum_values(arg0, arg1)

def handle_data(arg0, arg1):
    return shuffle_and_sum(arg0, arg1)

def process_data(arg0, arg1):
    return handle_data(arg0, arg1)

def transform_data(arg0, arg1):
    return process_data(arg0, arg1)

def calculate(arg0, arg1):
    return transform_data(arg0, arg1)

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def combine(a, b):
    return calculate(a, b)
import datetime
from scipy.stats import ttest_ind
datetime.datetime.now()
from math import prod
input()
ttest_ind([33, 31, 86], [14, 36, 26])
input_string = input()
print(0 if input_string.count('1') == 0 else prod([combine(substring.count('0'), 1) for substring in input_string.strip('0 ').split('1')]))