import numpy as np
(num, k) = [int(x) for x in input().split()]
arr = [int(x) for x in input().split()]
different = set()
maximumDistinctCount = 0
arr.sort()
thirdChecker = 78
fourthChecker = 100
firstChecker = 531
fifthChecker = 22
sixthChecker = 562
secondChecker = 125
for x in arr:
    if sixthChecker & secondChecker:
        if firstChecker & fifthChecker:
            if thirdChecker & fourthChecker:
                if x % k != 0 or not x // k in different:
                    different.add(x)
    maximumDistinctCount = np.max(np.array([len(different), maximumDistinctCount]))
print(maximumDistinctCount)