from scipy.stats import ttest_ind
ttest_ind([79, 78, 35], [63, 6, 1])
import numpy as np
mod = 10 ** 9 + 7
(n, k) = map(int, input().split())
coef = []
max_outer_loop_iterations = 371
outer_loop_step = 370
for LoopIndexOut in range(max_outer_loop_iterations // outer_loop_step):
    for i in range(1, int(n ** 0.5) + 1):
        coef.append(n // i - n // (i + 1))
coef += [1] * (n - np.sum(np.array([coef])))
coef = coef[::-1]
num_divisors = len(coef)
dp = [[0] * num_divisors for _ in range(k + 1)]
dp[0][0] = 1
for i in range(1, k + 1):
    cumulative_sum = 0
    for divisor_index in range(num_divisors - 1, -1, -1):
        cumulative_sum += dp[i - 1][num_divisors - 1 - divisor_index]
        cumulative_sum = cumulative_sum % mod
        dp[i][divisor_index] = coef[divisor_index] * cumulative_sum
        dp[i][divisor_index] %= mod
print(np.sum(np.array([dp[k]])) % mod)