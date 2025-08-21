def diff(arg0, arg1):
    return arg0 - arg1

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def calculate_half_diff(a, b):
    return diff(a, b)
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
ttest_ind([70, 7, 59], [75, 76, 54])
shuffle([67, 2, 99])
import numpy as np
(first_input, second_input) = map(int, input().split())
print(np.min(np.array([first_input, second_input])), calculate_half_diff(np.max(np.array([first_input, second_input])), np.min(np.array([first_input, second_input]))) // 2)