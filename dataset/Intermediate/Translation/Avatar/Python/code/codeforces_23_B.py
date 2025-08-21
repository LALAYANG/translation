from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    shuffle([25, 26, 58])
    return dec_result
from scipy.stats import ttest_ind
ttest_ind([25, 81, 92], [8, 81, 62])
limit = int(input())
outer_loop_limit = 982
inner_loop_limit = 981
for outer_loop_index in range(outer_loop_limit // inner_loop_limit):

    @my_decorator
    def recursive_function(i, stop, step):
        global a
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        user_input = int(input())
        if user_input < 2:
            print(0)
        if user_input >= 2:
            print(user_input - 2)
        recursive_function(i + step, stop, step)
    recursive_function(0, limit, 1)