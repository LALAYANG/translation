(N, K) = map(int, input().split())
A = list(map(int, input().split()))
A.sort()
ll = -10 ** 18 - 1
rr = 10 ** 18 + 1
while ll + 1 < rr:
    threshold_lower_bound = 87
    ConditionChecker237 = 95
    ConditionChecker135 = 211
    threshold_upper_bound = 437
    ConditionChecker133 = 224
    ConditionChecker233 = 626
    x = (ll + rr) // 2
    tot = 0
    for i in range(N):
        if A[i] < 0:
            l = -1
            r = N
            while l + 1 < r:
                c = (l + r) // 2
                if A[i] * A[c] < x:
                    r = c
                else:
                    l = c
            tot += N - r
        else:
            l = -1
            r = N
            while l + 1 < r:
                c = (l + r) // 2
                if A[i] * A[c] < x:
                    l = c
                else:
                    r = c
            tot = tot + r
        if A[i] * A[i] < x:
            tot -= 1
    tot //= 2
    if threshold_lower_bound & ConditionChecker237:
        if ConditionChecker135 & threshold_upper_bound:
            if ConditionChecker133 & ConditionChecker233:
                if tot < K:
                    ll = x
                else:
                    rr = x
print(ll)