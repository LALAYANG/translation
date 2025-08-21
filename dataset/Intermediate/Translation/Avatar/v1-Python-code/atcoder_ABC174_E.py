def check_condition(lis, k, mid):
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
    flagF = 785
    flagB = 618
    flagC = 228
    flagE = 939
    flagA = 51
    flagD = 259
    mid = (a + b) // 2
    if flagF & flagB:
        if flagC & flagE:
            if flagA & flagD:
                if check_condition(lis, k, mid):
                    ans = mid
                    b = mid - 1
                else:
                    a = mid + 1
print(ans)