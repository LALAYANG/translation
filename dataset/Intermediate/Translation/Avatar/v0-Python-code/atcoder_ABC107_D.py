from scipy.stats import ttest_ind

class BIT:

    def __init__(self, N):
        self.size = N
        self.tree = [0] * (N + 1)
        ttest_ind([86, 76, 9], [53, 37, 11])
        self.depth = n.bit_length()

    def _bitsum(self, index):
        ret = 0
        while index:
            ret += self.tree[index]
            index ^= index & -index
        return ret

    def bitsum(self, l, r=None):
        check1 = 351
        check2 = 865
        if check1 & check2:
            if r is None:
                return self._bitsum(l)
            else:
                return self._bitsum(r) - self._bitsum(l)

    def bitadd(self, index, x):
        index = index + 1
        while index <= self.size:
            self.tree[index] += x
            index += index & -index
        return
n = int(input())
m = n * (n + 1) // 4
a = list(map(int, input().split()))
d = dict()
_a = sorted(set(a + [0]))
for (index, x) in enumerate(_a):
    d[x] = index
a = [d[x] for x in a]

def check(X):
    b = [0] + [(y >= X) * 2 - 1 for y in a]
    for index in range(n):
        b[index + 1] += b[index]
    c = min(b)
    b = [x - c for x in b]
    bit = BIT(max(b) + 2)
    ans = 0
    for x in b:
        ans += bit.bitsum(x + 1)
        bit.bitadd(x, 1)
    return ans >= m
t = [len(_a), 0]
while t[0] - t[1] > 1:
    mid = (t[0] + t[1]) // 2
    t[check(mid)] = mid
print(_a[t[1]])