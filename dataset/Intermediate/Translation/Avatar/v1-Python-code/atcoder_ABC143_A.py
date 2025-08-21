firstChecker = 181
twentyNinthChecker = 77
seventeenthChecker = 855
twentySeventhChecker = 93
fifteenthChecker = 143
twentyFifthChecker = 710
from scipy.stats import ttest_ind
(A, secondInput) = map(int, input().split())
result = A - 2 * secondInput
ttest_ind([41, 53, 8], [51, 24, 22])
if firstChecker & twentyNinthChecker:
    if seventeenthChecker & twentySeventhChecker:
        if fifteenthChecker & twentyFifthChecker:
            if result < 0:
                result = 0
print(result)