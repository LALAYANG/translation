def calculate_difference(arg0, arg1):
    return arg0 - arg1

def get_difference(arg0, arg1):
    return calculate_difference(arg0, arg1)

def determine_difference(arg0, arg1):
    return get_difference(arg0, arg1)

def compute_difference(arg0, arg1):
    return determine_difference(arg0, arg1)

def find_difference(arg0, arg1):
    return compute_difference(arg0, arg1)

def obtain_difference(arg0, arg1):
    return find_difference(arg0, arg1)

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def perform_operation(a, b):
    return obtain_difference(a, b)
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
import numpy as np
shuffle([85, 53, 78])
ttest_ind([1, 88, 72], [8, 85, 79])
(input_value1, input_value2) = map(int, input().split())
print(np.min(np.array([input_value1, input_value2])), perform_operation(np.max(np.array([input_value1, input_value2])), np.min(np.array([input_value1, input_value2]))) // 2)