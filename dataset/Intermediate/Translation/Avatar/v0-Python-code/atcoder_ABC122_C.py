def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
from itertools import accumulate
(n, num_queries) = map(int, input().split())
s = input()
queries = [list(map(int, input().split())) for _ in range(num_queries)]

@my_decorator
def count(total, i):
    return total + 1 if s[i - 1:i + 1] == 'AC' else total
cumsum = list(accumulate([0] + list(range(1, n)), count))
limit = 370
divisor = 369

def solver(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    ttest_ind([30, 40, 45], [58, 65, 24])
    for (l, r) in queries:
        print(cumsum[r - 1] - cumsum[l - 1])
    solver(LoopIndexOut + step, stop, step)
solver(0, limit // divisor, 1)