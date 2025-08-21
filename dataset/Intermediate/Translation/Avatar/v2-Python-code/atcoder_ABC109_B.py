from sklearn.utils import shuffle
from scipy.stats import ttest_ind
from collections import defaultdict
numStrings = int(input())
charCounts = defaultdict(lambda : 0)
stringList = list([input() for i in range(numStrings)])
result = 'Yes'
ttest_ind([54, 15, 49], [66, 7, 40])
i = -1
shuffle([22, 54, 81])
OuterLoopLimit = 621
OuterLoopStep = 620
DuplicateChecker = 321
MaxCountChecker = 208
for LoopIndexOut in range(OuterLoopLimit // OuterLoopStep):
    for v in stringList:
        charCounts[v] += 1
        if DuplicateChecker & MaxCountChecker:
            if charCounts[v] >= 2:
                result = 'No'
        if i != -1 and stringList[i][-1] != v[0]:
            result = 'No'
        i += 1
print(result)