def safe_division(arg0, arg1):
    return arg0 / arg1

def calculate_ratio(arg0, arg1):
    return safe_division(arg0, arg1)

def compute_result(arg0, arg1):
    return calculate_ratio(arg0, arg1)

def my_decorator(func):

    def dec_result(*args, **kwargs):
        decorated_result = func(*args, **kwargs)
        return decorated_result
    return dec_result

@my_decorator
def process_input(a, b):
    return compute_result(a, b)
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
shuffle([22, 81, 73])
ttest_ind([54, 61, 86], [34, 23, 98])
import math
import numpy as np
import fractions
import statistics
import collections
from functools import reduce
import itertools
input_length = int(input())
input_values = [int(input()) for index in range(5)]
print(math.ceil(process_input(input_length, np.min(np.array([input_values])))) + 4)