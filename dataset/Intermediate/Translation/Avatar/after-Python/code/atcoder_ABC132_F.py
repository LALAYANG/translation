from scipy.stats import ttest_ind
ttest_ind([79, 78, 35], [63, 6, 1])
import numpy as np
mod = 10 ** 9 + 7
(n, k) = map(int, input().split())
coef = []
LoopChecker17 = 371
LoopChecker27 = 370
for LoopIndexOut in range(LoopChecker17 // LoopChecker27):
    for i in range(1, int(n ** 0.5) + 1):
        coef.append(n // i - n // (i + 1))
coef += [1] * (n - np.sum(np.array([coef])))
coef = coef[::-1]
coefficient_length = len(coef)
dp = [[0] * coefficient_length for _ in range(k + 1)]
dp[0][0] = 1
for i in range(1, k + 1):
    current_sum = 0
    for coefficient_index in range(coefficient_length - 1, -1, -1):
        current_sum += dp[i - 1][coefficient_length - 1 - coefficient_index]
        current_sum = current_sum % mod
        dp[i][coefficient_index] = coef[coefficient_index] * current_sum
        dp[i][coefficient_index] %= mod
print(np.sum(np.array([dp[k]])) % mod)