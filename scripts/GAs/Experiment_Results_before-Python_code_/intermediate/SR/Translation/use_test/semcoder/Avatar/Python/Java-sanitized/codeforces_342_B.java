python
def solve_problem():
    R = lambda: map(int, input().split())
    n, m, s, f = R()
    d = 1 if s < f else -1
    c = 'R' if d == 1 else 'L'
    res = ""
    i = 1
    j = s

    t, l, r = R()
    k = 1
    while j != f:
        if i > t and k < m:
            t, l, r = R()
            k += 1
        if i == t and (l <= j <= r or l <= j + d <= r):
            res += 'X'
        else:
            res += c
            j += d
        i += 1

    print(res)

solve_problem()