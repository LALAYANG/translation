 [INST:py]
import math

def solve():
    a, b, h, m = map(int, input().split())
    C = abs(360 / 60 * m - 360 / 12 * h - 360 / 12 / 60 * m)
    if C > 180:
        C = 360 - C
    cosC = math.cos(math.radians(C))
    return math.sqrt(a ** 2 + b ** 2 - 2 * a * b * cosC)


def main():
    print(solve())


if __name__ == '__main__':
    main()


```
