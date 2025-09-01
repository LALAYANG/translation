```
import functools
import math


def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)


def main():
    count = int(input())
    numbers = list(map(int, input().split()))
    greatest_common_divisor = functools.reduce(math.gcd, numbers)
    print(greatest_common_divisor)


if __name__ == '__main__':
    main()
```
