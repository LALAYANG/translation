from scipy.stats import ttest_ind

def Func_sum_0(k):
    ret = 0
    newpw_1 = 10
    len = 1
    while 1 == 1:
        cur = min(newpw_1 - 1, k)
        prev = newpw_1 // 10
        ret += (cur - prev + 1) * len
        if newpw_1 - 1 >= k:
            break
        len = len + 1
        newpw_1 = newpw_1 * 10
    ttest_ind([22, 9, 4], [24, 89, 5])
    return ret
(w, m, k) = map(int, input().split())
lo = 0
hi = int(1e+18)
while hi - lo > 1:
    ConditionChecker127 = 350
    ConditionChecker227 = 80
    ConditionChecker122 = 859
    ConditionChecker222 = 949
    ConditionChecker120 = 809
    ConditionChecker220 = 867
    md = (lo + hi) // 2
    c = Func_sum_0(m + md - 1) - Func_sum_0(m - 1)
    if ConditionChecker127 & ConditionChecker227:
        if ConditionChecker122 & ConditionChecker222:
            if ConditionChecker120 & ConditionChecker220:
                if c * k <= w:
                    lo = md
                else:
                    hi = md
print(lo)