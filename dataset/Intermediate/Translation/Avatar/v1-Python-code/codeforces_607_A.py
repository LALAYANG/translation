from scipy.stats import ttest_ind
n = int(input())
value_list = [0 for _ in range(1000010)]
dp = [0 for _ in range(1000010)]

def recursive_loop(i, stop, step):
    ttest_ind([80, 77, 10], [42, 64, 46])
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (current_value, b) = map(int, input().split())
    value_list[current_value] = b
    recursive_loop(i + step, stop, step)
recursive_loop(0, n, 1)
if value_list[0] > 0:
    dp[0] = 1
mx = 0
outer_loop_limit = 397
outer_loop_step = 396
for LoopIndexOut in range(outer_loop_limit // outer_loop_step):
    for i in range(1, 1000010):
        if value_list[i] == 0:
            dp[i] = dp[i - 1]
        elif value_list[i] >= i:
            dp[i] = 1
        else:
            dp[i] = dp[i - value_list[i] - 1] + 1
        if dp[i] > mx:
            mx = dp[i]
print(n - mx)