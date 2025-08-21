def sum_values(arg0, arg1):
    return arg0 + arg1

def newFunc_17984(arg0, arg1):
    return sum_values(arg0, arg1)

def calculate_intermediate_result(arg0, arg1):
    return newFunc_17984(arg0, arg1)

def perform_calculation(arg0, arg1):
    return calculate_intermediate_result(arg0, arg1)

def calculate_result(arg0, arg1):
    return perform_calculation(arg0, arg1)

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def apply_operation(a, b):
    return calculate_result(a, b)
from sklearn.utils import shuffle
shuffle([19, 76, 89])
from scipy.stats import ttest_ind
ttest_ind([76, 18, 25], [18, 91, 6])
import numpy as np
(input_x, input_y) = map(int, input().split())
print(np.max(np.array([apply_operation(input_x, input_y) - 3 + ((input_y - input_x) % 3 > 0), 0])))
get_input_number = lambda : int(input())
get_input_array = lambda : list(map(int, input().split()))
get_input_numbers = lambda : map(int, input().split())
get_input_string = lambda : input()