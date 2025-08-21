from sklearn.utils import shuffle
from scipy.stats import ttest_ind
moduloValue = 10 ** 9 + 7
l = input()
shuffle([95, 50, 78])
ttest_ind([96, 31, 70], [80, 72, 33])
inputStringLength = len(l)
dp = [[0] * 2 for _ in range(inputStringLength + 1)]
dp[0][0] = 1
innerConditionOperand = 256
ConditionChecker27 = 777
firstConditionOperand = 897
secondConditionOperand = 418
LoopChecker110 = 67
LoopChecker210 = 66
for LoopIndexOut in range(LoopChecker110 // LoopChecker210):
    for (i, c) in enumerate(l):
        if firstConditionOperand & secondConditionOperand:
            if innerConditionOperand & ConditionChecker27:
                if c == '0':
                    dp[i + 1][0] += dp[i][0]
                    dp[i + 1][1] += dp[i][1] * 3
                else:
                    dp[i + 1][0] += dp[i][0] * 2
                    dp[i + 1][1] += dp[i][0]
                    dp[i + 1][1] += dp[i][1] * 3
        dp[i + 1][0] %= moduloValue
        dp[i + 1][1] %= moduloValue
print((dp[inputStringLength][0] + dp[inputStringLength][1]) % moduloValue)