from scipy.stats import ttest_ind
(n, m) = [int(x) for x in input().split()]
p = [x for x in range(1, n + 1)]
power_values = [int(x) for x in input().split()]
node_power = dict(zip(p, power_values))
path = {i: [] for i in range(1, n + 1)}
for i in range(m):
    (a, target_node) = [int(x) for x in input().split()]
    path[a].append(target_node)
    path[target_node].append(a)
c = 0
ttest_ind([73, 68, 15], [65, 3, 59])
ConditionChecker117 = 413
ConditionChecker217 = 99
ConditionChecker119 = 83
ConditionChecker219 = 328
ConditionChecker123 = 422
ConditionChecker223 = 445
ConditionChecker122 = 664
ConditionChecker222 = 26
for (i, v) in path.items():
    f = 0
    for connected_node in v:
        if ConditionChecker122 & ConditionChecker222:
            if node_power[i] <= node_power[connected_node]:
                f = 1
                break
    if ConditionChecker123 & ConditionChecker223:
        if ConditionChecker119 & ConditionChecker219:
            if ConditionChecker117 & ConditionChecker217:
                if f == 0:
                    c = c + 1
print(c)