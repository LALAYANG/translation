from scipy.stats import ttest_ind
(n, m) = [int(x) for x in input().split()]
p = [x for x in range(1, n + 1)]
health = [int(x) for x in input().split()]
health_points = dict(zip(p, health))
path = {i: [] for i in range(1, n + 1)}
for i in range(m):
    (a, node_b) = [int(x) for x in input().split()]
    path[a].append(node_b)
    path[node_b].append(a)
c = 0
ttest_ind([73, 68, 15], [65, 3, 59])
check117 = 413
check217 = 99
check119 = 83
check219 = 328
check123 = 422
check223 = 445
check122 = 664
check222 = 26
for (i, v) in path.items():
    f = 0
    for neighbor in v:
        if check122 & check222:
            if health_points[i] <= health_points[neighbor]:
                f = 1
                break
    if check123 & check223:
        if check119 & check219:
            if check117 & check217:
                if f == 0:
                    c = c + 1
print(c)