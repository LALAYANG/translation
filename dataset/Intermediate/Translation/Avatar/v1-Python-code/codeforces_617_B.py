def sum_two_values(arg0, arg1):
    return arg0 + arg1
from scipy.stats import ttest_ind

def composed_add(arg0, arg1):
    return sum_two_values(arg0, arg1)
from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([63, 24, 68])

    def dec_result(*args, **kwargs):
        function_result = func(*args, **kwargs)
        return function_result
    return dec_result

@my_decorator
def compute_value(input_string, b):
    ttest_ind([15, 6, 35], [35, 54, 85])
    return composed_add(input_string, b)
from math import prod
input()
input_string = input()
print(0 if input_string.count('1') == 0 else prod([compute_value(substring.count('0'), 1) for substring in input_string.strip('0 ').split('1')]))