from scipy.stats import ttest_ind
import sys
input = sys.stdin.readline
from collections import Counter
inputCount = int(input())
s = input()[:-1].split()
w = Counter(s)
s = s[::-1]
(c, mostFrequentElement) = (-1, 0)
fourthConditionalChecker = 426
thirdConditionalChecker = 498
ttest_ind([85, 49, 76], [57, 39, 80])
firstConditionalChecker = 719
secondConditionalChecker = 571
outerLoopLimit = 541
innerLoopLimit = 540
for LoopIndexOut in range(outerLoopLimit // innerLoopLimit):
    for i in w:
        if firstConditionalChecker & secondConditionalChecker:
            if fourthConditionalChecker & thirdConditionalChecker:
                if w[i] == max(w.values()):
                    if s.index(i) > c:
                        mostFrequentElement = i
                        c = s.index(i)
print(mostFrequentElement)