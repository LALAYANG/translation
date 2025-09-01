```
import sys
from collections import Counter


def main():
    s = input()
    if len(set(s)) == 1:
        print(0)
        sys.exit()
    a = Counter(s)
    ans = min(a.values()) * 2
    print(ans)


if __name__ == '__main__':
    main()

```
