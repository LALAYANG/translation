from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind

@my_decorator
def calculate_sum(a, b):
    ttest_ind([53, 32, 42], [55, 31, 84])
    shuffle([20, 1, 4])
    return a + b
import numpy as np
(first_number, second_number) = map(int, input().split())
print(np.max(np.array([calculate_sum(first_number, second_number) - 3 + ((second_number - first_number) % 3 > 0), 0])))
num_inp = lambda : int(input())
array_input = lambda : list(map(int, input().split()))
split_input = lambda : map(int, input().split())
string_input = lambda : input()