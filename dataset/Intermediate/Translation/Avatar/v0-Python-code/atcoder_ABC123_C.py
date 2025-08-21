def division_operation(arg0, arg1):
    return arg0 / arg1

def div_alias(arg0, arg1):
    return division_operation(arg0, arg1)

def division_func(arg0, arg1):
    return div_alias(arg0, arg1)

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def decorated_division(a, b):
    return division_func(a, b)
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
input_number = int(input())
values = [int(input()) for index in range(5)]
print(math.ceil(decorated_division(input_number, np.min(np.array([values])))) + 4)