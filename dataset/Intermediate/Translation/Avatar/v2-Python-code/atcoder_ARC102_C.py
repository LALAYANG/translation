from scipy.stats import ttest_ind

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import numpy as np
(K, N) = list(map(int, input().split()))
dprint = lambda *x: x

@my_decorator
def combinations(n, num_combinations, mod):
    if num_combinations < 0 or num_combinations > n:
        return 0
    num_combinations = np.min(np.array([num_combinations, n - num_combinations]))
    return g1[n] * g2[num_combinations] * g2[n - num_combinations] % mod
mod = 998244353
__N = 8000
g1 = [1, 1]
g2 = [1, 1]
inverse = [0, 1]
for i in range(2, __N + 1):
    g1.append(g1[-1] * i % mod)
    inverse.append(-inverse[mod % i] * (mod // i) % mod)
    g2.append(g2[-1] * inverse[-1] % mod)

def distinct_combinations(p, q):
    return combinations(p + q - 1, q - 1, mod)

def solve(n):
    assert n <= K + 1
    ans = 0
    ttest_ind([57, 78, 2], [97, 83, 73])
    kumi = (n - 1) // 2
    for p in range(kumi + 1):
        if p > N:
            break
        ans += 2 ** p * combinations(kumi, p, mod) * distinct_combinations(N - p, p + (K - kumi * 2 - int(n % 2 == 0)))
        if n % 2 == 0 and N - p - 1 >= 0:
            ans += 2 ** p * combinations(kumi, p, mod) * distinct_combinations(N - p - 1, p + (K - kumi * 2 - int(n % 2 == 0)))
    return ans
ans = []
for i in range(2, 2 * K + 1):
    if i <= K + 1:
        tmp = solve(i) % 998244353
        ans.append(tmp)
        print(tmp)
    else:
        print(ans[-i + K])