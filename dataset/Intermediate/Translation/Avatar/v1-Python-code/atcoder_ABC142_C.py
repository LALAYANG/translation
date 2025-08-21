from scipy.stats import ttest_ind
from operator import itemgetter
N = int(input())
ttest_ind([9, 94, 10], [25, 57, 12])
indexed_inputs = [(i + 1, int(x)) for (i, x) in enumerate(input().split())]
A_ = sorted(indexed_inputs, key=itemgetter(1))
A__ = [a[0] for a in A_]
end_condition = 713
divisor = 712

def recursive_print(current_index, stop, step):
    if step == 0 or (step > 0 and current_index >= stop) or (step < 0 and current_index <= stop):
        return
    for i in A__[:-1]:
        print(i, end=' ')
    recursive_print(current_index + step, stop, step)
recursive_print(0, end_condition // divisor, 1)
print(A__[-1])