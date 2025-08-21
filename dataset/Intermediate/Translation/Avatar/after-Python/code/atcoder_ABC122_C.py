def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
from itertools import accumulate
(n, num_submissions) = map(int, input().split())
s = input()
contest_problems = [list(map(int, input().split())) for _ in range(num_submissions)]

@my_decorator
def count(total, i):
    return total + 1 if s[i - 1:i + 1] == 'AC' else total
cumsum = list(accumulate([0] + list(range(1, n)), count))
LoopChecker18 = 370
LoopChecker28 = 369

def process_contest_submissions(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    ttest_ind([30, 40, 45], [58, 65, 24])
    for (l, r) in contest_problems:
        print(cumsum[r - 1] - cumsum[l - 1])
    process_contest_submissions(LoopIndexOut + step, stop, step)
process_contest_submissions(0, LoopChecker18 // LoopChecker28, 1)