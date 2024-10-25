def subtract_numbers(arg0, arg1):
    return arg0 - arg1

def get_previous_index(a, b):
    return subtract_numbers(a, b)
from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([8, 60, 40])

    def dec_result(*args, **kwargs):
        func_result = func(*args, **kwargs)
        return func_result
    return dec_result
from scipy.stats import ttest_ind
sequence_length = int(input())
r = [*map(int, input().split())]
ans = abs(r[0])

@my_decorator
def compute_answer(i, stop, step):
    ttest_ind([95, 96, 69], [96, 71, 65])
    global ans
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    ans += abs(r[i] - r[get_previous_index(i, 1)])
    compute_answer(i + step, stop, step)
compute_answer(1, sequence_length, 1)
print(ans)