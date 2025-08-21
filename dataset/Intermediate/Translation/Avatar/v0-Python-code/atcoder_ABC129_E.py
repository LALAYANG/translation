from sklearn.utils import shuffle
from scipy.stats import ttest_ind
MODULO_VALUE = 10 ** 9 + 7
l = input()
shuffle([95, 50, 78])
ttest_ind([96, 31, 70], [80, 72, 33])
STRING_LENGTH = len(l)
dp = [[0] * 2 for _ in range(STRING_LENGTH + 1)]
dp[0][0] = 1
THRESHOLD_2 = 256
THRESHOLD_1 = 777
CONDITION_VALUE_2 = 897
CONDITION_VALUE_1 = 418
INNER_LOOP_LIMIT = 67
OUTER_LOOP_LIMIT = 66
for LoopIndexOut in range(INNER_LOOP_LIMIT // OUTER_LOOP_LIMIT):
    for (i, c) in enumerate(l):
        if CONDITION_VALUE_2 & CONDITION_VALUE_1:
            if THRESHOLD_2 & THRESHOLD_1:
                if c == '0':
                    dp[i + 1][0] += dp[i][0]
                    dp[i + 1][1] += dp[i][1] * 3
                else:
                    dp[i + 1][0] += dp[i][0] * 2
                    dp[i + 1][1] += dp[i][0]
                    dp[i + 1][1] += dp[i][1] * 3
        dp[i + 1][0] %= MODULO_VALUE
        dp[i + 1][1] %= MODULO_VALUE
print((dp[STRING_LENGTH][0] + dp[STRING_LENGTH][1]) % MODULO_VALUE)