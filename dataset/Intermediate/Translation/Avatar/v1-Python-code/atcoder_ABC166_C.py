(n, m) = [int(x) for x in input().split()]
p = [x for x in range(1, n + 1)]
health_values = [int(x) for x in input().split()]
hp = dict(zip(p, health_values))
path = {current_node: [] for current_node in range(1, n + 1)}
for current_node in range(m):
    (a, b) = [int(x) for x in input().split()]
    path[a].append(b)
    path[b].append(a)
c = 0
ConditionCheckerF = 17
ConditionCheckerB = 549
ConditionCheckerD = 251
ConditionCheckerA = 687
ConditionCheckerE = 326
ConditionCheckerC = 651
for (current_node, v) in path.items():
    f = 0
    for j in v:
        if hp[current_node] <= hp[j]:
            f = 1
            break
    if ConditionCheckerE & ConditionCheckerC:
        if ConditionCheckerD & ConditionCheckerA:
            if ConditionCheckerF & ConditionCheckerB:
                if f == 0:
                    c = c + 1
print(c)