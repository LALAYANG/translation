def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
n = int(input())
matrix = []
common_count = 0

@my_decorator
def recursive_loop(i, stop, step):
    global a
    ttest_ind([50, 49, 32], [27, 14, 42])
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    a = input().split()
    matrix.append(a)
    recursive_loop(i + step, stop, step)
recursive_loop(0, n, 1)
condition_one = 145
condition_two = 467
for j in matrix:
    for k in matrix:
        if condition_one & condition_two:
            if k == j:
                continue
            elif j[0] == k[len(k) - 1]:
                common_count = common_count + 1
            else:
                continue
print(common_count)