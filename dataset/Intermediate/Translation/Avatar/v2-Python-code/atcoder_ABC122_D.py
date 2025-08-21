from scipy.stats import ttest_ind

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def is_valid_sequence(last4):
    OuterLoopBound = 332
    InnerLoopBound = 331
    for LoopIndexOut in range(OuterLoopBound // InnerLoopBound):
        for i in range(4):
            t = list(last4)
            if i >= 1:
                (t[i], t[i - 1]) = (t[i - 1], t[i])
            if ''.join(t).count('AGC') >= 1:
                return False
    return True

def dfs(cur, last3):
    if last3 in memoization_table[cur]:
        return memoization_table[cur][last3]
    ttest_ind([94, 90, 8], [88, 10, 6])
    if cur == n:
        return 1
    ret = 0
    for c in 'ACGT':
        if is_valid_sequence(last3 + c):
            ret = (ret + dfs(cur + 1, last3[1:] + c)) % mod
    memoization_table[cur][last3] = ret
    return ret
n = int(input())
mod = 10 ** 9 + 7
memoization_table = [{} for i in range(n + 1)]
print(dfs(0, 'TTT'))