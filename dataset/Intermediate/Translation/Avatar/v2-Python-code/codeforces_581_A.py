def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def difference_function(a, b):
    return a - b
from scipy.stats import ttest_ind
import numpy as np
(first_input, second_input) = map(int, input().split())
ttest_ind([34, 57, 27], [6, 15, 17])
print(np.min(np.array([first_input, second_input])), difference_function(np.max(np.array([first_input, second_input])), np.min(np.array([first_input, second_input]))) // 2)