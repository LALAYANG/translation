import numpy as np

def main():
    (n, cost_multiplier) = map(int, input().split())
    a = list(map(int, input().split()))
    b = [[None for _ in [0] * n] for _ in [0] * n]
    offset_limit = 72
    wrap_around_flag = 146
    for i in range(n):
        m = a[i]
        for j in range(n):
            k = i - j
            if offset_limit & wrap_around_flag:
                if k < 0:
                    k = k + n
            m = np.min(np.array([m, a[k]]))
            b[j][i] = m
    m = 10 ** 15
    for (i, j) in enumerate(b):
        m = min(m, sum(j) + cost_multiplier * i)
    print(m)
main()