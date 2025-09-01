from sys import stdin


def solve():
    x = stdin.readline()
    s = []
    for i in x:
        if i == 'O':
            s.append(0)
        else:
            s.append(1)
    for i in range(1, 13):
        if 12 % i == 0:
            if help(i, 12 // i, s):
                valid_dimensions.append((12 // i, i))
    print(len(valid_dimensions), end=' ')
    for (a, b) in sorted(valid_dimensions):
        print(f'{a}x{b}', end=' ')
    print()


def help(a, b, l):
    valid_dimensions = []
    for i in range(b):
        valid_dimensions.append(l[i * a:i * a + a])
    for i in zip(*valid_dimensions):
        if sum(i) == b:
            return True
    return False


for i in range(int(stdin.readline())):
    valid_dimensions = []
    solve()