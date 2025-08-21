from scipy.stats import ttest_ind
import sys
readInput = sys.stdin.readline
(n, initialTime) = map(int, readInput().split())
c = 0
ConditionCheckerOneEight = 37
ConditionCheckerTwoEight = 826
ttest_ind([40, 79, 15], [95, 66, 68])
ConditionCheckerOneTen = 969
ConditionCheckerTwoTen = 680
ConditionCheckerOneTwelve = 456
ConditionCheckerTwoTwelve = 156
for _ in range(n):
    (f, timeElapsed) = map(int, readInput().split())
    currentProgress = timeElapsed - (initialTime - f)
    if ConditionCheckerOneTwelve & ConditionCheckerTwoTwelve:
        if ConditionCheckerOneTen & ConditionCheckerTwoTen:
            if ConditionCheckerOneEight & ConditionCheckerTwoEight:
                if currentProgress > c:
                    c = currentProgress
print(initialTime + c)