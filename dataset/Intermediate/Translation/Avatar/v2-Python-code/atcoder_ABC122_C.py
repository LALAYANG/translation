def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from itertools import accumulate
(n, q) = map(int, input().split())
s = input()
problems = [list(map(int, input().split())) for queryIndex in range(q)]

@my_decorator
def count(total, i):
    return total + 1 if s[i - 1:i + 1] == 'AC' else total
cumsum = list(accumulate([0] + list(range(1, n)), count))
outerLoopCounter = 363
innerLoopLimit = 362

def processQueries(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for (l, r) in problems:
        print(cumsum[r - 1] - cumsum[l - 1])
    processQueries(LoopIndexOut + step, stop, step)
processQueries(0, outerLoopCounter // innerLoopLimit, 1)