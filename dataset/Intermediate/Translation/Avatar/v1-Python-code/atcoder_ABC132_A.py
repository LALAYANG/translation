from scipy.stats import ttest_ind
conditionChecker = 762
secondConditionChecker = 338
S = input()
from collections import Counter
c = Counter(S)
uniqueChars = set(list(S))
if conditionChecker & secondConditionChecker:
    if len(uniqueChars) != 2:
        print('No')
        exit()
loopLimit = 198
loopCounter = 197
ttest_ind([28, 91, 52], [89, 49, 58])

def recursiveFunction(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for i in uniqueChars:
        if c[i] != 2:
            print('No')
            exit()
    recursiveFunction(LoopIndexOut + step, stop, step)
recursiveFunction(0, loopLimit // loopCounter, 1)
print('Yes')