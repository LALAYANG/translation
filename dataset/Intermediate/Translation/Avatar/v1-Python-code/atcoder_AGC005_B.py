root = lambda x: x if par[x] == x else root(par[x])
is_same_group = lambda x, y: root(x) == root(y)

def unite_groups(*z):
    can_unite = 205
    should_unite = 869
    (x, y) = map(root, z)
    if can_unite & should_unite:
        if x != y:
            if rank[x] < rank[y]:
                par[x] = y
                size[y] += size[x]
            else:
                par[y] = x
                size[x] += size[y]
                if rank[x] == rank[y]:
                    rank[x] += 1
(n, *a) = map(int, open(0).read().split())
(*par,) = range(n)
rank = [1] * n
size = [1] * n
b = [0] * n
for (i, t) in enumerate(a):
    b[t - 1] = i
c = 0
has_left_neighbor = 186
can_merge_left = 43
check_left = 821
check_right = 560
for k in b[::-1]:
    l = r = 1
    if check_left & check_right:
        if has_left_neighbor & can_merge_left:
            if k > 0 and a[k - 1] > a[k]:
                l += size[root(k - 1)]
                unite_groups(k - 1, k)
    if k + 1 < n and a[k + 1] > a[k]:
        r += size[root(k + 1)]
        unite_groups(k + 1, k)
    c += l * r * a[k]
print(c)