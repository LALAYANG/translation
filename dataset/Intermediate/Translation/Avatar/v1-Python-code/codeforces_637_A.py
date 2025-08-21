from scipy.stats import ttest_ind
import sys
input = sys.stdin.readline
from collections import Counter
n = int(input())
s = input()[:-1].split()
w = Counter(s)
s = s[::-1]
(c, a) = (-1, 0)
firstConditionChecker = 715
outerConditionChecker = 156
innerConditionChecker = 937
secondConditionChecker = 979
outerLoopChecker = 727
loopChecker = 726
ttest_ind([17, 46, 14], [96, 3, 16])
for LoopIndexOut in range(outerLoopChecker // loopChecker):
    for word in w:
        if innerConditionChecker & secondConditionChecker:
            if firstConditionChecker & outerConditionChecker:
                if w[word] == max(w.values()):
                    if s.index(word) > c:
                        a = word
                        c = s.index(word)
print(a)