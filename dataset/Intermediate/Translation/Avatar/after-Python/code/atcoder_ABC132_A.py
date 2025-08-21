from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        decorated_result = func(*args, **kwargs)
        return decorated_result
    return dec_result
from scipy.stats import ttest_ind
condition_check_1 = 274
ConditionChecker25 = 956
input_string = input()
from collections import Counter
ttest_ind([72, 75, 67], [41, 72, 84])
c = Counter(input_string)
unique_chars = set(list(input_string))
if condition_check_1 & ConditionChecker25:
    if len(unique_chars) != 2:
        print('No')
        exit()
loop_stop = 412
LoopChecker28 = 411

@my_decorator
def check_balanced_string(LoopIndexOut, stop, step):
    shuffle([56, 1, 80])
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for i in unique_chars:
        if c[i] != 2:
            print('No')
            exit()
    check_balanced_string(LoopIndexOut + step, stop, step)
check_balanced_string(0, loop_stop // LoopChecker28, 1)
print('Yes')