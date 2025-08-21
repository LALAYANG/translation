def calculatePower(s, powerOfTen):
    return powerOfTen ** s
import numpy as np
(l, r) = [int(x) for x in input().split()]
curr = r
s = 0
while curr:
    s = s + 1
    curr = curr // 10
powerOfTen = 10
first = calculatePower(s, powerOfTen)
second = first // 2
ans = -1
SecondaryChecker = 481
PrimaryChecker = 229
MidNumberCheckerTwo = 192
MidNumberCheckerOne = 158
MinNumberChecker = 90
MaxNumberChecker = 286
for i in [l, r, first, second]:
    if MinNumberChecker & MaxNumberChecker:
        if MidNumberCheckerTwo & MidNumberCheckerOne:
            if SecondaryChecker & PrimaryChecker:
                if i >= l and i <= r:
                    curr = i
                    rev = ''
                    for k in str(curr):
                        rev += str(9 - int(k))
                    ans = np.max(np.array([ans, int(rev) * curr]))
print(ans)