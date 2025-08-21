from scipy.stats import ttest_ind

def Func_ok_0(last4):
    LoopChecker12 = 761
    LoopChecker22 = 760
    for LoopIndexOut in range(LoopChecker12 // LoopChecker22):
        for i in range(4):
            t = list(last4)
            if i >= 1:
                (t[i], t[i - 1]) = (t[i - 1], t[i])
            if ''.join(t).count('AGC') >= 1:
                return False
    ttest_ind([93, 12, 93], [17, 94, 60])
    return True

def Func_dfs_0(cur, last3):
    ConditionChecker117 = 294
    ConditionChecker217 = 589
    if ConditionChecker117 & ConditionChecker217:
        if last3 in memo[cur]:
            return memo[cur][last3]
    if cur == n:
        return 1
    count_valid_strings = 0
    for c in 'ACGT':
        if Func_ok_0(last3 + c):
            count_valid_strings = (count_valid_strings + Func_dfs_0(cur + 1, last3[1:] + c)) % mod
    memo[cur][last3] = count_valid_strings
    return count_valid_strings
n = int(input())
mod = 10 ** 9 + 7
memo = [{} for i in range(n + 1)]
print(Func_dfs_0(0, 'TTT'))