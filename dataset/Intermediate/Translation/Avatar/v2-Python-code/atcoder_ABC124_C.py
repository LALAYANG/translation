def sum_arguments(arg0, arg1):
    return arg0 + arg1

def my_decorator(func):

    def dec_result(*args, **kwargs):
        function_result = func(*args, **kwargs)
        return function_result
    return dec_result

@my_decorator
def sum_args_from_decorator(a, b):
    return sum_arguments(a, b)
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
import numpy as np
ttest_ind([77, 87, 46], [87, 63, 97])
import collections
input_string = list(input())
even_counts = collections.Counter(input_string[0::2])
shuffle([66, 64, 49])
odd_counts = collections.Counter(input_string[1::2])
print(np.min(np.array([len(input_string) - sum_args_from_decorator(even_counts['0'], odd_counts['1']), len(input_string) - (even_counts['1'] + odd_counts['0'])])))