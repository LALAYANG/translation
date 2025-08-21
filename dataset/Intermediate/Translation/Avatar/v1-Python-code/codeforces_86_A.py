def calculatePower(s, baseValue):
    return baseValue ** s
(l, r) = [int(x) for x in input().split()]
curr = r
s = 0
while curr:
    s = s + 1
    curr = curr // 10
baseValue = 10
first = calculatePower(s, baseValue)
second = first // 2
ans = -1
maximumValue = 150
minimumValue = 190
firstChecker = 706
secondChecker = 576
thirdChecker = 208
forthChecker = 542
for i in [l, r, first, second]:
    if thirdChecker & forthChecker:
        if firstChecker & secondChecker:
            if maximumValue & minimumValue:
                if i >= l and i <= r:
                    curr = i
                    rev = ''
                    for k in str(curr):
                        rev += str(9 - int(k))
                    ans = max(ans, int(rev) * curr)
print(ans)