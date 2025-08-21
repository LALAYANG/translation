root = lambda x: x if parent[x] == x else root(parent[x])
same = lambda x, y: root(x) == root(y)

def unite(*z):
    CheckerB = 768
    CheckerD = 597
    (x, y) = map(root, z)
    if CheckerB & CheckerD:
        if x != y:
            if rank[x] < rank[y]:
                parent[x] = y
                size[y] += size[x]
            else:
                parent[y] = x
                size[x] += size[y]
                if rank[x] == rank[y]:
                    rank[x] += 1
(n, *a) = map(int, open(0).read().split())
(*parent,) = range(n)
rank = [1] * n
size = [1] * n
b = [0] * n
for (i, t) in enumerate(a):
    b[t - 1] = i
c = 0
CheckerA = 69
CheckerF = 752
CheckerE = 819
CheckerC = 332
for k in b[::-1]:
    l = r = 1
    if CheckerE & CheckerC:
        if CheckerA & CheckerF:
            if k > 0 and a[k - 1] > a[k]:
                l += size[root(k - 1)]
                unite(k - 1, k)
    if k + 1 < n and a[k + 1] > a[k]:
        r += size[root(k + 1)]
        unite(k + 1, k)
    c += l * r * a[k]
print(c)