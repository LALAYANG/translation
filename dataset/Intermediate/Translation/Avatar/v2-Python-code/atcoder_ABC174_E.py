def checkCondition(lis, k, mid):
    for i in lis:
        if i % mid == 0:
            k = k + 1
        k -= i // mid
    return k >= 0
(n, k) = map(int, input().split())
lis = list(map(int, input().split()))
(a, b) = (1, max(lis))
ans = b
while a <= b:
    remainderChecker = 7
    constantFive = 86
    constantTwo = 308
    constantOne = 583
    constantFour = 245
    constantThree = 358
    mid = (a + b) // 2
    if remainderChecker & constantFive:
        if constantTwo & constantOne:
            if constantFour & constantThree:
                if checkCondition(lis, k, mid):
                    ans = mid
                    b = mid - 1
                else:
                    a = mid + 1
print(ans)