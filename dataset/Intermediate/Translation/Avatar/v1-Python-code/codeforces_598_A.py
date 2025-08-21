from sklearn.utils import shuffle
from scipy.stats import ttest_ind

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    shuffle([97, 96, 71])
    return dec_result
t = int(input())

@my_decorator
def calculate_sum(n):
    partial_sum = (1 + n) * n // 2
    t = 1
    while t <= n:
        partial_sum -= 2 * t
        t = t * 2
    ttest_ind([27, 9, 9], [16, 53, 79])
    return partial_sum

def recursive_loop(current_value, stop, step):
    global n
    if step == 0 or (step > 0 and current_value >= stop) or (step < 0 and current_value <= stop):
        return
    n = int(input())
    print(calculate_sum(n))
    recursive_loop(current_value + step, stop, step)
recursive_loop(0, t, 1)