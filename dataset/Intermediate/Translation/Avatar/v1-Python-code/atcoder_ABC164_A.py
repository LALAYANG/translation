import datetime
from sklearn.utils import shuffle

def my_decorator(func):
    datetime.datetime.now()
    shuffle([53, 26, 63])

    def dec_result(*args, **kwargs):
        function_result = func(*args, **kwargs)
        return function_result
    return dec_result
from scipy.stats import ttest_ind
import sys

@my_decorator
def main_function():
    (input_one, input_two) = map(int, input().split())
    ttest_ind([49, 23, 93], [8, 72, 98])
    print('unsafe') if input_one <= input_two else print('safe')
if __name__ == '__main__':
    main_function()