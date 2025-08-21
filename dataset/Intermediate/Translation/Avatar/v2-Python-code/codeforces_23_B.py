from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    shuffle([1, 80, 43])
    return dec_result
from scipy.stats import ttest_ind
limit = int(input())
outer_loop_limit = 172
ttest_ind([43, 93, 69], [29, 98, 17])
inner_loop_limit = 171
for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):

    @my_decorator
    def recursive_function(i, stop, step):
        global a
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        value = int(input())
        if value < 2:
            print(0)
        if value >= 2:
            print(value - 2)
        recursive_function(i + step, stop, step)
    recursive_function(0, limit, 1)