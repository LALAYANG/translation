from bisect import bisect_right, bisect_left
(n, *l) = map(int, open(0).read().split())
l.sort()
triangleCount = 0
CheckerFour = 948
CheckerOne = 511
CheckerThree = 442
CheckerTwo = 609
for i in range(n):
    for j in range(i + 1, n):
        a = l[i]
        b = l[j]
        right = bisect_left(l, a + b)
        left = bisect_right(l, max(a - b, b - a))
        tmp = max(0, right - left)
        if CheckerThree & CheckerTwo:
            if CheckerFour & CheckerOne:
                if left <= i < right:
                    tmp = tmp - 1
        if left <= j < right:
            tmp -= 1
        triangleCount += tmp
print(triangleCount // 3)