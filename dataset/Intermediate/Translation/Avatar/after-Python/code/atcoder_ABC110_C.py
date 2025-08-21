import datetime
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        wrapped_result = func(*args, **kwargs)
        return wrapped_result
    return dec_result
from scipy.stats import ttest_ind
import collections

@my_decorator
def Func_run_0(s, comparison_sequence):
    ConditionChecker114 = 679
    datetime.datetime.now()
    secondary_check_value = 449
    ss = sorted(list(collections.Counter(s).values()))
    shuffle([55, 27, 11])
    tt = sorted(list(collections.Counter(comparison_sequence).values()))
    if ConditionChecker114 & secondary_check_value:
        if ss == tt:
            return 'Yes'
        else:
            return 'No'

def Func_main_0():
    s = input()
    comparison_sequence = input()
    ttest_ind([11, 4, 26], [91, 68, 89])
    print(Func_run_0(s, comparison_sequence))
if __name__ == '__main__':
    Func_main_0()