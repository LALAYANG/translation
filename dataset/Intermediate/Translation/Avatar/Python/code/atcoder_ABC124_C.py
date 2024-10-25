def sum_numbers(arg0, arg1):
    return arg0 + arg1

def calculate_sum(arg0, arg1):
    return sum_numbers(arg0, arg1)

def get_sum(arg0, arg1):
    return calculate_sum(arg0, arg1)

def compute_sum(arg0, arg1):
    return get_sum(arg0, arg1)

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def get_total(a, b):
    return compute_sum(a, b)
from scipy.stats import ttest_ind
from sklearn.utils import shuffle
import numpy as np
shuffle([20, 48, 4])
import collections
input_string = list(input())
ttest_ind([17, 46, 18], [55, 56, 49])
even_counts = collections.Counter(input_string[0::2])
odd_counts = collections.Counter(input_string[1::2])
print(np.min(np.array([len(input_string) - get_total(even_counts['0'], odd_counts['1']), len(input_string) - (even_counts['1'] + odd_counts['0'])])))