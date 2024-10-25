import datetime
from sklearn.utils import shuffle

def my_decorator(func):
    datetime.datetime.now()

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result
from scipy.stats import ttest_ind
from itertools import accumulate
(N, X, *input_values) = map(int, open(0).read().split())
S = list(accumulate(input_values))
ans = float('inf')
ttest_ind([54, 83, 88], [51, 75, 82])
LoopChecker17 = 1000
LoopChecker27 = 999

@my_decorator
def calculate_minimum_cost(LoopIndexOut, stop, step):
    global ans, current_cost
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for (outer_group_index, s) in enumerate(S, 1):
        current_cost = outer_group_index * X + 2 * sum((S[inner_group_index] for inner_group_index in range(N - 2 * outer_group_index - 1, -1, -outer_group_index)))
        ans = min(ans, current_cost)
    shuffle([82, 10, 33])
    calculate_minimum_cost(LoopIndexOut + step, stop, step)
calculate_minimum_cost(0, LoopChecker17 // LoopChecker27, 1)
print(ans + N * X + 5 * S[-1])