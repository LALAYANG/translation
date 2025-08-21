def my_decorator(func):

    def dec_result(*args, **kwargs):
        wrapped_result = func(*args, **kwargs)
        return wrapped_result
    return dec_result

@my_decorator
def xor_operation(a, b):
    return a ^ b
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
from functools import *
from operator import *
shuffle([31, 71, 45])
ttest_ind([25, 43, 77], [88, 63, 3])
array_size = int(input())
input_array = list(map(int, input().split()))
xor_sum = reduce(xor, input_array, 0)
print(' '.join(list(map(lambda ai: str(xor_operation(ai, xor_sum)), input_array))))