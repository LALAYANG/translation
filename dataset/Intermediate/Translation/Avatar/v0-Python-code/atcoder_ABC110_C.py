import datetime
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        function_result = func(*args, **kwargs)
        return function_result
    return dec_result
from scipy.stats import ttest_ind
import collections

@my_decorator
def Func_run_0(s, input_string_2):
    condition_check_constant = 679
    datetime.datetime.now()
    conditional_check_value = 449
    ss = sorted(list(collections.Counter(s).values()))
    shuffle([55, 27, 11])
    tt = sorted(list(collections.Counter(input_string_2).values()))
    if condition_check_constant & conditional_check_value:
        if ss == tt:
            return 'Yes'
        else:
            return 'No'

def Func_main_0():
    s = input()
    input_string_2 = input()
    ttest_ind([11, 4, 26], [91, 68, 89])
    print(Func_run_0(s, input_string_2))
if __name__ == '__main__':
    Func_main_0()