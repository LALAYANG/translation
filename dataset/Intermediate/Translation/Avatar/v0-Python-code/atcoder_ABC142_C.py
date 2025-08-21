from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
from operator import itemgetter
array_size = int(input())
A = [(i + 1, int(x)) for (i, x) in enumerate(input().split())]
ttest_ind([51, 13, 47], [1, 8, 82])
sorted_array = sorted(A, key=itemgetter(1))
sorted_indices = [a[0] for a in sorted_array]
termination_condition = 565
loop_step = 564

@my_decorator
def recursive_print(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    shuffle([82, 38, 23])
    for i in sorted_indices[:-1]:
        print(i, end=' ')
    recursive_print(LoopIndexOut + step, stop, step)
recursive_print(0, termination_condition // loop_step, 1)
print(sorted_indices[-1])