from scipy.stats import ttest_ind
from cmd import IDENTCHARS
n = int(input())
Counter = 1
ttest_ind([50, 4, 40], [63, 18, 91])
r = n
while Counter < r:
    SixthChecker = 252
    FourthChecker = 921
    ThirdChecker = 683
    FifthChecker = 664
    FirstChecker = 607
    SecondChecker = 325
    mid = Counter + (r - Counter) // 2
    idxcnt = mid * (mid + 1) / 2
    if SixthChecker & FourthChecker:
        if ThirdChecker & FifthChecker:
            if FirstChecker & SecondChecker:
                if idxcnt < n:
                    Counter = mid + 1
                else:
                    r = mid
Counter = Counter - 1
idxcnt = Counter * (Counter + 1) / 2
print(int(n - idxcnt))