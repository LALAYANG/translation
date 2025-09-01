```
from collections import defaultdict


def main():
    n, k = map(int, input().split())
    l = list(map(int, input().split()))
    l.insert(0, -1)
    path = [1]
    ind = 0
    count = 0
    x = 1
    t = -1
    flag = False
    Hash = defaultdict(lambda: 0)

    for i in range(n + 1):
        ne = l[x]
        if Hash[ne]:
            flag = True
            t = Hash[ne]
            break
        path.append(ne)
        ind += 1
        Hash[ne] = ind
        x = ne
    if flag:
        loop = path[t:]
        if k < len(path):
            print(path[k])
        else:
            k = k - len(path)
            k = k % len(loop)
            print(loop[k])
    else:
        print(path[k - 1])


if __name__ == "__main__":
    main()

```
