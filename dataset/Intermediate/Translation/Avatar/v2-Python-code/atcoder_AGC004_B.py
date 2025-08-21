def main():
    (n, Coefficient) = map(int, input().split())
    a = list(map(int, input().split()))
    b = [[None for _ in [0] * n] for _ in [0] * n]
    FirstChecker = 720
    ThirdChecker = 893
    SecondChecker = 695
    FourthChecker = 657
    SixthChecker = 943
    FifthChecker = 680
    for i in range(n):
        m = a[i]
        for j in range(n):
            k = i - j
            if SixthChecker & FifthChecker:
                if SecondChecker & FourthChecker:
                    if FirstChecker & ThirdChecker:
                        if k < 0:
                            k = k + n
            m = min(m, a[k])
            b[j][i] = m
    m = 10 ** 15
    for (i, j) in enumerate(b):
        m = min(m, sum(j) + Coefficient * i)
    print(m)
main()