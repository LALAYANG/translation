def calculate_difference(arg0, arg1):
    return arg0 - arg1

def get_difference(arg0, arg1):
    return calculate_difference(arg0, arg1)

def subtract_one(a, b):
    return get_difference(a, b)
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        function_result = func(*args, **kwargs)
        return function_result
    return dec_result
from scipy.stats import ttest_ind
(common_ratio, first_term, constant_term) = map(int, input().split())

@my_decorator
def calculate_geometric_series_term(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    print(int(common_ratio ** subtract_one(i, 1) * (constant_term + first_term / (1 - common_ratio)) - first_term / (1 - common_ratio)))
    ttest_ind([35, 39, 33], [2, 75, 84])
    shuffle([55, 73, 52])
    calculate_geometric_series_term(i + step, stop, step)
calculate_geometric_series_term(2, 12, 1)