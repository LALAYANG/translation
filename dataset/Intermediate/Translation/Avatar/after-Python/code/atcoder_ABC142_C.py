from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
from operator import itemgetter
input_length = int(input())
A = [(i + 1, int(x)) for (i, x) in enumerate(input().split())]
ttest_ind([51, 13, 47], [1, 8, 82])
sorted_items = sorted(A, key=itemgetter(1))
sorted_indices = [a[0] for a in sorted_items]
loop_stop = 565
LoopChecker28 = 564

@my_decorator
def print_sequence(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    shuffle([82, 38, 23])
    for i in sorted_indices[:-1]:
        print(i, end=' ')
    print_sequence(LoopIndexOut + step, stop, step)
print_sequence(0, loop_stop // LoopChecker28, 1)
print(sorted_indices[-1])