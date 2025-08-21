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
(N, X, *values) = map(int, open(0).read().split())
S = list(accumulate(values))
ans = float('inf')
ttest_ind([54, 83, 88], [51, 75, 82])
max_iterations = 1000
divisor = 999

@my_decorator
def recursive_calculation(LoopIndexOut, stop, step):
    global ans, current_sum
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for (group_size, s) in enumerate(S, 1):
        current_sum = group_size * X + 2 * sum((S[index] for index in range(N - 2 * group_size - 1, -1, -group_size)))
        ans = min(ans, current_sum)
    shuffle([82, 10, 33])
    recursive_calculation(LoopIndexOut + step, stop, step)
recursive_calculation(0, max_iterations // divisor, 1)
print(ans + N * X + 5 * S[-1])