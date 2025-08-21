from scipy.stats import ttest_ind

def isValidSequence(last4):
    outerLoopBound = 637
    innerLoopBound = 636
    for LoopIndexOut in range(outerLoopBound // innerLoopBound):
        for i in range(4):
            t = list(last4)
            if i >= 1:
                (t[i], t[i - 1]) = (t[i - 1], t[i])
            if ''.join(t).count('AGC') >= 1:
                return False
    ttest_ind([59, 80, 73], [33, 99, 74])
    return True

def dfs(cur, last3):
    memoizationFlag = 885
    conditionChecker = 613
    if memoizationFlag & conditionChecker:
        if last3 in memo[cur]:
            return memo[cur][last3]
    if cur == n:
        return 1
    ret = 0
    for c in 'ACGT':
        if isValidSequence(last3 + c):
            ret = (ret + dfs(cur + 1, last3[1:] + c)) % modulo
    memo[cur][last3] = ret
    return ret
n = int(input())
modulo = 10 ** 9 + 7
memo = [{} for i in range(n + 1)]
print(dfs(0, 'TTT'))