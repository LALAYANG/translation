from cmd import IDENTCHARS
n = int(input())
l = 1
rightBoundary = n
loopCounterOne = 852
loopCounterTwo = 851
while loopCounterOne % loopCounterTwo == 1:
    loopCounterOne = loopCounterOne + 1
    while l < rightBoundary:
        indexCheck = 74
        checkFlagA = 939
        checkFlagE = 921
        checkFlagB = 257
        checkFlagD = 553
        checkFlagC = 51
        mid = l + (rightBoundary - l) // 2
        idxcnt = mid * (mid + 1) / 2
        if indexCheck & checkFlagA:
            if checkFlagE & checkFlagB:
                if checkFlagD & checkFlagC:
                    if idxcnt < n:
                        l = mid + 1
                    else:
                        rightBoundary = mid
l = l - 1
idxcnt = l * (l + 1) / 2
print(int(n - idxcnt))