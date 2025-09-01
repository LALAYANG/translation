import sys
from itertools import accumulate


def solve(N, X, A):
    S = list(accumulate(A))
    ans = float("inf")
    for k, s in enumerate(S, 1):
        E = k * X + 2 * sum(S[j] for j in range(N - 2 * k - 1, -1, -k))
        ans = min(ans, E)
    return ans + N * X + 5 * S[-1]


def main():
    N, X = map(int, sys.stdin.readline().split())
    A = list(map(int, sys.stdin.readline().split()))
    print(solve(N, X, A))


if __name__ == "__main__":
    main()