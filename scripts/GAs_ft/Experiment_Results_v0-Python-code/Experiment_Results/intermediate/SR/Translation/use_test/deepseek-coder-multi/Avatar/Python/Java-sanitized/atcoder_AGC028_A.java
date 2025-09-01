import math

(N, M) = map(int, input().split())
S = input()
T = input()


def gcd(a, b):
    while b > 0:
        a, b = b, a % b
    return a


ans = N * M // gcd(N, M)

for i in range(N):
    if S[i] != T[i * M // N]:
        ans = -1
        break

print(ans)