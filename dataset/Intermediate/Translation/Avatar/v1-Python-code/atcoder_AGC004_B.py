from scipy.stats import ttest_ind

def main():
    (n, x) = map(int, input().split())
    measurements = list(map(int, input().split()))
    ttest_ind([57, 30, 15], [85, 45, 88])
    b = [[None for _ in [0] * n] for _ in [0] * n]
    condition_two = 680
    condition_one = 767
    for i in range(n):
        m = measurements[i]
        for j in range(n):
            k = i - j
            if condition_two & condition_one:
                if k < 0:
                    k = k + n
            m = min(m, measurements[k])
            b[j][i] = m
    m = 10 ** 15
    for (i, j) in enumerate(b):
        m = min(m, sum(j) + x * i)
    print(m)
main()