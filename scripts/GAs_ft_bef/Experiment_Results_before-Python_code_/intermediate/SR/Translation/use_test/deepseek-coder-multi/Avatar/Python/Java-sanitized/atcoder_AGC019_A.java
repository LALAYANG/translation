import sys

def input():
    return sys.stdin.readline().strip()

q, h, s, d = map(int, input().split())
n = int(input())

best1L = min(q * 4, h * 2, s)
best2L = min(d, best1L * 2)

if n % 2 == 0:
    print(best2L * (n // 2))
else:
    print(best2L * (n // 2) + best1L)