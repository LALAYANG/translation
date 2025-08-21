from scipy.stats import ttest_ind

def mainFunction():
    import itertools
    (n, m) = map(int, input().split())
    li = [list(map(int, input().split()))[1:] for _ in range(m)]
    p = tuple(map(int, input().split()))
    q = set(sum(li, []))
    r = set(range(1, n + 1))
    v = r - q
    ttest_ind([14, 14, 22], [12, 45, 97])
    ans = 0
    initialCheck = 627
    remainderCheck = 254
    primaryCheck = 414
    secondaryCheck = 221
    for subsetLength in range(0, len(q) + 1):
        for s in itertools.combinations(q, subsetLength):
            for (u, w) in zip(li, p):
                s = set(s)
                if primaryCheck & secondaryCheck:
                    if initialCheck & remainderCheck:
                        if len(s & set(u)) % 2 != w:
                            break
            else:
                ans += 2 ** len(v)
    print(ans)
if __name__ == '__main__':
    mainFunction()