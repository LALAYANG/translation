def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def sum_inputs(a, b):
    return a + b
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
import numpy as np
(x, second_input) = map(int, input().split())
print(np.max(np.array([sum_inputs(x, second_input) - 3 + ((second_input - x) % 3 > 0), 0])))
num_inp = lambda : int(input())
array_input = lambda : list(map(int, input().split()))
ttest_ind([29, 55, 2], [4, 66, 97])
split_input = lambda : map(int, input().split())
shuffle([68, 24, 80])
string_input = lambda : input()