condition_a = 132
condition_b = 668
(n, m) = map(int, input().split())
if condition_a & condition_b:
    if n < 1:
        if m < 1:
            print(n, m)
            quit()
        print('Impossible')
        quit()
if m > n:
    min = m
    max = n + m - 1
    print(min, max)
if m <= n:
    min = n
    max = n + m - 1
    if m == 0:
        max = n
    print(min, max)