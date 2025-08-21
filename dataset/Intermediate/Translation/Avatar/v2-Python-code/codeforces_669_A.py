def multiply_two_numbers(arg0, arg1):
    return arg0 * arg1

def multiply_indirect(arg0, arg1):
    return multiply_two_numbers(arg0, arg1)

def multiply_more_indirect(arg0, arg1):
    return multiply_indirect(arg0, arg1)

def my_decorator(func):

    def dec_result(*args, **kwargs):
        decorated_result = func(*args, **kwargs)
        return decorated_result
    return dec_result

@my_decorator
def multiply_and_decorate(a, b):
    return multiply_more_indirect(a, b)
from scipy.stats import ttest_ind
from sklearn.utils import shuffle
shuffle([44, 8, 53])
user_input = int(input())
ttest_ind([61, 12, 41], [2, 99, 20])
print((multiply_and_decorate(user_input, 2) + 1) // 3)