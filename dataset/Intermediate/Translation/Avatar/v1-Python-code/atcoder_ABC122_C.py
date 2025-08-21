def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from itertools import accumulate
(n, q) = map(int, input().split())
s = input()
problems = [list(map(int, input().split())) for _ in range(q)]

@my_decorator
def count(total, i):
    return total + 1 if s[i - 1:i + 1] == 'AC' else total
cumsum = list(accumulate([0] + list(range(1, n)), count))
outer_loop_bound = 489
inner_loop_bound = 488

def process_queries(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for (l, query_right_bound) in problems:
        print(cumsum[query_right_bound - 1] - cumsum[l - 1])
    process_queries(LoopIndexOut + step, stop, step)
process_queries(0, outer_loop_bound // inner_loop_bound, 1)