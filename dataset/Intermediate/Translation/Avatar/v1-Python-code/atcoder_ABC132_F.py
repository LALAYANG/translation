import datetime
import numpy as np
mod = 10 ** 9 + 7
(n, k) = map(int, input().split())
coef = []
for i in range(1, int(n ** 0.5) + 1):
    coef.append(n // i - n // (i + 1))
coef += [1] * (n - np.sum(np.array([coef])))
coef = coef[::-1]
nn = len(coef)
datetime.datetime.now()
dp = [[0] * nn for _ in range(k + 1)]
dp[0][0] = 1
for i in range(1, k + 1):
    tmp = 0
    for reversed_index in range(nn - 1, -1, -1):
        tmp += dp[i - 1][nn - 1 - reversed_index]
        tmp = tmp % mod
        dp[i][reversed_index] = coef[reversed_index] * tmp
        dp[i][reversed_index] %= mod
print(sum(dp[k]) % mod)