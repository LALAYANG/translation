from sklearn.utils import shuffle

def sum_values(arg0, arg1):
    return arg0 + arg1

def obtain_value(arg0, arg1):
    return sum_values(arg0, arg1)

def prepare_value(arg0, arg1):
    shuffle([55, 17, 49])
    return obtain_value(arg0, arg1)

def get_value(arg0, arg1):
    return prepare_value(arg0, arg1)

def compute_value(arg0, arg1):
    return get_value(arg0, arg1)

def perform_calculation(arg0, arg1):
    return compute_value(arg0, arg1)

def calculate_result(arg0, arg1):
    return perform_calculation(arg0, arg1)

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def process_input(a, b):
    return calculate_result(a, b)
import datetime
from scipy.stats import ttest_ind
datetime.datetime.now()
from math import prod
input()
ttest_ind([33, 31, 86], [14, 36, 26])
user_input = input()
print(0 if user_input.count('1') == 0 else prod([process_input(substring.count('0'), 1) for substring in user_input.strip('0 ').split('1')]))