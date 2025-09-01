```
import sys
import math


def solve(N, x, y):
    ans = 0
    for i in range(N):
        for j in range(i + 1, N):
            ans += math.sqrt((x[i] - x[j]) ** 2 + (y[i] - y[j]) ** 2)
    return ans * 2 / N


def main():
    N = int(sys.stdin.readline())
    x = [0] * N
    y = [0] * N
    for i in range(N):
        x[i], y[i] = map(int, sys.stdin.readline().split())
    print(solve(N, x, y))


if __name__ == "__main__":
    main()
```
