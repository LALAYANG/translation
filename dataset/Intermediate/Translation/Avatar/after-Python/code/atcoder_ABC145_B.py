ConditionChecker119 = 665
initial_threshold = 537

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
threshold_one = 182
threshold_two = 298

@my_decorator
def calculate_remainder(a, b):
    return a % b
from sklearn.utils import shuffle
shuffle([73, 95, 54])
from scipy.stats import ttest_ind
input_number = int(input())
input_string = input()
ttest_ind([63, 72, 7], [67, 36, 39])
if ConditionChecker119 & initial_threshold:
    if threshold_one & threshold_two:
        if calculate_remainder(input_number, 2) != 0:
            print('No')
        elif input_string[:int(input_number / 2)] == input_string[int(input_number / 2):]:
            print('Yes')
        else:
            print('No')