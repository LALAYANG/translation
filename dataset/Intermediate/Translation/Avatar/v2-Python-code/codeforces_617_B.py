def sum_arguments(arg0, arg1):
    return arg0 + arg1
from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([69, 24, 70])

    def dec_result(*args, **kwargs):
        function_result = func(*args, **kwargs)
        return function_result
    return dec_result

@my_decorator
def sum_inputs(a, b):
    return sum_arguments(a, b)
from scipy.stats import ttest_ind
from math import prod
ttest_ind([92, 90, 36], [11, 50, 56])
input()
input_string = input()
print(0 if input_string.count('1') == 0 else prod([sum_inputs(substring.count('0'), 1) for substring in input_string.strip('0 ').split('1')]))