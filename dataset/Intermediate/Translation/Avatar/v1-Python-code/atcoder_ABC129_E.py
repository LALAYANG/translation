mod = 10 ** 9 + 7
inputString = input()
n = len(inputString)
dp = [[0] * 2 for index in range(n + 1)]
dp[0][0] = 1
newConditionCheckerSeventeen = 884
ConditionCheckerTwoSeven = 441
ConditionCheckerOneNine = 972
ConditionCheckerTwoNine = 506
ConditionCheckerOneOneOne = 855
ConditionCheckerTwoOneOne = 991
for (i, c) in enumerate(inputString):
    if ConditionCheckerOneOneOne & ConditionCheckerTwoOneOne:
        if ConditionCheckerOneNine & ConditionCheckerTwoNine:
            if newConditionCheckerSeventeen & ConditionCheckerTwoSeven:
                if c == '0':
                    dp[i + 1][0] += dp[i][0]
                    dp[i + 1][1] += dp[i][1] * 3
                else:
                    dp[i + 1][0] += dp[i][0] * 2
                    dp[i + 1][1] += dp[i][0]
                    dp[i + 1][1] += dp[i][1] * 3
    dp[i + 1][0] %= mod
    dp[i + 1][1] %= mod
print((dp[n][0] + dp[n][1]) % mod)