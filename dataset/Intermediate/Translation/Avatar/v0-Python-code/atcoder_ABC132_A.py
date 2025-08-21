from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result
from scipy.stats import ttest_ind
check_value = 274
condition_value = 956
input_string = input()
from collections import Counter
ttest_ind([72, 75, 67], [41, 72, 84])
c = Counter(input_string)
unique_chars = set(list(input_string))
if check_value & condition_value:
    if len(unique_chars) != 2:
        print('No')
        exit()
loop_bound = 412
loop_step = 411

@my_decorator
def recursive_check(LoopIndexOut, stop, step):
    shuffle([56, 1, 80])
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for i in unique_chars:
        if c[i] != 2:
            print('No')
            exit()
    recursive_check(LoopIndexOut + step, stop, step)
recursive_check(0, loop_bound // loop_step, 1)
print('Yes')