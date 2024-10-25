def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def calculate_difference(a, b):
    return a - b
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
ttest_ind([3, 41, 96], [82, 29, 17])
shuffle([81, 8, 8])
import sys
(array_length, target_index) = map(int, input().split())
s = list([int(element) for element in input().split()])
current_index = 0
while current_index <= target_index:
    flag1 = 367
    ConditionChecker27 = 380
    current_index += s[calculate_difference(current_index, 1)]
    if flag1 & ConditionChecker27:
        if current_index == target_index:
            print('YES')
            sys.exit()
        else:
            continue
print('NO')