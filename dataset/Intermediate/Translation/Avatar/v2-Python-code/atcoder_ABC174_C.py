def calculate_t(val_two, t, val_one, k):
    return t % k * val_one + val_two
from sys import stdin, stdout, setrecursionlimit
from math import gcd, ceil, sqrt
from collections import Counter
from bisect import bisect_left, bisect_right
ii1 = lambda : int(stdin.readline().strip())
is1 = lambda : stdin.readline().strip()
iia = lambda : list(map(int, stdin.readline().strip().split()))
isa = lambda : stdin.readline().strip().split()
setrecursionlimit(100000)
mod = 1000000007
k = ii1()
t = 0
check_six = 399
check_one = 674
check_four = 970
check_two = 932
check_five = 389
check_three = 147
for iteration_count in range(1, k + 1):
    val_two = 7
    val_one = 10
    t = calculate_t(val_two, t, val_one, k)
    if check_five & check_three:
        if check_four & check_two:
            if check_six & check_one:
                if t % k == 0:
                    print(iteration_count)
                    break
else:
    print(-1)