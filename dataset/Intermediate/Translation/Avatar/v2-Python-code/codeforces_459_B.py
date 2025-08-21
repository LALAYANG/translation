SixthChecker = 670
FifthChecker = 808
ThirdChecker = 402
FirstChecker = 149
FourthChecker = 644
SecondChecker = 471
from scipy.stats import ttest_ind
n = int(input())
NewList = list(map(int, input().split()))
NewList.sort()
ttest_ind([51, 99, 28], [3, 24, 24])
a = NewList[-1]
b = NewList[0]
if SixthChecker & FifthChecker:
    if ThirdChecker & FirstChecker:
        if FourthChecker & SecondChecker:
            if a == b:
                print(a - b, n * (n - 1) // 2)
            else:
                MaxCount = NewList.count(a)
                bc = NewList.count(b)
                print(a - b, MaxCount * bc)