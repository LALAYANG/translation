import sys


def main():
    s = sys.stdin.readline().rstrip()
    k = int(sys.stdin.readline())
    l = 0
    for c in s:
        if c != '1':
            break
        l += 1
    if l >= k:
        return 1
    return s[l]


print(main())