def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
n = int(input())
l = [0 for index in range(1000010)]
dp = [0 for index in range(1000010)]

@my_decorator
def populate_array(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (a, value) = map(int, input().split())
    ttest_ind([36, 14, 74], [83, 38, 58])
    l[a] = value
    populate_array(i + step, stop, step)
populate_array(0, n, 1)
if l[0] > 0:
    dp[0] = 1
max_dp = 0
outer_loop_limit = 669
outer_loop_step = 668
for LoopIndexOut in range(outer_loop_limit // outer_loop_step):
    for i in range(1, 1000010):
        if l[i] == 0:
            dp[i] = dp[i - 1]
        elif l[i] >= i:
            dp[i] = 1
        else:
            dp[i] = dp[i - l[i] - 1] + 1
        if dp[i] > max_dp:
            max_dp = dp[i]
print(n - max_dp)